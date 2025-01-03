
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralSubstitutionSequence1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralSubstitutionSequence1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INIT"/>
 *     <enumeration value="UPDD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralSubstitutionSequence1Code")
@XmlEnum
public enum CollateralSubstitutionSequence1Code {


    /**
     * Indicates this is a new collateral substitution request.
     * 
     */
    INIT,

    /**
     * Indicates this is an updated collateral substitution request.
     * 
     */
    UPDD;

    public String value() {
        return name();
    }

    public static CollateralSubstitutionSequence1Code fromValue(String v) {
        return valueOf(v);
    }

}
