
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Trading1MethodCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Trading1MethodCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ELEC"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="BROK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Trading1MethodCode")
@XmlEnum
public enum Trading1MethodCode {


    /**
     * Trade executed through an electronic trading system.
     * 
     */
    ELEC,

    /**
     * Trade executed over the phone.
     * 
     */
    PHON,

    /**
     * Trade executed through a broker.
     * 
     */
    BROK;

    public String value() {
        return name();
    }

    public static Trading1MethodCode fromValue(String v) {
        return valueOf(v);
    }

}
