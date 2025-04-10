
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictionStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RestrictionStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="INAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RestrictionStatus1Code")
@XmlEnum
public enum RestrictionStatus1Code {


    /**
     * Status of the restriction is active.
     * 
     */
    ACTV,

    /**
     * Status of the restriction is inactive.
     * 
     */
    INAC;

    public String value() {
        return name();
    }

    public static RestrictionStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
