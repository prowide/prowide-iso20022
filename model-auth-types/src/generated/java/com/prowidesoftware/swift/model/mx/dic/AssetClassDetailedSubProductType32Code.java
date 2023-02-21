
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType32Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType32Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BAKK"/&gt;
 *     &lt;enumeration value="BDSL"/&gt;
 *     &lt;enumeration value="BRNT"/&gt;
 *     &lt;enumeration value="BRNX"/&gt;
 *     &lt;enumeration value="CNDA"/&gt;
 *     &lt;enumeration value="COND"/&gt;
 *     &lt;enumeration value="DSEL"/&gt;
 *     &lt;enumeration value="DUBA"/&gt;
 *     &lt;enumeration value="ESPO"/&gt;
 *     &lt;enumeration value="ETHA"/&gt;
 *     &lt;enumeration value="FUEL"/&gt;
 *     &lt;enumeration value="FOIL"/&gt;
 *     &lt;enumeration value="GOIL"/&gt;
 *     &lt;enumeration value="GSLN"/&gt;
 *     &lt;enumeration value="HEAT"/&gt;
 *     &lt;enumeration value="JTFL"/&gt;
 *     &lt;enumeration value="KERO"/&gt;
 *     &lt;enumeration value="LLSO"/&gt;
 *     &lt;enumeration value="MARS"/&gt;
 *     &lt;enumeration value="NAPH"/&gt;
 *     &lt;enumeration value="NGLO"/&gt;
 *     &lt;enumeration value="TAPI"/&gt;
 *     &lt;enumeration value="WTIO"/&gt;
 *     &lt;enumeration value="URAL"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
