
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiaryType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BeneficiaryType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEPE"/>
 *     <enumeration value="NOMI"/>
 *     <enumeration value="SUCC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BeneficiaryType1Code")
@XmlEnum
public enum BeneficiaryType1Code {


    /**
     * Beneficiary is a dependent.
     * 
     */
    DEPE,

    /**
     * Beneficiary is a nominee.
     * 
     */
    NOMI,

    /**
     * Beneficiary is a successor.
     * 
     */
    SUCC;

    public String value() {
        return name();
    }

    public static BeneficiaryType1Code fromValue(String v) {
        return valueOf(v);
    }

}
