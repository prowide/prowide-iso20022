
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType33Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType33Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DBCR"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType33Code")
@XmlEnum
public enum AssetClassDetailedSubProductType33Code {


    /**
     * Commodity attribute of type dry bulk carrier.
     * 
     */
    DBCR,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType33Code fromValue(String v) {
        return valueOf(v);
    }

}
