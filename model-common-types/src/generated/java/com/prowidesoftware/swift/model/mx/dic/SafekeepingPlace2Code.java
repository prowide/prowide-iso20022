
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafekeepingPlace2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SafekeepingPlace2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SHHE"/&gt;
 *     &lt;enumeration value="ALLP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SafekeepingPlace2Code")
@XmlEnum
public enum SafekeepingPlace2Code {


    /**
     * Used for certain financial instruments, for example, US mutual funds, where settlement is internal only, that is, there is no external movement of securities.
     * 
     */
    SHHE,

    /**
     * All places of safekeeping where the financial instrument is held.
     * 
     */
    ALLP;

    public String value() {
        return name();
    }

    public static SafekeepingPlace2Code fromValue(String v) {
        return valueOf(v);
    }

}
