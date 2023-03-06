
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralSubstitutionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralSubstitutionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVMG"/&gt;
 *     &lt;enumeration value="ASIA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
