
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionCalculationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionCalculationMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PROR"/>
 *     <enumeration value="LOTT"/>
 *     <enumeration value="NOMI"/>
 *     <enumeration value="NNOM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionCalculationMethod1Code")
@XmlEnum
public enum CorporateActionCalculationMethod1Code {


    /**
     * Pro-rata for drawings.
     * 
     */
    PROR,

    /**
     * Lottery for drawings.
     * 
     */
    LOTT,

    /**
     * Reduction of nominal for partial redemption.
     * 
     */
    NOMI,

    /**
     * Without reduction of nominal (via pool factor) for partial redemption.
     * 
     */
    NNOM;

    public String value() {
        return name();
    }

    public static CorporateActionCalculationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
