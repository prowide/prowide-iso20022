/*
 * Copyright 2006-2021 Prowide
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

import com.prowidesoftware.swift.model.MxBusinessProcess;
import com.prowidesoftware.swift.model.MxId;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class MxParseUtilsTest {

    @Test
    public void testIdentifyMessage_01() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_02() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Foo:Document xmlns:Foo=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_03() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"></Doc:Document>";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_04() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_05() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_06() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:swift.eni$camt.003.001.04\"></Doc:Document>";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    void assertMxId(MxId id) {
        assertNotNull(id, "detected id is null");
        assertEquals(MxBusinessProcess.camt, id.getBusinessProcess());
        assertEquals("003", id.getFunctionality());
        assertEquals("001", id.getVariant());
        assertEquals("04", id.getVersion());
    }

    /**
     * Test that external entities feature is disabled in the XML parsing to avoid XXE (external entity injection)
     * <p>This one is not affected by XXE because it only reads and returns the MxId and entity cannot be used in the
     * XML namespace.
     */
    @Test
    public void testXxeDisabledInDetectMessage() {
        final String xml = "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file:///etc/passwd\" >]>" +
                "<Doc:Document xmlns:Doc=\"urn:swift:xsd:swift.eni$camt.003.001.04\">&xxe;</Doc:Document>";
        Optional<MxId> id = MxParseUtils.identifyMessage(xml);
        assertTrue(id.isPresent());
    }

}
