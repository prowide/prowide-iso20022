
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType29Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassSubProductType29Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRBR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType29Code")
@XmlEnum
public enum AssetClassSubProductType29Code {


    /**
     * Commodity of type carbon related.
     * 
     */
    CRBR;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType29Code fromValue(String v) {
        return valueOf(v);
    }

}
