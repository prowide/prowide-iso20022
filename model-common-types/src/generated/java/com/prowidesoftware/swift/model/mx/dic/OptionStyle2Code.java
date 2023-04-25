
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionStyle2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionStyle2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMER"/>
 *     <enumeration value="EURO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionStyle2Code")
@XmlEnum
public enum OptionStyle2Code {


    /**
     * Option can be exercised before or on expiry date.
     * 
     */
    AMER,

    /**
     * Option that can be exercised on expiry date only.
     * 
     */
    EURO;

    public String value() {
        return name();
    }

    public static OptionStyle2Code fromValue(String v) {
        return valueOf(v);
    }

}
