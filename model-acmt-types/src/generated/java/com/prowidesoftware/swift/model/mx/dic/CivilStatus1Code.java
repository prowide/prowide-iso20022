
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CivilStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CivilStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIVO"/&gt;
 *     &lt;enumeration value="LDIV"/&gt;
 *     &lt;enumeration value="MARR"/&gt;
 *     &lt;enumeration value="SEPA"/&gt;
 *     &lt;enumeration value="SING"/&gt;
 *     &lt;enumeration value="UNIO"/&gt;
 *     &lt;enumeration value="WIDO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
