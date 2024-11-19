
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseForwardingNotification3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CaseForwardingNotification3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FTHI"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="MODI"/>
 *     <enumeration value="DTAU"/>
 *     <enumeration value="SAIN"/>
 *     <enumeration value="MINE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CaseForwardingNotification3Code")
@XmlEnum
public enum CaseForwardingNotification3Code {


    /**
     * Case has been forwarded to the next party for further investigation.
     * 
     */
    FTHI,

    /**
     * Case has been forwarded to the next party for cancellation.
     * 
     */
    CANC,

    /**
     * Case has been forwarded to the next party for modification.
     * 
     */
    MODI,

    /**
     * Case has been forwarded to obtain authorisation to debit.
     * 
     */
    DTAU,

    /**
     * Additional information has been forwarded to the creditor.
     * 
     */
    SAIN,

    /**
     * Case is been handled by the assigned party.
     * 
     */
    MINE;

    public String value() {
        return name();
    }

    public static CaseForwardingNotification3Code fromValue(String v) {
        return valueOf(v);
    }

}
