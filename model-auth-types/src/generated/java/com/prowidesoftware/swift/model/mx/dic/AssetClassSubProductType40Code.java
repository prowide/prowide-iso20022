
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType40Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassSubProductType40Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAPH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType40Code")
@XmlEnum
public enum AssetClassSubProductType40Code {


    /**
     * Commodity of type diammonium phosphate.
     * 
     */
    DAPH;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType40Code fromValue(String v) {
        return valueOf(v);
    }

}
