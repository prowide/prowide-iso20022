package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.MxId;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppHdrFactoryTest {

    @Test
    void createBusinessAppHdrV01() {
        BusinessAppHdrV01 h = AppHdrFactory.createBusinessAppHdrV01("AAAAUSXXXXX", "BBBBUSXXXXX", "REF12345", new MxId("pacs.008.001.08"));
        assertNotNull(h);
        assertNull(h.getBizSvc());
        assertEquals("AAAAUSXXXXX", h.getFr().getFIId().getFinInstnId().getBICFI());
        assertEquals("BBBBUSXXXXX", h.getTo().getFIId().getFinInstnId().getBICFI());
        assertEquals("REF12345", h.getBizMsgIdr());
        assertEquals("pacs.008.001.08", h.getMsgDefIdr());

        final String xml = h.xml();
        // for BAH v01 the date time must be ISONormalisedDateTime
        assertTrue(xml.contains("Z</CreDt>"));
    }

}