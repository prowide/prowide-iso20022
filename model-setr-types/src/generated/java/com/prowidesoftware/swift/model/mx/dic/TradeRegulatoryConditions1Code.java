
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeRegulatoryConditions1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeRegulatoryConditions1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SOLI"/>
 *     <enumeration value="USOL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
