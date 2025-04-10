
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSCManagement1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CSCManagement1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRST"/&gt;
 *     &lt;enumeration value="BYPS"/&gt;
 *     &lt;enumeration value="UNRD"/&gt;
 *     &lt;enumeration value="NCSC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CSCManagement1Code")
@XmlEnum
public enum CSCManagement1Code {


    /**
     * Card security code present.
     * 
     */
    PRST,

    /**
     * Card security code by-passed or not provided by the merchant.
     * 
     */
    BYPS,

    /**
     * Card security code unreadable.
     * 
     */
    UNRD,

    /**
     * No card security code imprint.
     * 
     */
    NCSC;

    public String value() {
        return name();
    }

    public static CSCManagement1Code fromValue(String v) {
        return valueOf(v);
    }

}
