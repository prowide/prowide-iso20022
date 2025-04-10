
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction43Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction43Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAUQ"/>
 *     <enumeration value="CCAQ"/>
 *     <enumeration value="CMPV"/>
 *     <enumeration value="DGNP"/>
 *     <enumeration value="RCLQ"/>
 *     <enumeration value="CCAV"/>
 *     <enumeration value="BTCH"/>
 *     <enumeration value="FRVA"/>
 *     <enumeration value="AUTQ"/>
 *     <enumeration value="FCMV"/>
 *     <enumeration value="DCCQ"/>
 *     <enumeration value="RVRA"/>
 *     <enumeration value="DCAV"/>
 *     <enumeration value="TRNA"/>
 *     <enumeration value="NFRQ"/>
 *     <enumeration value="TRPQ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction43Code")
@XmlEnum
public enum MessageFunction43Code {


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
    TRPQ;

    public String value() {
        return name();
    }

    public static MessageFunction43Code fromValue(String v) {
        return valueOf(v);
    }

}
