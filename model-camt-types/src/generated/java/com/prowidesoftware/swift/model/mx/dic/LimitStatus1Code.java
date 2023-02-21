
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LimitStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENAB"/&gt;
 *     &lt;enumeration value="DISA"/&gt;
 *     &lt;enumeration value="DELD"/&gt;
 *     &lt;enumeration value="REQD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LimitStatus1Code")
@XmlEnum
public enum LimitStatus1Code {


    /**
     * Limit is currently in effect.
     * 
     */
    ENAB,

    /**
     * Limit is not currently in effect.
     * 
     */
    DISA,

    /**
     * Limit has been deleted or suspended.
     * 
     */
    DELD,

    /**
     * Limit has been asked for and is not yet enabled.
     * 
     */
    REQD;

    public String value() {
        return name();
    }

    public static LimitStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
