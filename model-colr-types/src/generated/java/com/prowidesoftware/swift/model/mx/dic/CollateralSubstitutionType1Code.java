
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralSubstitutionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralSubstitutionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AVMG"/>
 *     <enumeration value="ASIA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralSubstitutionType1Code")
@XmlEnum
public enum CollateralSubstitutionType1Code {


    /**
     * Specifies if the collateral that is substituted was posted against the variation margin.
     * 
     */
    AVMG,

    /**
     * Specifies if the collateral that is substituted was posted against the independent amount.
     * 
     */
    ASIA;

    public String value() {
        return name();
    }

    public static CollateralSubstitutionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
