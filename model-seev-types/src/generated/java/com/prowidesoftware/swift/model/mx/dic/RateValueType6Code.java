
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateValueType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateValueType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateValueType6Code")
@XmlEnum
public enum RateValueType6Code {


    /**
     * Rate is unknown by the sender or has not been established.
     * 
     */
    UKWN,

    /**
     * Rate has not been established.
     * 
     */
    OPEN;

    public String value() {
        return name();
    }

    public static RateValueType6Code fromValue(String v) {
        return valueOf(v);
    }

}
