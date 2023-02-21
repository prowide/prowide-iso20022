
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LumpSumType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LumpSumType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEAB"/&gt;
 *     &lt;enumeration value="PCLS"/&gt;
 *     &lt;enumeration value="UFPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LumpSumType1Code")
@XmlEnum
public enum LumpSumType1Code {


    /**
     * Lump sum is a death benefit lump sum.
     * 
     */
    DEAB,

    /**
     * Lump sum is a pension commencement lump sum.
     * 
     */
    PCLS,

    /**
     * Lump sum is an uncrystallised fund pension lump sum.
     * 
     */
    UFPL;

    public String value() {
        return name();
    }

    public static LumpSumType1Code fromValue(String v) {
        return valueOf(v);
    }

}
