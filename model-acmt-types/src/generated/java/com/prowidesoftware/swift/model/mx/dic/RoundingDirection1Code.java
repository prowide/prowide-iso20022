
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundingDirection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoundingDirection1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RDUP"/&gt;
 *     &lt;enumeration value="RDWN"/&gt;
 *     &lt;enumeration value="STAN"/&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoundingDirection1Code")
@XmlEnum
public enum RoundingDirection1Code {


    /**
     * Round up to the nearest whole number.
     * 
     */
    RDUP,

    /**
     * Round down to the nearest whole number.
     * 
     */
    RDWN,

    /**
     * Round up or down to the nearest whole number.
     * 
     */
    STAN,

    /**
     * Do not round.
     * 
     */
    DIST;

    public String value() {
        return name();
    }

    public static RoundingDirection1Code fromValue(String v) {
        return valueOf(v);
    }

}
