
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductEnergyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductEnergyType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COAL"/>
 *     <enumeration value="ELEC"/>
 *     <enumeration value="OILP"/>
 *     <enumeration value="INRG"/>
 *     <enumeration value="NGAS"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductEnergyType1Code")
@XmlEnum
public enum AssetClassSubProductEnergyType1Code {


    /**
     * Commodity of type coal.
     * 
     */
    COAL,

    /**
     * Commodity of type electricity.
     * 
     */
    ELEC,

    /**
     * Commodity of type oil.
     * 
     */
    OILP,

    /**
     * Commodity of type inter energy.
     * 
     */
    INRG,

    /**
     * Commodity of type natural gas.
     * 
     */
    NGAS,

    /**
     * Commodity of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassSubProductEnergyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
