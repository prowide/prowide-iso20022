
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reporting1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Reporting1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STEX"/>
 *     <enumeration value="REGU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Reporting1Code")
@XmlEnum
public enum Reporting1Code {


    /**
     * Trade details are to be reported to a stock exchange.
     * 
     */
    STEX,

    /**
     * Trade details are to be reported to a regulatory organisation.
     * 
     */
    REGU;

    public String value() {
        return name();
    }

    public static Reporting1Code fromValue(String v) {
        return valueOf(v);
    }

}
