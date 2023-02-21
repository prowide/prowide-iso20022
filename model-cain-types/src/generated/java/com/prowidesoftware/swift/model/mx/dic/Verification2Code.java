
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Verification2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Verification2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="FUTA"/&gt;
 *     &lt;enumeration value="MISS"/&gt;
 *     &lt;enumeration value="NOVF"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="SUCC"/&gt;
 *     &lt;enumeration value="ERRR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Verification2Code")
@XmlEnum
public enum Verification2Code {


    /**
     * Verification failed.
     * 
     */
    FAIL,

    /**
     * Further action required.
     * 
     */
    FUTA,

    /**
     * Information required to perform the verification was missing.
     * 
     */
    MISS,

    /**
     * Verification has not been performed.
     * 
     */
    NOVF,

    /**
     * Other result of verification defined at national level.
     * 
     */
    OTHN,

    /**
     * Other result of verification defined at private level.
     * 
     */
    OTHP,

    /**
     * Verification was partially successful.
     * 
     */
    PART,

    /**
     * Verification was successful.
     * 
     */
    SUCC,

    /**
     * Device or entity to perform the verification was unavailable.
     * 
     */
    ERRR;

    public String value() {
        return name();
    }

    public static Verification2Code fromValue(String v) {
        return valueOf(v);
    }

}
