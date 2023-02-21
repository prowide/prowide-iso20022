
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageFunction4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTQ"/&gt;
 *     &lt;enumeration value="AUTP"/&gt;
 *     &lt;enumeration value="FAUQ"/&gt;
 *     &lt;enumeration value="FAUP"/&gt;
 *     &lt;enumeration value="CMPV"/&gt;
 *     &lt;enumeration value="CMPK"/&gt;
 *     &lt;enumeration value="FCMV"/&gt;
 *     &lt;enumeration value="FCMK"/&gt;
 *     &lt;enumeration value="RVRA"/&gt;
 *     &lt;enumeration value="RVRR"/&gt;
 *     &lt;enumeration value="FRVA"/&gt;
 *     &lt;enumeration value="FRVR"/&gt;
 *     &lt;enumeration value="CCAQ"/&gt;
 *     &lt;enumeration value="CCAP"/&gt;
 *     &lt;enumeration value="CCAV"/&gt;
 *     &lt;enumeration value="CCAK"/&gt;
 *     &lt;enumeration value="DGNP"/&gt;
 *     &lt;enumeration value="DGNQ"/&gt;
 *     &lt;enumeration value="RCLQ"/&gt;
 *     &lt;enumeration value="RCLP"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="DCCQ"/&gt;
 *     &lt;enumeration value="DCCP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunction4Code")
@XmlEnum
public enum MessageFunction4Code {


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
     * Request for authorisation with financial capture.
     * 
     */
    FAUQ,

    /**
     * Response for authorisation with financial capture.
     * 
     */
    FAUP,

    /**
     * Advice for completion without financial capture.
     * 
     */
    CMPV,

    /**
     * Advice response for completion without financial capture.
     * 
     */
    CMPK,

    /**
     * Advice for completion with financial capture.
     * 
     */
    FCMV,

    /**
     * Advice response for completion with financial capture.
     * 
     */
    FCMK,

    /**
     * Advice for reversal without financial capture.
     * 
     */
    RVRA,

    /**
     * Advice response for reversal without financial capture.
     * 
     */
    RVRR,

    /**
     * Advice for reversal with financial capture.
     * 
     */
    FRVA,

    /**
     * Advice response for reversal with financial capture.
     * 
     */
    FRVR,

    /**
     * Request for cancellation.
     * 
     */
    CCAQ,

    /**
     * Response for cancellation.
     * 
     */
    CCAP,

    /**
     * Advice for cancellation.
     * 
     */
    CCAV,

    /**
     * Advice response for cancellation.
     * 
     */
    CCAK,

    /**
     * Request for diagnostic.
     * 
     */
    DGNP,

    /**
     * Response for diagnostic.
     * 
     */
    DGNQ,

    /**
     * Request for reconciliation.
     * 
     */
    RCLQ,

    /**
     * Response for reconciliation.
     * 
     */
    RCLP,

    /**
     * Reject a request or an advice.
     * 
     */
    RJCT,

    /**
     * Request for dynamic currency conversion.
     * 
     */
    DCCQ,

    /**
     * Response from a dynamic currency conversion.
     * 
     */
    DCCP;

    public String value() {
        return name();
    }

    public static MessageFunction4Code fromValue(String v) {
        return valueOf(v);
    }

}
