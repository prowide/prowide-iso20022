
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartiallySettledStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartiallySettledStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UPST"/&gt;
 *     &lt;enumeration value="CPST"/&gt;
 *     &lt;enumeration value="UCPS"/&gt;
 *     &lt;enumeration value="HOLA"/&gt;
 *     &lt;enumeration value="HOLL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartiallySettledStatusReason1Code")
@XmlEnum
public enum PartiallySettledStatusReason1Code {


    /**
     * Units are partially settled.
     * 
     */
    UPST,

    /**
     * Cash is partially settled.
     * 
     */
    CPST,

    /**
     * Units and cash are both partially settled.
     * 
     */
    UCPS,

    /**
     * Final redemption proceeds are held back, pending annual financial audit approval.
     * 
     */
    HOLA,

    /**
     * Final redemption proceeds are held back as the fund has been liquidated and is pending audit approval.
     * 
     */
    HOLL;

    public String value() {
        return name();
    }

    public static PartiallySettledStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
