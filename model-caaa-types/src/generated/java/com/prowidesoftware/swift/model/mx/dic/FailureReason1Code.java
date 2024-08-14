
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FailureReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CUCL"/>
 *     <enumeration value="MALF"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="UCMP"/>
 *     <enumeration value="USND"/>
 *     <enumeration value="TIMO"/>
 *     <enumeration value="CDCL"/>
 *     <enumeration value="NDCL"/>
 *     <enumeration value="FDCL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FailureReason1Code")
@XmlEnum
public enum FailureReason1Code {


    /**
     * Customer cancellation, for example removing the card before the end of the transaction.
     * 
     */
    CUCL,

    /**
     * Suspected malfunction.
     * 
     */
    MALF,

    /**
     * Completed partially.
     * 
     */
    PART,

    /**
     * Response to the previous message was received too late.
     * 
     */
    LATE,

    /**
     * Unable to complete the transaction after the authorisation response.
     * 
     */
    UCMP,

    /**
     * Unable to deliver the request message to the recipient party.
     * 
     */
    USND,

    /**
     * Timeout while waiting for a response to a request message, or no response was received (for example connection release before receiving the response).
     * 
     */
    TIMO,

    /**
     * Integrated circuit card declines the transaction before or after the authorisation.
     * 
     */
    CDCL,

    /**
     * Online authorisation declined the transaction.
     * 
     */
    NDCL,

    /**
     * Offline authorisation declined the transaction.
     * 
     */
    FDCL;

    public String value() {
        return name();
    }

    public static FailureReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
