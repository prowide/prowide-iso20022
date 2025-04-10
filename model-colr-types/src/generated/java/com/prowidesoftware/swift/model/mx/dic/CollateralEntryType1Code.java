
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralEntryType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralEntryType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DELI"/>
 *     <enumeration value="RECE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralEntryType1Code")
@XmlEnum
public enum CollateralEntryType1Code {


    /**
     * Financial Instruments or amount are to be delivered out of Party A's account.
     * 
     * 
     */
    DELI,

    /**
     * Financial Instruments  or amount are to be received in Party A's account.
     * 
     * 
     */
    RECE;

    public String value() {
        return name();
    }

    public static CollateralEntryType1Code fromValue(String v) {
        return valueOf(v);
    }

}
