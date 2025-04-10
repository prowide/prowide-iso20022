
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyDesignation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CurrencyDesignation1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ONSH"/>
 *     <enumeration value="OFFS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CurrencyDesignation1Code")
@XmlEnum
public enum CurrencyDesignation1Code {


    /**
     * Onshore.
     * 
     */
    ONSH,

    /**
     * Offshore.
     * 
     */
    OFFS;

    public String value() {
        return name();
    }

    public static CurrencyDesignation1Code fromValue(String v) {
        return valueOf(v);
    }

}
