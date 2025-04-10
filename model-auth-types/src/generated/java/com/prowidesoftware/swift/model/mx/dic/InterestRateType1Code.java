
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InterestRateType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIXE"/>
 *     <enumeration value="VARI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InterestRateType1Code")
@XmlEnum
public enum InterestRateType1Code {


    /**
     * Rate is fixed.
     * 
     */
    FIXE,

    /**
     * Rate is variable.
     * 
     */
    VARI;

    public String value() {
        return name();
    }

    public static InterestRateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
