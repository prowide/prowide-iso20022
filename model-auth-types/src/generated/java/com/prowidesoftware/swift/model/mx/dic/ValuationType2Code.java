
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValuationType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MTMO"/&gt;
 *     &lt;enumeration value="MTMA"/&gt;
 *     &lt;enumeration value="AMCS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValuationType2Code")
@XmlEnum
public enum ValuationType2Code {


    /**
     * Mark to model valuation.
     * 
     * 
     */
    MTMO,

    /**
     * Mark to market valuation.
     * 
     * 
     * 
     */
    MTMA,

    /**
     * Amortised cost valuation.
     * 
     */
    AMCS;

    public String value() {
        return name();
    }

    public static ValuationType2Code fromValue(String v) {
        return valueOf(v);
    }

}
