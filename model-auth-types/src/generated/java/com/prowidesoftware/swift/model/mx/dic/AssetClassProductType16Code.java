
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassProductType16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassProductType16Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INDX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassProductType16Code")
@XmlEnum
public enum AssetClassProductType16Code {


    /**
     * Index type of commodities.
     * 
     */
    INDX;

    public String value() {
        return name();
    }

    public static AssetClassProductType16Code fromValue(String v) {
        return valueOf(v);
    }

}
