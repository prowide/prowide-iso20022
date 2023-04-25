
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUTQ"/>
 *     <enumeration value="AUTP"/>
 *     <enumeration value="FAUQ"/>
 *     <enumeration value="FAUP"/>
 *     <enumeration value="CMPV"/>
 *     <enumeration value="CMPK"/>
 *     <enumeration value="FCMV"/>
 *     <enumeration value="FCMK"/>
 *     <enumeration value="RVRA"/>
 *     <enumeration value="RVRR"/>
 *     <enumeration value="FRVA"/>
 *     <enumeration value="FRVR"/>
 *     <enumeration value="CCAQ"/>
 *     <enumeration value="CCAP"/>
 *     <enumeration value="CCAV"/>
 *     <enumeration value="CCAK"/>
 *     <enumeration value="DGNP"/>
 *     <enumeration value="DGNQ"/>
 *     <enumeration value="RCLQ"/>
 *     <enumeration value="RCLP"/>
 *     <enumeration value="DCCQ"/>
 *     <enumeration value="DCCP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction10Code")
@XmlEnum
public enum MessageFunction10Code {


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

    public static MessageFunction10Code fromValue(String v) {
        return valueOf(v);
    }

}
