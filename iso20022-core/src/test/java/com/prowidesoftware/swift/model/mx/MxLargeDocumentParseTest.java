/*
 * Copyright 2006-2026 Prowide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.prowidesoftware.swift.model.mx;

import static org.junit.jupiter.api.Assertions.*;

import com.prowidesoftware.swift.model.MxNode;
import java.util.Optional;
import org.junit.jupiter.api.Test;

/**
 * Regression for parsing large XML documents that carry many escaped characters (as real large MX
 * statements do in their narrative fields).
 *
 * <p>JDK 24 lowered the default {@code jdk.xml.maxGeneralEntitySizeLimit} to 100,000 (JDK-8343006). Under
 * the secure processing enabled by {@code SafeXmlUtils}, such documents then fail to parse on Java 24/25
 * (the SAX tree comes back null, the StAX scan aborts) until the entity size limits are lifted in Prowide
 * Core ({@code SafeXmlUtils}, 10.3.17+). These tests exercise the two affected MX parsing factories via
 * the MX entry points, using a dummy payload. On Java 11 the limit default is unlimited, so they pass
 * regardless of the core version.
 */
public class MxLargeDocumentParseTest {

    // 3 predefined entity references per item x 40,000 items = 120,000 references (> the 100,000 limit)
    private static final int ITEMS = 40_000;
    private static final String MARKER = "DUMMY-MARKER";

    private static String largeEntityHeavyXml() {
        StringBuilder sb = new StringBuilder(4 * 1024 * 1024);
        sb.append("<root>");
        for (int i = 0; i < ITEMS; i++) {
            sb.append("<item><note>a &amp; b &lt; c &gt; d</note></item>");
        }
        sb.append("<marker>").append(MARKER).append("</marker>");
        sb.append("</root>");
        return sb.toString();
    }

    /**
     * SAX path ({@code SafeXmlUtils.reader}): the full tree is built and the trailing marker is reachable.
     */
    @Test
    public void mxNodeParsesLargeEntityHeavyDocument() {
        MxNode root = MxNode.parse(largeEntityHeavyXml());
        assertNotNull(root, "MxNode.parse returned null; the large entity-heavy document failed to parse");
        assertEquals(MARKER, root.findFirstByName("marker").getValue());
    }

    /**
     * StAX path ({@code SafeXmlUtils.inputFactory}): the scan reaches the marker tag past all the items.
     */
    @Test
    public void findByTagsScansLargeEntityHeavyDocument() {
        Optional<String> value = MxParseUtils.findByTags(largeEntityHeavyXml(), "marker");
        assertTrue(value.isPresent(), "findByTags returned empty; the StAX scan aborted on the large document");
        assertEquals(MARKER, value.get());
    }
}
