
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodsAndServicesSubType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GoodsAndServicesSubType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRCU"/&gt;
 *     &lt;enumeration value="FORX"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SECS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GoodsAndServicesSubType1Code")
@XmlEnum
public enum GoodsAndServicesSubType1Code {


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
     * Other sub type of goods and service at national level.
     * 
     */
    OTHN,

    /**
     * Other sub type of goods and service at private level.
     * 
     */
    OTHP,

    /**
     * Sub type applied is securities.
     * 
     */
    SECS;

    public String value() {
        return name();
    }

    public static GoodsAndServicesSubType1Code fromValue(String v) {
        return valueOf(v);
    }

}
