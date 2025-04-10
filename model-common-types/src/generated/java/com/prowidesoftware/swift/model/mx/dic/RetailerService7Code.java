
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RetailerService7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RPTP"/>
 *     <enumeration value="RPAP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RetailerService7Code")
@XmlEnum
public enum RetailerService7Code {


    /**
     * The POI System responds to a transaction report request.
     * 
     */
    RPTP,

    /**
     * The POI System responds to a totals figures request.
     * 
     */
    RPAP;

    public String value() {
        return name();
    }

    public static RetailerService7Code fromValue(String v) {
        return valueOf(v);
    }

}
