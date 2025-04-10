
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseForwardingNotification2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CaseForwardingNotification2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FTHI"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="MODI"/>
 *     <enumeration value="DTAU"/>
 *     <enumeration value="SAIN"/>
 *     <enumeration value="FIAG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CaseForwardingNotification2Code")
@XmlEnum
public enum CaseForwardingNotification2Code {


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
     * Case is taken up by an assigned agent.
     * 
     */
    FIAG;

    public String value() {
        return name();
    }

    public static CaseForwardingNotification2Code fromValue(String v) {
        return valueOf(v);
    }

}
