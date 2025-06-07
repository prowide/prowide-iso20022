
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType18Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassSubProductType18Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PLST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType18Code")
@XmlEnum
public enum AssetClassSubProductType18Code {


    /**
     * Commodity of type plastic.
     * 
     */
    PLST;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType18Code fromValue(String v) {
        return valueOf(v);
    }

}
