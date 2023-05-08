
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyInState1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BuyInState1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BSSP"/>
 *     <enumeration value="BSSY"/>
 *     <enumeration value="BSSN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BuyInState1Code")
@XmlEnum
public enum BuyInState1Code {


    /**
     * Buy-in was partially successful.
     * 
     */
    BSSP,

    /**
     * Buy-in was successful.
     * 
     */
    BSSY,

    /**
     * Buy-in was unsuccessful.
     * 
     */
    BSSN;

    public String value() {
        return name();
    }

    public static BuyInState1Code fromValue(String v) {
        return valueOf(v);
    }

}
