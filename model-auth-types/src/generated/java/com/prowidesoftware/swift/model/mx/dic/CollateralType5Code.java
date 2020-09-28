
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollateralType5Code")
@XmlEnum
public enum CollateralType5Code {


    /**
     * Collateral type is commodities.
     * 
     */
    COMM,

    /**
     * Collateral type is securities.
     * 
     */
    SECU;

    public String value() {
        return name();
    }

    public static CollateralType5Code fromValue(String v) {
        return valueOf(v);
    }

}
