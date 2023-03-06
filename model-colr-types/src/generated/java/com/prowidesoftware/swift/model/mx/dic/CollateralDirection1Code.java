
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralDirection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralDirection1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CDPA"/&gt;
 *     &lt;enumeration value="CDPB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollateralDirection1Code")
@XmlEnum
public enum CollateralDirection1Code {


    /**
     * Collateral is due to party A.
     * 
     * 
     */
    CDPA,

    /**
     * Collateral is due to party B.
     * 
     */
    CDPB;

    public String value() {
        return name();
    }

    public static CollateralDirection1Code fromValue(String v) {
        return valueOf(v);
    }

}
