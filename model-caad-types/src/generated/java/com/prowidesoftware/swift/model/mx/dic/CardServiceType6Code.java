
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardServiceType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardServiceType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PART"/>
 *     <enumeration value="FINL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardServiceType6Code")
@XmlEnum
public enum CardServiceType6Code {


    /**
     * Partial reconciliation of the day.
     * 
     */
    PART,

    /**
     * Final reconciliation.
     * 
     */
    FINL;

    public String value() {
        return name();
    }

    public static CardServiceType6Code fromValue(String v) {
        return valueOf(v);
    }

}
