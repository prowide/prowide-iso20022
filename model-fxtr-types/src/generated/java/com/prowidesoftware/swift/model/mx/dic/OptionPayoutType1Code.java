
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionPayoutType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionPayoutType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BINA"/&gt;
 *     &lt;enumeration value="CAPP"/&gt;
 *     &lt;enumeration value="VANI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptionPayoutType1Code")
@XmlEnum
public enum OptionPayoutType1Code {


    /**
     * Indicates the type of binaryoption.
     * 
     */
    BINA,

    /**
     * Indicates the type of capped option.
     * 
     */
    CAPP,

    /**
     * Indicates the type of vanilla option.
     * 
     */
    VANI;

    public String value() {
        return name();
    }

    public static OptionPayoutType1Code fromValue(String v) {
        return valueOf(v);
    }

}
