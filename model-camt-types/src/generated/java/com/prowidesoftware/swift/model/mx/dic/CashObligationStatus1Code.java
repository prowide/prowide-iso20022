
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashObligationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashObligationStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTL"/&gt;
 *     &lt;enumeration value="PRJD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashObligationStatus1Code")
@XmlEnum
public enum CashObligationStatus1Code {


    /**
     * Report contains the information related to the actual cash obligation.
     * 
     */
    ACTL,

    /**
     * Report contains the information related to the projected cash obligation.
     * 
     */
    PRJD;

    public String value() {
        return name();
    }

    public static CashObligationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
