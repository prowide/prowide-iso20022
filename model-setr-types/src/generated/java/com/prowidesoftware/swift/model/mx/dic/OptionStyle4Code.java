
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionStyle4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionStyle4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMER"/>
 *     <enumeration value="EURO"/>
 *     <enumeration value="BERM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionStyle4Code")
@XmlEnum
public enum OptionStyle4Code {


    /**
     * Option can be exercised before or on expiry date.
     * 
     */
    AMER,

    /**
     * Option that can be exercised on expiry date only.
     * 
     */
    EURO,

    /**
     * Option that can be exercised on multiple discrete dates prior to, or on expiry date.
     * 
     */
    BERM;

    public String value() {
        return name();
    }

    public static OptionStyle4Code fromValue(String v) {
        return valueOf(v);
    }

}
