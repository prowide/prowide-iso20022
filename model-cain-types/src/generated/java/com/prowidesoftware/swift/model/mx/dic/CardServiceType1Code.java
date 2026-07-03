
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardServiceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardServiceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="FINL"/&gt;
 *     &lt;enumeration value="PRVS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardServiceType1Code")
@XmlEnum
public enum CardServiceType1Code {


    /**
     * Partial reconciliation of the day.
     * 
     */
    PART,

    /**
     * Final reconciliation.
     * 
     */
    FINL,

    /**
     * Request for totals of a previous reconciliation.
     * 
     */
    PRVS;

    public String value() {
        return name();
    }

    public static CardServiceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
