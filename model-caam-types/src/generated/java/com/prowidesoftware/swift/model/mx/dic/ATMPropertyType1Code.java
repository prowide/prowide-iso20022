
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMPropertyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMPropertyType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STRG"/&gt;
 *     &lt;enumeration value="NMBR"/&gt;
 *     &lt;enumeration value="BOOL"/&gt;
 *     &lt;enumeration value="JSON"/&gt;
 *     &lt;enumeration value="CSVF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMPropertyType1Code")
@XmlEnum
public enum ATMPropertyType1Code {


    /**
     * The property is encoded as a String.
     * 
     */
    STRG,

    /**
     * The property is encoded as a Number.
     * 
     */
    NMBR,

    /**
     * The property is encoded as a Boolean.
     * 
     */
    BOOL,

    /**
     * The property is encoded in JSON.
     * 
     */
    JSON,

    /**
     * The property is a CSV string representing a table of data.
     * 
     */
    CSVF;

    public String value() {
        return name();
    }

    public static ATMPropertyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
