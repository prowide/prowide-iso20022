
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClass1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClass1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRPB"/>
 *     <enumeration value="CRPE"/>
 *     <enumeration value="MUNB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClass1Code")
@XmlEnum
public enum AssetClass1Code {


    /**
     * Debt instrument issued by a corporation.
     * 
     */
    CRPB,

    /**
     * Equity issued by a corporation.
     * 
     */
    CRPE,

    /**
     * Debt instrument issued by municipality.
     * 
     */
    MUNB;

    public String value() {
        return name();
    }

    public static AssetClass1Code fromValue(String v) {
        return valueOf(v);
    }

}
