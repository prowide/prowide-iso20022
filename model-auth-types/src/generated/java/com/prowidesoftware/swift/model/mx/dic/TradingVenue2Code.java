
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingVenue2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradingVenue2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPA"/&gt;
 *     &lt;enumeration value="CTPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradingVenue2Code")
@XmlEnum
public enum TradingVenue2Code {


    /**
     * Person authorised under the provisions established in the regulation to provide the service of publishing trade reports on behalf of investment firms.
     * 
     */
    APPA,

    /**
     * Provider which will consolidate post-trade information into a continuous electronic data stream and make it publicly available as close to real time as technologically possible on a reasonable commercial basis and free of charge after 15 minutes.
     * 
     */
    CTPS;

    public String value() {
        return name();
    }

    public static TradingVenue2Code fromValue(String v) {
        return valueOf(v);
    }

}
