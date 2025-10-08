
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateTaxType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateTaxType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SMBS"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateTaxType1Code")
@XmlEnum
public enum CorporateTaxType1Code {


    /**
     * Small Business
     * 
     */
    SMBS,

    /**
     * Other
     * 
     */
    OTHR,

    /**
     * Corporate
     * 
     */
    CORP;

    public String value() {
        return name();
    }

    public static CorporateTaxType1Code fromValue(String v) {
        return valueOf(v);
    }

}
