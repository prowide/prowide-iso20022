
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardServiceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardServiceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PART"/>
 *     <enumeration value="FINL"/>
 *     <enumeration value="PRVS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardServiceType1Code")
@XmlEnum
public enum CardServiceType1Code {


    /**
     * Partial reconciliation of the day.
     * 
     */
    PART,

    /**
     * Final reconciliation.
     * 
     */
    FINL,

    /**
     * Request for totals of a previous reconciliation.
     * 
     */
    PRVS;

    public String value() {
        return name();
    }

    public static CardServiceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
