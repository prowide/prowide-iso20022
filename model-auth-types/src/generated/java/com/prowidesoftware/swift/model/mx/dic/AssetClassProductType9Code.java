
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassProductType9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="POLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassProductType9Code")
@XmlEnum
public enum AssetClassProductType9Code {


    /**
     * Commodity of type polypropylene.
     * 
     */
    POLY;

    public String value() {
        return name();
    }

    public static AssetClassProductType9Code fromValue(String v) {
        return valueOf(v);
    }

}
