
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingIdentification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnderlyingIdentification1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UKWN"/>
 *     <enumeration value="BSKT"/>
 *     <enumeration value="INDX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnderlyingIdentification1Code")
@XmlEnum
public enum UnderlyingIdentification1Code {


    /**
     * Unknown (not available) underlying identification code.
     * 
     */
    UKWN,

    /**
     * Basket of indexes identification code.
     * 
     */
    BSKT,

    /**
     * Index identification code.
     * 
     */
    INDX;

    public String value() {
        return name();
    }

    public static UnderlyingIdentification1Code fromValue(String v) {
        return valueOf(v);
    }

}
