
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAll1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashAll1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LIQU"/&gt;
 *     &lt;enumeration value="NLIQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashAll1Code")
@XmlEnum
public enum CashAll1Code {


    /**
     * All assets in a portfolio should be liquidated and transferred as cash.
     * 
     */
    LIQU,

    /**
     * All assets in a portfolio should not be liquidated and transferred as cash.
     * 
     */
    NLIQ;

    public String value() {
        return name();
    }

    public static CashAll1Code fromValue(String v) {
        return valueOf(v);
    }

}
