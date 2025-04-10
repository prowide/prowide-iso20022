
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafekeepingPlace1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SafekeepingPlace1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="ICSD"/&gt;
 *     &lt;enumeration value="NCSD"/&gt;
 *     &lt;enumeration value="SHHE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SafekeepingPlace1Code")
@XmlEnum
public enum SafekeepingPlace1Code {


    /**
     * Financial instruments held at a local custodian.
     * 
     */
    CUST,

    /**
     * Financial instruments held at an International Central Securities Depository.
     * 
     */
    ICSD,

    /**
     * Financial instruments held at a National Central Securities Depository.
     * 
     */
    NCSD,

    /**
     * Used for certain financial instruments, for example, US mutual funds, where settlement is internal only, that is, there is no external movement of securities.
     * 
     */
    SHHE;

    public String value() {
        return name();
    }

    public static SafekeepingPlace1Code fromValue(String v) {
        return valueOf(v);
    }

}
