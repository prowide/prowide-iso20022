
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Verification2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Verification2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAIL"/>
 *     <enumeration value="FUTA"/>
 *     <enumeration value="MISS"/>
 *     <enumeration value="NOVF"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="SUCC"/>
 *     <enumeration value="ERRR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
