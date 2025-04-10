
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingName1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UndertakingName1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STBY"/>
 *     <enumeration value="DGAR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UndertakingName1Code")
@XmlEnum
public enum UndertakingName1Code {


    /**
     * Undertaking is a standby letter of credit.
     * 
     */
    STBY,

    /**
     * Undertaking is a demand guarantee.
     * 
     */
    DGAR;

    public String value() {
        return name();
    }

    public static UndertakingName1Code fromValue(String v) {
        return valueOf(v);
    }

}
