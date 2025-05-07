
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALUM"/&gt;
 *     &lt;enumeration value="ALUA"/&gt;
 *     &lt;enumeration value="CBLT"/&gt;
 *     &lt;enumeration value="COPR"/&gt;
 *     &lt;enumeration value="IRON"/&gt;
 *     &lt;enumeration value="MOLY"/&gt;
 *     &lt;enumeration value="NASC"/&gt;
 *     &lt;enumeration value="NICK"/&gt;
 *     &lt;enumeration value="STEL"/&gt;
 *     &lt;enumeration value="TINN"/&gt;
 *     &lt;enumeration value="ZINC"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="LEAD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType10Code")
@XmlEnum
public enum AssetClassDetailedSubProductType10Code {


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
     * Commodity attribute of type cobalt.
     * 
     */
    CBLT,

    /**
     * Commodity attribute of type copper.
     * 
     */
    COPR,

    /**
     *  Commodity attribute of type iron ore.
     * 
     */
    IRON,

    /**
     * Commodity attribute of type molybdenum.
     * 
     */
    MOLY,

    /**
     * Commodity attribute of type NASAAC (North American Special Aluminum Alloy Contract).
     * 
     */
    NASC,

    /**
     * Commodity attribute of type nickel.
     * 
     */
    NICK,

    /**
     * Commodity attribute of type steel.
     * 
     */
    STEL,

    /**
     * Commodity attribute of type tin.
     * 
     */
    TINN,

    /**
     * Commodity attribute of type zinc.
     * 
     */
    ZINC,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR,

    /**
     * Commodity attribute of type lead.
     * 
     */
    LEAD;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType10Code fromValue(String v) {
        return valueOf(v);
    }

}
