
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType20Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassSubProductType20Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIRY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType20Code")
@XmlEnum
public enum AssetClassSubProductType20Code {


    /**
     * Commodity of type dairy.
     * 
     */
    DIRY;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType20Code fromValue(String v) {
        return valueOf(v);
    }

}
