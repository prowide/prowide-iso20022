
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardServiceType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardServiceType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PART"/>
 *     <enumeration value="FINL"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardServiceType4Code")
@XmlEnum
public enum CardServiceType4Code {


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
     * National defined code.
     * 
     */
    OTHN,

    /**
     * Private defined code.
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static CardServiceType4Code fromValue(String v) {
        return valueOf(v);
    }

}
