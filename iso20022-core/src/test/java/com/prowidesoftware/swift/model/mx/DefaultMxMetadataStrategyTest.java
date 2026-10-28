package com.prowidesoftware.swift.model.mx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.prowidesoftware.swift.model.AbstractMessage;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.SwiftMessageUtils;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class DefaultMxMetadataStrategyTest {

    private static final String PACS008 = "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08\">"
            + "<FIToFICstmrCdtTrf>"
            + "<GrpHdr><MsgId>M1</MsgId><CreDtTm>2024-01-01T10:00:00</CreDtTm><NbOfTxs>1</NbOfTxs></GrpHdr>"
            + "<CdtTrfTxInf><PmtId><EndToEndId>E1</EndToEndId></PmtId>"
            + "<IntrBkSttlmAmt Ccy=\"USD\">1000.50</IntrBkSttlmAmt>"
            + "</CdtTrfTxInf></FIToFICstmrCdtTrf></Document>";

    /** A subclass customizing the canonical form keeps driving both checksums, as before 10.4.1 */
    @Test
    void overriddenCanonicalizationStillAppliesToChecksums() {
        DefaultMxMetadataStrategy custom = new DefaultMxMetadataStrategy() {
            @Override
            protected String canonicalizeXml(String xml) {
                return xml.contains("AppHdr") ? "full" : "body";
            }
        };
        AbstractMX mx = AbstractMX.parse(PACS008);
        assertNotNull(mx);
        assertEquals(SwiftMessageUtils.md5("body"), custom.checksum(mx));
        assertEquals(SwiftMessageUtils.md5("body"), custom.checksumBody(mx));
    }

    /**
     * Inside a metadata scope the node tree of a message is built once and reused by every strategy call, so a
     * change to the model inside the scope is not seen; outside the scope every call reflects the model.
     */
    @Test
    void metadataScopeReusesTheTreeOfTheSameMessage() {
        DefaultMxMetadataStrategy strategy = new DefaultMxMetadataStrategy();
        MxPacs00800108 mx = (MxPacs00800108) AbstractMX.parse(PACS008);
        assertNotNull(mx);

        String outside = strategy.checksumBody(mx);
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setMsgId("M2");
        assertNotEquals(outside, strategy.checksumBody(mx), "outside a scope every call reflects the model");

        try (MxMetadataScope scope = MxMetadataScope.open()) {
            String first = strategy.checksumBody(mx);
            assertEquals("M2", strategy.reference(mx).orElse(null));
            mx.getFIToFICstmrCdtTrf().getGrpHdr().setMsgId("M3");
            assertEquals(first, strategy.checksumBody(mx), "inside the scope the tree is reused");
            assertEquals("M2", strategy.reference(mx).orElse(null), "inside the scope the tree is reused");
        }
        assertEquals("M3", strategy.reference(mx).orElse(null), "after the scope the model is read again");
    }

    @Test
    void metadataScopeIsPerMessage() {
        DefaultMxMetadataStrategy strategy = new DefaultMxMetadataStrategy();
        AbstractMX one = AbstractMX.parse(PACS008);
        AbstractMX two = AbstractMX.parse(PACS008.replace("M1", "M2"));
        try (MxMetadataScope scope = MxMetadataScope.open()) {
            assertEquals("M1", strategy.reference(one).orElse(null));
            assertEquals("M2", strategy.reference(two).orElse(null));
            assertEquals("M1", strategy.reference(one).orElse(null));
        }
    }

    /**
     * MxSwiftMessage runs every strategy call of one message inside a single metadata scope, which is what lets
     * the default strategy build the node tree once instead of once per metadata.
     */
    @Test
    void mxSwiftMessageRunsTheStrategyInsideOneMetadataScope() {
        boolean[] seen = new boolean[2];
        DefaultMxMetadataStrategy strategy = new DefaultMxMetadataStrategy() {
            @Override
            public Optional<String> reference(AbstractMessage message) {
                seen[0] = MxMetadataScope.current() != null;
                return super.reference(message);
            }

            @Override
            public String checksumBody(AbstractMessage message) {
                seen[1] = MxMetadataScope.current() != null;
                return super.checksumBody(message);
            }
        };
        MxSwiftMessage msg = new MxSwiftMessage(PACS008, strategy);
        assertEquals("M1", msg.getReference());
        assertTrue(seen[0], "reference not called inside a metadata scope");
        assertTrue(seen[1], "checksumBody not called inside a metadata scope");
        assertEquals(null, MxMetadataScope.current(), "scope not closed after the extraction");
    }

    @Test
    void defaultChecksumsMatchTheCanonicalFormOfTheSerializedMessage() {
        DefaultMxMetadataStrategy strategy = new DefaultMxMetadataStrategy();
        AbstractMX mx = AbstractMX.parse(PACS008);
        assertNotNull(mx);
        String expected = SwiftMessageUtils.md5(
                com.prowidesoftware.swift.model.MxNode.parse(mx.document()).toCanonicalString());
        assertEquals(expected, strategy.checksum(mx));
        assertEquals(expected, strategy.checksumBody(mx));
    }
}
