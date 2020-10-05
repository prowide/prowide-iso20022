/*
 * Copyright 2006-2020 Prowide
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * @since 9.0.1
 */
public class LegacyAppHdrTest {

    @Test
    public void testParseNoNamespace() {
        final String xml = "<AppHdr>\n" +
                "    <From>\n" +
                "        <Type>DN</Type>\n" +
                "        <Id>cn=funds,ou=abcdchzz,o=swift</Id>\n" +
                "    </From>\n" +
                "    <To>\n" +
                "        <Type>DN</Type>\n" +
                "        <Id>cn=funds,ou=dcbadeff,o=swift</Id>\n" +
                "    </To>\n" +
                "    <MsgRef>11308917</MsgRef>\n" +
                "    <CrDate>2013-12-23T15:50:00</CrDate>\n" +
                "</AppHdr>";
        LegacyAppHdr h = LegacyAppHdr.parse(xml);
        assertNotNull(h);
        //System.out.println(h.xml());
        assertEquals("DN", h.getFrom().getType());
        assertEquals("cn=funds,ou=abcdchzz,o=swift", h.getFrom().getId());
        assertEquals("DN", h.getTo().getType());
        assertEquals("cn=funds,ou=dcbadeff,o=swift", h.getTo().getId());
        assertEquals("11308917", h.getMsgRef());
        assertNotNull(h.getCrDate());
    }

    @Test
    public void testParseNoPrefix() {
        final String xml = "<AppHdr xmlns=\"urn:swift:xsd:$ahV10\">\n" +
                "    <From>\n" +
                "        <Type>DN</Type>\n" +
                "        <Id>cn=funds,ou=abcdchzz,o=swift</Id>\n" +
                "    </From>\n" +
                "    <To>\n" +
                "        <Type>DN</Type>\n" +
                "        <Id>cn=funds,ou=dcbadeff,o=swift</Id>\n" +
                "    </To>\n" +
                "    <MsgRef>11308917</MsgRef>\n" +
                "    <CrDate>2013-12-23T15:50:00</CrDate>\n" +
                "</AppHdr>";
        LegacyAppHdr h = LegacyAppHdr.parse(xml);
        assertNotNull(h);
        //System.out.println(h.xml());
        assertEquals("DN", h.getFrom().getType());
        assertEquals("cn=funds,ou=abcdchzz,o=swift", h.getFrom().getId());
        assertEquals("DN", h.getTo().getType());
        assertEquals("cn=funds,ou=dcbadeff,o=swift", h.getTo().getId());
        assertEquals("11308917", h.getMsgRef());
        assertNotNull(h.getCrDate());
    }

    @Test
    public void testParseWithPrefix() {
        final String xml = "<h:AppHdr xmlns:h=\"urn:swift:xsd:$ahV10\">\n" +
                "    <h:From>\n" +
                "        <h:Type>DN</h:Type>\n" +
                "        <h:Id>cn=funds,ou=abcdchzz,o=swift</h:Id>\n" +
                "    </h:From>\n" +
                "    <h:To>\n" +
                "        <h:Type>DN</h:Type>\n" +
                "        <h:Id>cn=funds,ou=dcbadeff,o=swift</h:Id>\n" +
                "    </h:To>\n" +
                "    <h:MsgRef>11308917</h:MsgRef>\n" +
                "    <h:CrDate>2013-12-23T15:50:00</h:CrDate>\n" +
                "</h:AppHdr>";
        LegacyAppHdr h = LegacyAppHdr.parse(xml);
        assertNotNull(h);
        //System.out.println(h.xml());
        assertEquals("DN", h.getFrom().getType());
        assertEquals("cn=funds,ou=abcdchzz,o=swift", h.getFrom().getId());
        assertEquals("DN", h.getTo().getType());
        assertEquals("cn=funds,ou=dcbadeff,o=swift", h.getTo().getId());
        assertEquals("11308917", h.getMsgRef());
        assertNotNull(h.getCrDate());
    }

    @Test
    public void testParseWithWrapper() {
        final String xml = "<foo><bar>"+
                "<AppHdr xmlns:Ah=\"urn:swift:xsd:$ahV10\">\n" +
                "    <From>\n" +
                "        <Type>DN</Type>\n" +
                "        <Id>cn=funds,ou=abcdchzz,o=swift</Id>\n" +
                "    </From>\n" +
                "    <To>\n" +
                "        <Type>DN</Type>\n" +
                "        <Id>cn=funds,ou=dcbadeff,o=swift</Id>\n" +
                "    </To>\n" +
                "    <MsgRef>11308917</MsgRef>\n" +
                "    <CrDate>2013-12-23T15:50:00</CrDate>\n" +
                "</AppHdr>"+
                "</bar></foo>";
        LegacyAppHdr h = LegacyAppHdr.parse(xml);
        assertNotNull(h);
        //System.out.println(h.xml());
        assertEquals("DN", h.getFrom().getType());
        assertEquals("cn=funds,ou=abcdchzz,o=swift", h.getFrom().getId());
        assertEquals("DN", h.getTo().getType());
        assertEquals("cn=funds,ou=dcbadeff,o=swift", h.getTo().getId());
        assertEquals("11308917", h.getMsgRef());
        assertNotNull(h.getCrDate());
    }

}
