
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettledStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettledStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UPST"/&gt;
 *     &lt;enumeration value="CPST"/&gt;
 *     &lt;enumeration value="UCPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettledStatusReason1Code")
@XmlEnum
public enum SettledStatusReason1Code {


    /**
     * Units are partially settled.
     * 
     */
    UPST,

    /**
     * Cash is partially settled.
     * 
     */
    CPST,

    /**
     * Units and cash are both partially settled.
     * 
     */
    UCPS;

    public String value() {
        return name();
    }

    public static SettledStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
