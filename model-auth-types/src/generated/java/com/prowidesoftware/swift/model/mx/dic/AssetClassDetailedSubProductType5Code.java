
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BSLD"/&gt;
 *     &lt;enumeration value="FITR"/&gt;
 *     &lt;enumeration value="PKLD"/&gt;
 *     &lt;enumeration value="OFFP"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType5Code")
@XmlEnum
public enum AssetClassDetailedSubProductType5Code {


    /**
     * Commodity attribute of type base load.
     * 
     */
    BSLD,

    /**
     * Commodity attribute of type financial transmission rights.
     * 
     */
    FITR,

    /**
     * Commodity attribute of type peak load.
     * 
     */
    PKLD,

    /**
     * Commodity attribute of type off-peak.
     * 
     */
    OFFP,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType5Code fromValue(String v) {
        return valueOf(v);
    }

}
