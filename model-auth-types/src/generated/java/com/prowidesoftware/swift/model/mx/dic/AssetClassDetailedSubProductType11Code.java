
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GOLD"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PLDM"/&gt;
 *     &lt;enumeration value="PTNM"/&gt;
 *     &lt;enumeration value="SLVR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType11Code")
@XmlEnum
public enum AssetClassDetailedSubProductType11Code {


    /**
     * Commodity attribute of type gold.
     * 
     */
    GOLD,

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
     * Commodity attribute of type platinum.
     * 
     */
    PTNM,

    /**
     * Commodity attribute of type silver.
     * 
     */
    SLVR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType11Code fromValue(String v) {
        return valueOf(v);
    }

}
