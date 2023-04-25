
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Verification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Verification1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAIL"/>
 *     <enumeration value="MISS"/>
 *     <enumeration value="NOVF"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="SUCC"/>
 *     <enumeration value="ERRR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
