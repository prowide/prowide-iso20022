
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType50Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassSubProductType50Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="RCVP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType50Code")
@XmlEnum
public enum AssetClassSubProductType50Code {


    /**
     * Commodity of other type.
     * 
     */
    OTHR,

    /**
     * Commodity of type recovered paper.
     * 
     */
    RCVP;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType50Code fromValue(String v) {
        return valueOf(v);
    }

}
