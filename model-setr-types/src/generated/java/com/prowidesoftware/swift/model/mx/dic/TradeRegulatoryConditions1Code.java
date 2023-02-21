
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeRegulatoryConditions1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeRegulatoryConditions1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SOLI"/&gt;
 *     &lt;enumeration value="USOL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeRegulatoryConditions1Code")
@XmlEnum
public enum TradeRegulatoryConditions1Code {


    /**
     * Trade was solicited by the executing broker. The broker has suggested to his client to buy/sell financial instruments.
     * 
     */
    SOLI,

    /**
     * Trade was unsolicited. The client acts on its own without advice from the executing broker.
     * 
     */
    USOL;

    public String value() {
        return name();
    }

    public static TradeRegulatoryConditions1Code fromValue(String v) {
        return valueOf(v);
    }

}
