
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyInDeferral1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BuyInDeferral1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEFY"/>
 *     <enumeration value="DEFN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BuyInDeferral1Code")
@XmlEnum
public enum BuyInDeferral1Code {


    /**
     * Buy-in is deferred.
     * 
     * 
     */
    DEFY,

    /**
     * Buy-in is not deferred.
     * 
     */
    DEFN;

    public String value() {
        return name();
    }

    public static BuyInDeferral1Code fromValue(String v) {
        return valueOf(v);
    }

}
