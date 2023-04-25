
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CivilStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CivilStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DIVO"/>
 *     <enumeration value="LDIV"/>
 *     <enumeration value="MARR"/>
 *     <enumeration value="SEPA"/>
 *     <enumeration value="SING"/>
 *     <enumeration value="UNIO"/>
 *     <enumeration value="WIDO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CivilStatus1Code")
@XmlEnum
public enum CivilStatus1Code {


    /**
     * Person is divorced.
     * 
     */
    DIVO,

    /**
     * Person is legally divorced.
     * 
     */
    LDIV,

    /**
     * Person is married.
     * 
     */
    MARR,

    /**
     * Person is separated.
     * 
     */
    SEPA,

    /**
     * Person is single.
     * 
     */
    SING,

    /**
     * Person is in a stable union.
     * 
     */
    UNIO,

    /**
     * Person is a widower.
     * 
     */
    WIDO;

    public String value() {
        return name();
    }

    public static CivilStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
