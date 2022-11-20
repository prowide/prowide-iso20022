
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeMarket2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeMarket2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DMST"/&gt;
 *     &lt;enumeration value="FRGN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeMarket2Code")
@XmlEnum
public enum TradeMarket2Code {


    /**
     * Transaction has an origin and a destination in the same country and is made in the currency of that country.
     * 
     */
    DMST,

    /**
     * Transaction has an origin in one country and a destination in another and is made in the currency of either the origin or destination country.
     * 
     */
    FRGN;

    public String value() {
        return name();
    }

    public static TradeMarket2Code fromValue(String v) {
        return valueOf(v);
    }

}
