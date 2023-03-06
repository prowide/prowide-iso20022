
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiaryType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BeneficiaryType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEPE"/&gt;
 *     &lt;enumeration value="NOMI"/&gt;
 *     &lt;enumeration value="SUCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
