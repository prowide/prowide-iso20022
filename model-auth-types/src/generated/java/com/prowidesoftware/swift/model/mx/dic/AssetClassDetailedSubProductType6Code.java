
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GASP"/&gt;
 *     &lt;enumeration value="LNGG"/&gt;
 *     &lt;enumeration value="NCGG"/&gt;
 *     &lt;enumeration value="TTFG"/&gt;
 *     &lt;enumeration value="NBPG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType6Code")
@XmlEnum
public enum AssetClassDetailedSubProductType6Code {


    /**
     * Commodity attribute of type GASPOOL.
     * 
     */
    GASP,

    /**
     * Commodity attribute of type liquid natural gas.
     * 
     */
    LNGG,

    /**
     * Commodity attribute of type NCG (NetConnect Germany).
     * 
     */
    NCGG,

    /**
     * Commodity attribute of type TTF (Dutch Title Transfer Facility).
     * 
     */
    TTFG,

    /**
     * Commodity attribute of type NBP (National Balancing Point).
     * 
     */
    NBPG;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType6Code fromValue(String v) {
        return valueOf(v);
    }

}
