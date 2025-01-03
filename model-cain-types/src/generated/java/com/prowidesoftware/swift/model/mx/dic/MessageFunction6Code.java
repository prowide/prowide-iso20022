
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RCAV"/>
 *     <enumeration value="RCAN"/>
 *     <enumeration value="RCAQ"/>
 *     <enumeration value="REJA"/>
 *     <enumeration value="REVV"/>
 *     <enumeration value="REVN"/>
 *     <enumeration value="REVQ"/>
 *     <enumeration value="RCPV"/>
 *     <enumeration value="RCPN"/>
 *     <enumeration value="RCPQ"/>
 *     <enumeration value="REJP"/>
 *     <enumeration value="AUTV"/>
 *     <enumeration value="AUTN"/>
 *     <enumeration value="AUTQ"/>
 *     <enumeration value="AUTP"/>
 *     <enumeration value="FNCV"/>
 *     <enumeration value="FNCN"/>
 *     <enumeration value="FNCQ"/>
 *     <enumeration value="RCIV"/>
 *     <enumeration value="RCIN"/>
 *     <enumeration value="RCIQ"/>
 *     <enumeration value="REJI"/>
 *     <enumeration value="KEYV"/>
 *     <enumeration value="KEYQ"/>
 *     <enumeration value="MGTV"/>
 *     <enumeration value="MGTQ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction6Code")
@XmlEnum
public enum MessageFunction6Code {


    /**
     * Advice of transaction totals from an acquirer.
     * 
     */
    RCAV,

    /**
     * Notification of transaction totals from an acquirer.
     * 
     */
    RCAN,

    /**
     * Request of transaction totals exchange from an acquirer.
     * 
     */
    RCAQ,

    /**
     * Reject of a message by an acquirer.
     * 
     */
    REJA,

    /**
     * Reversal advice of an authorisation or a financial message.
     * 
     */
    REVV,

    /**
     * Reversal notification of an authorisation or a financial message.
     * 
     */
    REVN,

    /**
     * Reversal request of an authorisation or a financial message.
     * 
     */
    REVQ,

    /**
     * Advice of transaction totals from a processor.
     * 
     */
    RCPV,

    /**
     * Notification of transaction totals from a processor.
     * 
     */
    RCPN,

    /**
     * Request of transaction totals exchange from a processor.
     * 
     */
    RCPQ,

    /**
     * Reject of a message by an agent.
     * 
     */
    REJP,

    /**
     * Initiator of the message advises the recipient about the result of an authorisation already performed.
     * 
     */
    AUTV,

    /**
     * Information about an authorisation.
     * 
     */
    AUTN,

    /**
     * The initiator requests an authorisation without financial impact to complete the transaction.
     * 
     */
    AUTQ,

    /**
     * Response for authorisation without financial capture.
     * 
     */
    AUTP,

    /**
     * Initiator of the message advises the receptor that an authorisation has been successfully delivered or completed with a final amount, and requests the clearing of the transaction.
     * 
     */
    FNCV,

    /**
     * Initiator requests the clearing of the transaction.
     * 
     */
    FNCN,

    /**
     * Initiator of the message requests both the authorisation and the clearing of the transaction.
     * 
     */
    FNCQ,

    /**
     * Advice of transaction totals from an issuer.
     * 
     */
    RCIV,

    /**
     * Notification of transaction totals from an issuer.
     * 
     */
    RCIN,

    /**
     * Request of transaction totals exchange from an issuer.
     * 
     */
    RCIQ,

    /**
     * Reject of a message by an issuer.
     * 
     */
    REJI,

    /**
     * Advise of a performed key update.
     * 
     */
    KEYV,

    /**
     * Request of a key exchange.
     * 
     */
    KEYQ,

    /**
     * Advise of a performed network management service.
     * 
     */
    MGTV,

    /**
     * Request of a network management service.
     * 
     */
    MGTQ;

    public String value() {
        return name();
    }

    public static MessageFunction6Code fromValue(String v) {
        return valueOf(v);
    }

}
