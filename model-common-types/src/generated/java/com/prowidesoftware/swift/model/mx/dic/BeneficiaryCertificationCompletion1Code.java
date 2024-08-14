
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiaryCertificationCompletion1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BeneficiaryCertificationCompletion1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NCER"/>
 *     <enumeration value="ELEC"/>
 *     <enumeration value="PHYS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BeneficiaryCertificationCompletion1Code")
@XmlEnum
public enum BeneficiaryCertificationCompletion1Code {


    /**
     * Certification is not required for this fund.
     * 
     */
    NCER,

    /**
     * Electronic certification is acceptable.
     * 
     */
    ELEC,

    /**
     * Electronic certification is not acceptable and is required in physical form.
     * 
     */
    PHYS;

    public String value() {
        return name();
    }

    public static BeneficiaryCertificationCompletion1Code fromValue(String v) {
        return valueOf(v);
    }

}
