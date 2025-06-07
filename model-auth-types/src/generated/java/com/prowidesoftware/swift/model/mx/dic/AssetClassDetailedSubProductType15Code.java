
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType15Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MWHT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType15Code")
@XmlEnum
public enum AssetClassDetailedSubProductType15Code {


    /**
     * Commodity attribute of type milled wheat.
     * 
     */
    MWHT;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType15Code fromValue(String v) {
        return valueOf(v);
    }

}
