
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CINT"/&gt;
 *     &lt;enumeration value="XINT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterestType2Code")
@XmlEnum
public enum InterestType2Code {


    /**
     * Indicates deal price including accrued interest.
     * 
     */
    CINT,

    /**
     * Indicates deal price excluding accrued interest.
     * 
     */
    XINT;

    public String value() {
        return name();
    }

    public static InterestType2Code fromValue(String v) {
        return valueOf(v);
    }

}
