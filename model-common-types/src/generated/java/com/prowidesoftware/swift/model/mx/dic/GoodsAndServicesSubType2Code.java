
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodsAndServicesSubType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GoodsAndServicesSubType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRCU"/>
 *     <enumeration value="FORX"/>
 *     <enumeration value="SECS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GoodsAndServicesSubType2Code")
@XmlEnum
public enum GoodsAndServicesSubType2Code {


    /**
     * Sub type applied is cryptocurrency.
     * 
     */
    CRCU,

    /**
     * Sub type applied is foreign exchange.
     * 
     */
    FORX,

    /**
     * Sub type applied is securities.
     * 
     */
    SECS;

    public String value() {
        return name();
    }

    public static GoodsAndServicesSubType2Code fromValue(String v) {
        return valueOf(v);
    }

}
