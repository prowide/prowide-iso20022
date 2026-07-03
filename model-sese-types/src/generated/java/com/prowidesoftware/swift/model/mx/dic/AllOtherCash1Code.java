
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllOtherCash1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllOtherCash1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LIQU"/&gt;
 *     &lt;enumeration value="NLIQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AllOtherCash1Code")
@XmlEnum
public enum AllOtherCash1Code {


    /**
     * Remaining assets in a portfolio not listed for transfer should be liquidated and transferred as cash.
     * 
     */
    LIQU,

    /**
     * Remaining assets in a portfolio not listed for transfer should not be liquidated and transferred as cash.
     * 
     */
    NLIQ;

    public String value() {
        return name();
    }

    public static AllOtherCash1Code fromValue(String v) {
        return valueOf(v);
    }

}
