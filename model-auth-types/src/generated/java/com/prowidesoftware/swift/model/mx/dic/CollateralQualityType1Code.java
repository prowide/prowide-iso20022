
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralQualityType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralQualityType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INVG"/>
 *     <enumeration value="NIVG"/>
 *     <enumeration value="NOTR"/>
 *     <enumeration value="NOAP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralQualityType1Code")
@XmlEnum
public enum CollateralQualityType1Code {


    /**
     * Security that is classified as investment grade according to external ratings.
     * 
     */
    INVG,

    /**
     * Security with a rating different than investment grade.
     * 
     */
    NIVG,

    /**
     * Security without a rating assigned.
     * 
     */
    NOTR,

    /**
     * Collateral quality type is not applicable.
     * 
     */
    NOAP;

    public String value() {
        return name();
    }

    public static CollateralQualityType1Code fromValue(String v) {
        return valueOf(v);
    }

}
