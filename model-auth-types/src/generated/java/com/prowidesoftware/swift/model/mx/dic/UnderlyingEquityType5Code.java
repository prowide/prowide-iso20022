
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingEquityType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingEquityType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="ETFS"/&gt;
 *     &lt;enumeration value="SHRS"/&gt;
 *     &lt;enumeration value="DVSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingEquityType5Code")
@XmlEnum
public enum UnderlyingEquityType5Code {


    /**
     * Underlying is of other type.
     * 
     */
    OTHR,

    /**
     * Underlying is an exchange traded fund.
     * 
     */
    ETFS,

    /**
     * Underlying is a share.
     * 
     */
    SHRS,

    /**
     * Underlying is a stock dividend.
     * 
     */
    DVSE;

    public String value() {
        return name();
    }

    public static UnderlyingEquityType5Code fromValue(String v) {
        return valueOf(v);
    }

}
