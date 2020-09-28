
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetFXSubProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetFXSubProductType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FXCR"/&gt;
 *     &lt;enumeration value="FXEM"/&gt;
 *     &lt;enumeration value="FXMJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetFXSubProductType1Code")
@XmlEnum
public enum AssetFXSubProductType1Code {


    /**
     * Commodity attribute of type foreign exchange cross rate.
     * 
     */
    FXCR,

    /**
     * Commodity attribute of type foreign exchange emerging markets.
     * 
     */
    FXEM,

    /**
     * Commodity attribute of type foreign exchange majors.
     * 
     */
    FXMJ;

    public String value() {
        return name();
    }

    public static AssetFXSubProductType1Code fromValue(String v) {
        return valueOf(v);
    }

}
