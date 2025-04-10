
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ROBU"/&gt;
 *     &lt;enumeration value="CCOA"/&gt;
 *     &lt;enumeration value="BRWN"/&gt;
 *     &lt;enumeration value="WHSG"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType2Code")
@XmlEnum
public enum AssetClassDetailedSubProductType2Code {


    /**
     * Commodity attribute of type robusta coffee.
     * 
     */
    ROBU,

    /**
     * Commodity attribute of type cocoa.
     * 
     */
    CCOA,

    /**
     * Commodity attribute of type raw sugar.
     * 
     */
    BRWN,

    /**
     * Commodity attribute of type white sugar.
     * 
     */
    WHSG,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType2Code fromValue(String v) {
        return valueOf(v);
    }

}
