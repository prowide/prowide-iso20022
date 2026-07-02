
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FWHT"/&gt;
 *     &lt;enumeration value="SOYB"/&gt;
 *     &lt;enumeration value="RPSD"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="CORN"/&gt;
 *     &lt;enumeration value="RICE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType1Code")
@XmlEnum
public enum AssetClassDetailedSubProductType1Code {


    /**
     * Commodity attribute of type feed wheat.
     * 
     */
    FWHT,

    /**
     * Commodity attribute of type soybeans.
     * 
     */
    SOYB,

    /**
     * Commodity attribute of type rapeseed.
     * 
     */
    RPSD,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR,

    /**
     * Commodity attribute of type maize.
     * 
     */
    CORN,

    /**
     * Commodity attribute of type rice.
     * 
     */
    RICE;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType1Code fromValue(String v) {
        return valueOf(v);
    }

}
