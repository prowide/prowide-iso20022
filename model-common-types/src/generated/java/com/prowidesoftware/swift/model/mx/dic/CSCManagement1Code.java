
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSCManagement1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CSCManagement1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRST"/>
 *     <enumeration value="BYPS"/>
 *     <enumeration value="UNRD"/>
 *     <enumeration value="NCSC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
