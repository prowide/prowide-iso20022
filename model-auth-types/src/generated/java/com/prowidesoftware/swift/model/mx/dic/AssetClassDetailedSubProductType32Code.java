
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType32Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType32Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BAKK"/>
 *     <enumeration value="BDSL"/>
 *     <enumeration value="BRNT"/>
 *     <enumeration value="BRNX"/>
 *     <enumeration value="CNDA"/>
 *     <enumeration value="COND"/>
 *     <enumeration value="DSEL"/>
 *     <enumeration value="DUBA"/>
 *     <enumeration value="ESPO"/>
 *     <enumeration value="ETHA"/>
 *     <enumeration value="FUEL"/>
 *     <enumeration value="FOIL"/>
 *     <enumeration value="GOIL"/>
 *     <enumeration value="GSLN"/>
 *     <enumeration value="HEAT"/>
 *     <enumeration value="JTFL"/>
 *     <enumeration value="KERO"/>
 *     <enumeration value="LLSO"/>
 *     <enumeration value="MARS"/>
 *     <enumeration value="NAPH"/>
 *     <enumeration value="NGLO"/>
 *     <enumeration value="TAPI"/>
 *     <enumeration value="WTIO"/>
 *     <enumeration value="URAL"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType32Code")
@XmlEnum
public enum AssetClassDetailedSubProductType32Code {


    /**
     * Commodity attribute of type bakken.
     * 
     */
    BAKK,

    /**
     * Commodity attribute of type biodiesel.
     * 
     */
    BDSL,

    /**
     * Commodity attribute of type Brent.
     * 
     */
    BRNT,

    /**
     * Commodity attribute of type Brent NX (New Expiry).
     * 
     */
    BRNX,

    /**
     * Commodity attribute of type canadian.
     * 
     */
    CNDA,

    /**
     * Commodity attribute of type condensate.
     * 
     */
    COND,

    /**
     * Commodity attribute of type diesel.
     * 
     */
    DSEL,

    /**
     * Commodity attribute of type Dubai.
     * 
     */
    DUBA,

    /**
     * Commodity attribute of type ESPO (Eastern Siberia Pacific Ocean).
     * 
     */
    ESPO,

    /**
     * Commodity attribute of type ethanol.
     * 
     */
    ETHA,

    /**
     * Commodity attribute of type fuel.
     * 
     */
    FUEL,

    /**
     * Commodity attribute of type fuel oil.
     * 
     */
    FOIL,

    /**
     * Commodity attribute of type gasoil.
     * 
     */
    GOIL,

    /**
     * Commodity attribute of type gasoline.
     * 
     */
    GSLN,

    /**
     * Commodity attribute of type heating oil.
     * 
     */
    HEAT,

    /**
     * Commodity attribute of type jet fuel.
     * 
     */
    JTFL,

    /**
     * Commodity attribute of type kerosene.
     * 
     */
    KERO,

    /**
     * Commodity attribute of type light Louisiana sweet (LLS).
     * 
     */
    LLSO,

    /**
     * Commodity attribute of type mars.
     * 
     */
    MARS,

    /**
     * Commodity attribute of type naptha.
     * 
     */
    NAPH,

    /**
     * Commodity attribute of type NGL (Natural Gas Liquids).
     * 
     */
    NGLO,

    /**
     * Commodity attribute of type tapis.
     * 
     */
    TAPI,

    /**
     * Commodity attribute of type WTI (West Texas Intermediate).
     * 
     */
    WTIO,

    /**
     * Commodity attribute of type urals.
     * 
     */
    URAL,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType32Code fromValue(String v) {
        return valueOf(v);
    }

}
