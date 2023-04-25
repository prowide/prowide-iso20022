
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartiallySettledStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartiallySettledStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UPST"/>
 *     <enumeration value="CPST"/>
 *     <enumeration value="UCPS"/>
 *     <enumeration value="HOLA"/>
 *     <enumeration value="HOLL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
