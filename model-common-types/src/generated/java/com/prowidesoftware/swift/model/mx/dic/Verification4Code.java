
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Verification4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Verification4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAIL"/>
 *     <enumeration value="FUTA"/>
 *     <enumeration value="MISS"/>
 *     <enumeration value="NOSP"/>
 *     <enumeration value="NOVF"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="SUCC"/>
 *     <enumeration value="ERRR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Verification4Code")
@XmlEnum
public enum Verification4Code {


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
     * Not support the verification type
     * 
     */
    NOSP,

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

    public static Verification4Code fromValue(String v) {
        return valueOf(v);
    }

}
