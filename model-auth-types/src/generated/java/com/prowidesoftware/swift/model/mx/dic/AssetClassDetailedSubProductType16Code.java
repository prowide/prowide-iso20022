
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType16Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FXCR"/>
 *     <enumeration value="FXEM"/>
 *     <enumeration value="FXMJ"/>
 *     <enumeration value="FUEL"/>
 *     <enumeration value="FOIL"/>
 *     <enumeration value="GOIL"/>
 *     <enumeration value="GSLN"/>
 *     <enumeration value="GASP"/>
 *     <enumeration value="HEAT"/>
 *     <enumeration value="IRON"/>
 *     <enumeration value="JTFL"/>
 *     <enumeration value="KERO"/>
 *     <enumeration value="LAMP"/>
 *     <enumeration value="LEAD"/>
 *     <enumeration value="LLSO"/>
 *     <enumeration value="LNGG"/>
 *     <enumeration value="CORN"/>
 *     <enumeration value="MARS"/>
 *     <enumeration value="MWHT"/>
 *     <enumeration value="MOLY"/>
 *     <enumeration value="NAPH"/>
 *     <enumeration value="NBPG"/>
 *     <enumeration value="NASC"/>
 *     <enumeration value="NCGG"/>
 *     <enumeration value="NGLO"/>
 *     <enumeration value="NICK"/>
 *     <enumeration value="OFFP"/>
 *     <enumeration value="ALUM"/>
 *     <enumeration value="ALUA"/>
 *     <enumeration value="BAKK"/>
 *     <enumeration value="BSLD"/>
 *     <enumeration value="BDSL"/>
 *     <enumeration value="BRNT"/>
 *     <enumeration value="BRNX"/>
 *     <enumeration value="CNDA"/>
 *     <enumeration value="CERE"/>
 *     <enumeration value="CBLT"/>
 *     <enumeration value="CCOA"/>
 *     <enumeration value="COND"/>
 *     <enumeration value="CSHP"/>
 *     <enumeration value="COPR"/>
 *     <enumeration value="DSEL"/>
 *     <enumeration value="DBCR"/>
 *     <enumeration value="DUBA"/>
 *     <enumeration value="ERUE"/>
 *     <enumeration value="ESPO"/>
 *     <enumeration value="ETHA"/>
 *     <enumeration value="EUAE"/>
 *     <enumeration value="EUAA"/>
 *     <enumeration value="FWHT"/>
 *     <enumeration value="FITR"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PLDM"/>
 *     <enumeration value="PKLD"/>
 *     <enumeration value="PTNM"/>
 *     <enumeration value="POTA"/>
 *     <enumeration value="RPSD"/>
 *     <enumeration value="BRWN"/>
 *     <enumeration value="RICE"/>
 *     <enumeration value="ROBU"/>
 *     <enumeration value="SLVR"/>
 *     <enumeration value="SOYB"/>
 *     <enumeration value="STEL"/>
 *     <enumeration value="TNKR"/>
 *     <enumeration value="TAPI"/>
 *     <enumeration value="TINN"/>
 *     <enumeration value="TTFG"/>
 *     <enumeration value="URAL"/>
 *     <enumeration value="WHSG"/>
 *     <enumeration value="WTIO"/>
 *     <enumeration value="ZINC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType16Code")
@XmlEnum
public enum AssetClassDetailedSubProductType16Code {


    /**
     * Commodity attribute of type foreign exchange cross rate.
     * 
     */
    FXCR,

    /**
     * Commodity attribute of type foreign exchange emerging markets.
     * 
     */
    FXEM,

    /**
     * Commodity attribute of type foreign exchange majors.
     * 
     */
    FXMJ,

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
     * Commodity attribute of type GASPOOL.
     * 
     */
    GASP,

    /**
     * Commodity attribute of type heating oil.
     * 
     */
    HEAT,

    /**
     *  Commodity attribute of type iron ore.
     * 
     */
    IRON,

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
     * Commodity attribute of type lampante.
     * 
     */
    LAMP,

    /**
     * Commodity attribute of type lead.
     * 
     */
    LEAD,

    /**
     * Commodity attribute of type light Louisiana sweet (LLS).
     * 
     */
    LLSO,

    /**
     * Commodity attribute of type liquid natural gas.
     * 
     */
    LNGG,

    /**
     * Commodity attribute of type maize.
     * 
     */
    CORN,

    /**
     * Commodity attribute of type mars.
     * 
     */
    MARS,

