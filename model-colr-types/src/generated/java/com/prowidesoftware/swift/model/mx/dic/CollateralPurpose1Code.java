
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralPurpose1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralPurpose1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VAMA"/&gt;
 *     &lt;enumeration value="SINA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollateralPurpose1Code")
@XmlEnum
public enum CollateralPurpose1Code {


    /**
     * Collateral has been posted against the variation margin.
     * 
     */
    VAMA,

    /**
     * Collateral has been posted against the segregated independent amount.
     * 
     */
    SINA;

    public String value() {
        return name();
    }

    public static CollateralPurpose1Code fromValue(String v) {
        return valueOf(v);
    }

}
