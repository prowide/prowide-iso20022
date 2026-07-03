
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonIdentificationType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonIdentificationType7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATIN"/&gt;
 *     &lt;enumeration value="GTIN"/&gt;
 *     &lt;enumeration value="ITIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonIdentificationType7Code")
@XmlEnum
public enum PersonIdentificationType7Code {


    /**
     * Temporary tax processing number (used in the domestic adoption of a child).
     * 
     */
    ATIN,

    /**
     * Generic tax identification number.
     * 
     */
    GTIN,

    /**
     * Tax processing number.
     * 
     */
    ITIN;

    public String value() {
        return name();
    }

    public static PersonIdentificationType7Code fromValue(String v) {
        return valueOf(v);
    }

}
