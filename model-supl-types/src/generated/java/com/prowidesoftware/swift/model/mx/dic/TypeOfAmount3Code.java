
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSHB"/&gt;
 *     &lt;enumeration value="GRTY"/&gt;
 *     &lt;enumeration value="SRVF"/&gt;
 *     &lt;enumeration value="INTC"/&gt;
 *     &lt;enumeration value="ORIG"/&gt;
 *     &lt;enumeration value="SRCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount3Code")
@XmlEnum
public enum TypeOfAmount3Code {


    /**
     * Cash-back amount.
     * 
     */
    CSHB,

    /**
     * Gratuity amount.
     * 
     */
    GRTY,

    /**
     * Service fee.
     * 
     */
    SRVF,

    /**
     * Interchange fee.
     * 
     */
    INTC,

    /**
     * Original amount authorised during the real-time authorisation process.
     * 
     */
    ORIG,

    /**
     * Extra fee for a purchase or a withdrawal.
     * 
     */
    SRCH;

    public String value() {
        return name();
    }

    public static TypeOfAmount3Code fromValue(String v) {
        return valueOf(v);
    }

}
