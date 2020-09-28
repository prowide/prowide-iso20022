
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClass1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClass1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRPB"/&gt;
 *     &lt;enumeration value="CRPE"/&gt;
 *     &lt;enumeration value="MUNB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClass1Code")
@XmlEnum
public enum AssetClass1Code {


    /**
     * Debt instrument issued by a corporation.
     * 
     */
    CRPB,

    /**
     * Equity issued by a corporation.
     * 
     */
    CRPE,

    /**
     * Debt instrument issued by municipality.
     * 
     */
    MUNB;

    public String value() {
        return name();
    }

    public static AssetClass1Code fromValue(String v) {
        return valueOf(v);
    }

}
