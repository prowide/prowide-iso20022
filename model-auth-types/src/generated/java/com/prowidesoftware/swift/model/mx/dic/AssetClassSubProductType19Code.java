
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType19Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassSubProductType19Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DLVR"/&gt;
 *     &lt;enumeration value="NDLV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType19Code")
@XmlEnum
public enum AssetClassSubProductType19Code {


    /**
     * Commodity of type deliverable.
     * 
     */
    DLVR,

    /**
     * Commodity of type non deliverable.
     * 
     */
    NDLV;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType19Code fromValue(String v) {
        return valueOf(v);
    }

}
