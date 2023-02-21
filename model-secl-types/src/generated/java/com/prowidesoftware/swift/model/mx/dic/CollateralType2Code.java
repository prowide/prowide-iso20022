
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollateralType2Code")
@XmlEnum
public enum CollateralType2Code {


    /**
     * Collateral type is cash.
     * 
     */
    CASH,

    /**
     * Collateral type is securities.
     * 
     */
    SECU;

    public String value() {
        return name();
    }

    public static CollateralType2Code fromValue(String v) {
        return valueOf(v);
    }

}
