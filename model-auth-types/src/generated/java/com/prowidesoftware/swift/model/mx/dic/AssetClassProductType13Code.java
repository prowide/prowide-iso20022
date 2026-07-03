
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassProductType13Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MCEX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassProductType13Code")
@XmlEnum
public enum AssetClassProductType13Code {


    /**
     * Commodity of type multi commodity exotic.
     * 
     */
    MCEX;

    public String value() {
        return name();
    }

    public static AssetClassProductType13Code fromValue(String v) {
        return valueOf(v);
    }

}
