
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiaryCertificationCompletion1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BeneficiaryCertificationCompletion1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NCER"/&gt;
 *     &lt;enumeration value="ELEC"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
