
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxResidencyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxResidencyType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DMST"/&gt;
 *     &lt;enumeration value="FRGN"/&gt;
 *     &lt;enumeration value="MIXD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxResidencyType1Code")
@XmlEnum
public enum TaxResidencyType1Code {


    /**
     * Residency is domestic.
     * 
     */
    DMST,

    /**
     * Residency is foreign.
     * 
     */
    FRGN,

    /**
     * Residency is mixed.
     * 
     */
    MIXD;

    public String value() {
        return name();
    }

    public static TaxResidencyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
