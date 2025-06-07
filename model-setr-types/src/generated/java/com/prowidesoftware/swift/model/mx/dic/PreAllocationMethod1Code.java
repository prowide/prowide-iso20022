
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreAllocationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreAllocationMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROR"/&gt;
 *     &lt;enumeration value="TALK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PreAllocationMethod1Code")
@XmlEnum
public enum PreAllocationMethod1Code {


    /**
     * Preallocation is proratised.
     * 
     */
    PROR,

    /**
     * No prorata, discuss first.
     * 
     */
    TALK;

    public String value() {
        return name();
    }

    public static PreAllocationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
