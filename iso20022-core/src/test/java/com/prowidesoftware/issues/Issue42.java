package com.prowidesoftware.issues;

import com.prowidesoftware.swift.model.mx.sys.MxXsys00300101;
import com.prowidesoftware.swift.model.mx.sys.dic.SwAny;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Issue42 {

    @Test
    public void test() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                " <Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.003.001.01\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwSec=\"urn:swift:snl:ns.SwSec\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\">\n" +
                "  <Doc:xsys.003.001.01>\n" +
                "   <Doc:AuthstnRfslNtfctn>\n" +
                "    <Sw:SnFRef>140901VNDZBET2AXXX0021000443</Sw:SnFRef>\n" +
                "    <Sw:ThirdPartyRefusalReason>ABCD</Sw:ThirdPartyRefusalReason>\n" +
                "    <SwInt:RequestHeader>\n" +
                "     <SwInt:Requestor>o=vndzbet2,o=swift</SwInt:Requestor>\n" +
                "     <SwInt:Responder>o=bbbnbebb,o=swift</SwInt:Responder>\n" +
                "     <SwInt:Service>CPY</SwInt:Service>\n" +
                "    </SwInt:RequestHeader>\n" +
                "   </Doc:AuthstnRfslNtfctn>\n" +
                "  </Doc:xsys.003.001.01>\n" +
                " </Doc:Document>";
        MxXsys00300101 mx = MxXsys00300101.parse(xml);
        assertNotNull(mx);

        SwAny any = mx.getXsys00300101().getAuthstnRfslNtfctn().getThirdPartyRefusalReason();
        assertNotNull(any);
    }
}
