
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductEnvironmentalType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassSubProductEnvironmentalType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMIS"/&gt;
 *     &lt;enumeration value="WTHR"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassSubProductEnvironmentalType1Code")
@XmlEnum
public enum AssetClassSubProductEnvironmentalType1Code {


    /**
     * Commodity of type emission.
     * 
     */
    EMIS,

    /**
     * Commodity of type weather.
     * 
     */
    WTHR,

    /**
     * Commodity of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassSubProductEnvironmentalType1Code fromValue(String v) {
        return valueOf(v);
    }

}
