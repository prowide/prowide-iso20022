
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RateType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IMPU"/>
 *     <enumeration value="PREC"/>
 *     <enumeration value="TIER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RateType3Code")
@XmlEnum
public enum RateType3Code {


    /**
     * Imputed tax.
     * 
     */
    IMPU,

    /**
     * Rate is a precompte.
     * 
     */
    PREC,

    /**
     * Rate is a one tier tax.
     * 
     */
    TIER;

    public String value() {
        return name();
    }

    public static RateType3Code fromValue(String v) {
        return valueOf(v);
    }

}
