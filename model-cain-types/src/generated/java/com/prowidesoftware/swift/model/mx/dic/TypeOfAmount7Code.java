
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEES"/&gt;
 *     &lt;enumeration value="FEEI"/&gt;
 *     &lt;enumeration value="FEEH"/&gt;
 *     &lt;enumeration value="FEEP"/&gt;
 *     &lt;enumeration value="FEEA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount7Code")
@XmlEnum
public enum TypeOfAmount7Code {


    /**
     * Fees.
     * 
     */
    FEES,

    /**
     * Fees amount from the card issuer.
     * 
     */
    FEEI,

    /**
     * Interchange fees.
     * 
     */
    FEEH,

    /**
     * Processing fees.
     * 
     */
    FEEP,

    /**
     * International service assessment fees.
     * 
     */
    FEEA;

    public String value() {
        return name();
    }

    public static TypeOfAmount7Code fromValue(String v) {
        return valueOf(v);
    }

}