    /**
     * Commodity attribute of type milled wheat.
     * 
     */
    MWHT,

    /**
     * Commodity attribute of type molybdenum.
     * 
     */
    MOLY,

    /**
     * Commodity attribute of type naptha.
     * 
     */
    NAPH,

    /**
     * Commodity attribute of type NBP (National Balancing Point).
     * 
     */
    NBPG,

    /**
     * Commodity attribute of type NASAAC (North American Special Aluminum Alloy Contract).
     * 
     */
    NASC,

    /**
     * Commodity attribute of type NCG (NetConnect Germany).
     * 
     */
    NCGG,

    /**
     * Commodity attribute of type NGL (Natural Gas Liquids).
     * 
     */
    NGLO,

    /**
     * Commodity attribute of type nickel.
     * 
     */
    NICK,

    /**
     * Commodity attribute of type off-peak.
     * 
     */
    OFFP,

    /**
     * Commodity attribute of type aluminium.
     * 
     */
    ALUM,

    /**
     * Commodity attribute of type aluminium alloy.
     * 
     */
    ALUA,

    /**
     * Commodity attribute of type bakken.
     * 
     */
    BAKK,

    /**
     * Commodity attribute of type base load.
     * 
     */
    BSLD,

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
     * Commodity attribute of type emissions allowance CER (Certified Emission Reduction).
     * 
     */
    CERE,

    /**
     * Commodity attribute of type cobalt.
     * 
     */
    CBLT,

    /**
     * Commodity attribute of type cocoa.
     * 
     */
    CCOA,

    /**
     * Commodity attribute of type condensate.
     * 
     */
    COND,

    /**
     * Commodity attribute of type containership.
     * 
     */
    CSHP,

    /**
     * Commodity attribute of type copper.
     * 
     */
    COPR,

    /**
     * Commodity attribute of type diesel.
     * 
     */
    DSEL,

    /**
     * Commodity attribute of type dry bulk carrier.
     * 
     */
    DBCR,

    /**
     * Commodity attribute of type Dubai.
     * 
     */
    DUBA,

    /**
     * Commodity attribute of type emissions allowance ERU (European Reduction Unit).
     * 
     */
    ERUE,

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
     * Commodity attribute of type emissions allowance EUA (European Union Allowance).
     * 
     */
    EUAE,

    /**
     * Commodity attribute of type emissions allowance EUAA (European Union Aviation Allowance).
     * 
     */
    EUAA,

    /**
     * Commodity attribute of type feed wheat.
     * 
     */
    FWHT,

    /**
     * Commodity attribute of type financial transmission rights.
     * 
     */
    FITR,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR,

    /**
     * Commodity attribute of type palladium.
     * 
     */
    PLDM,

    /**
     * Commodity attribute of type peak load.
     * 
     */
    PKLD,

    /**
     * Commodity attribute of type platinum.
     * 
     */
    PTNM,

    /**
     * Commodity attribute of type potatoes.
     * 
     */
    POTA,

    /**
     * Commodity attribute of type rapeseed.
     * 
     */
    RPSD,

    /**
     * Commodity attribute of type raw sugar.
     * 
     */
    BRWN,

    /**
     * Commodity attribute of type rice.
     * 
     */
    RICE,

    /**
     * Commodity attribute of type robusta coffee.
     * 
     */
    ROBU,

    /**
     * Commodity attribute of type silver.
     * 
     */
    SLVR,

    /**
     * Commodity attribute of type soybeans.
     * 
     */
    SOYB,

    /**
     * Commodity attribute of type steel.
     * 
     */
    STEL,

    /**
     * Commodity attribute of type tanker.
     * 
     */
    TNKR,

    /**
     * Commodity attribute of type tapis.
     * 
     */
    TAPI,

    /**
     * Commodity attribute of type tin.
     * 
     */
    TINN,

    /**
     * Commodity attribute of type TTF (Dutch Title Transfer Facility).
     * 
     */
    TTFG,

    /**
     * Commodity attribute of type urals.
     * 
     */
    URAL,

    /**
     * Commodity attribute of type white sugar.
     * 
     */
    WHSG,

    /**
     * Commodity attribute of type WTI (West Texas Intermediate).
     * 
     */
    WTIO,

    /**
     * Commodity attribute of type zinc.
     * 
     */
    ZINC;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType16Code fromValue(String v) {
        return valueOf(v);
    }

}
