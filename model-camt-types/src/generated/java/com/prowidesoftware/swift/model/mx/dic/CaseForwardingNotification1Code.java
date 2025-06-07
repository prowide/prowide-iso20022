
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseForwardingNotification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseForwardingNotification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FTHI"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="MODI"/&gt;
 *     &lt;enumeration value="DTAU"/&gt;
 *     &lt;enumeration value="SAIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CaseForwardingNotification1Code")
@XmlEnum
public enum CaseForwardingNotification1Code {


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
    SAIN;

    public String value() {
        return name();
    }

    public static CaseForwardingNotification1Code fromValue(String v) {
        return valueOf(v);
    }

}
