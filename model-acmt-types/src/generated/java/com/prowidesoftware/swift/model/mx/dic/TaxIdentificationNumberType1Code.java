
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxIdentificationNumberType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxIdentificationNumberType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GIIN"/&gt;
 *     &lt;enumeration value="GTIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxIdentificationNumberType1Code")
@XmlEnum
public enum TaxIdentificationNumberType1Code {


    /**
     * Global intermediary tax identification number.
     * 
     */
    GIIN,

    /**
     * Tax identification number.
     * 
     */
    GTIN;

    public String value() {
        return name();
    }

    public static TaxIdentificationNumberType1Code fromValue(String v) {
        return valueOf(v);
    }

}
