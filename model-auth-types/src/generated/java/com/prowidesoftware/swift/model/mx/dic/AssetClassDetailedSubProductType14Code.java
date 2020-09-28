
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType14Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DBCR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType14Code")
@XmlEnum
public enum AssetClassDetailedSubProductType14Code {


    /**
     * Commodity attribute of type dry bulk carrier.
     * 
     */
    DBCR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType14Code fromValue(String v) {
        return valueOf(v);
    }

}
