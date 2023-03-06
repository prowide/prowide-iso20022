
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Operator1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SMAL"/&gt;
 *     &lt;enumeration value="SMEQ"/&gt;
 *     &lt;enumeration value="GREA"/&gt;
 *     &lt;enumeration value="GREQ"/&gt;
 *     &lt;enumeration value="EQAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Operator1Code")
@XmlEnum
public enum Operator1Code {


    /**
     * Smaller than.
     * 
     */
    SMAL,

    /**
     * Smaller or equal to.
     * 
     */
    SMEQ,

    /**
     * Greater than.
     * 
     */
    GREA,

    /**
     * Greater or equal to.
     * 
     */
    GREQ,

    /**
     * Equal to.
     * 
     */
    EQAL;

    public String value() {
        return name();
    }

    public static Operator1Code fromValue(String v) {
        return valueOf(v);
    }

}
