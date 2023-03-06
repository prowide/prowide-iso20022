
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Verification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Verification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="MISS"/&gt;
 *     &lt;enumeration value="NOVF"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="SUCC"/&gt;
 *     &lt;enumeration value="ERRR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Verification1Code")
@XmlEnum
public enum Verification1Code {


    /**
     * Verification failed.
     * 
     */
    FAIL,

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

    public static Verification1Code fromValue(String v) {
        return valueOf(v);
    }

}
