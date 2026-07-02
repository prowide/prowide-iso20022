
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType31Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassSubProductType31Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DRYF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType31Code")
@XmlEnum
public enum AssetClassSubProductType31Code {


    /**
     * Commodity of type dry freight.
     * 
     */
    DRYF;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType31Code fromValue(String v) {
        return valueOf(v);
    }

}
