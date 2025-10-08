
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction47Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageFunction47Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAUQ"/&gt;
 *     &lt;enumeration value="CCAQ"/&gt;
 *     &lt;enumeration value="CMPV"/&gt;
 *     &lt;enumeration value="DGNP"/&gt;
 *     &lt;enumeration value="RCLQ"/&gt;
 *     &lt;enumeration value="CCAV"/&gt;
 *     &lt;enumeration value="BTCH"/&gt;
 *     &lt;enumeration value="FRVA"/&gt;
 *     &lt;enumeration value="AUTQ"/&gt;
 *     &lt;enumeration value="FCMV"/&gt;
 *     &lt;enumeration value="DCCQ"/&gt;
 *     &lt;enumeration value="RVRA"/&gt;
 *     &lt;enumeration value="DCAV"/&gt;
 *     &lt;enumeration value="TRNA"/&gt;
 *     &lt;enumeration value="NFRQ"/&gt;
 *     &lt;enumeration value="TRPQ"/&gt;
 *     &lt;enumeration value="ATAF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunction47Code")
@XmlEnum
public enum MessageFunction47Code {


    /**
     * Request for authorisation with financial capture.
     * 
     */
    FAUQ,

    /**
     * Request for cancellation.
     * 
     */
    CCAQ,

    /**
     * Advice for completion without financial capture.
     * 
     */
    CMPV,

    /**
     * Request for diagnostic.
     * 
     */
    DGNP,

    /**
     * Request for reconciliation.
     * 
     */
    RCLQ,

    /**
     * Advice for cancellation.
     * 
     */
    CCAV,

    /**
     * Transfer the financial data as a collection of transction.
     * 
     */
    BTCH,

    /**
     * Advice for reversal with financial capture.
     * 
     */
    FRVA,

    /**
     * The initiator requests an authorisation without financial impact to complete the transaction.
     * 
     */
    AUTQ,

    /**
     * Advice for completion with financial capture.
     * 
     */
    FCMV,

    /**
     * Request for dynamic currency conversion.
     * 
     */
    DCCQ,

    /**
     * Advice for reversal without financial capture.
     * 
     */
    RVRA,

    /**
     * Advice for dynamic currency conversion.
     * 
     */
    DCAV,

    /**
     * Advise of the transaction's processing.
     * 
     */
    TRNA,

    /**
     * Initiator of the message requests additional information to the receiver.
     * 
     */
    NFRQ,

    /**
     * Request to receive of a report of transaction from the issuer to the receiver.
     * 
     */
    TRPQ,

    /**
     * Concatenation of multiple exchanges in one file.
     * 
     */
    ATAF;

    public String value() {
        return name();
    }

    public static MessageFunction47Code fromValue(String v) {
        return valueOf(v);
    }

}
