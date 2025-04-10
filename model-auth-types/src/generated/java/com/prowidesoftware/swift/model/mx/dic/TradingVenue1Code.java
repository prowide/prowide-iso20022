
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingVenue1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradingVenue1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SINT"/>
 *     <enumeration value="MLTF"/>
 *     <enumeration value="OTFS"/>
 *     <enumeration value="RMKT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradingVenue1Code")
@XmlEnum
public enum TradingVenue1Code {


    /**
     * Investment firm which, on an organised, frequent systematic and substantial basis, deals on own account when executing client orders outside a regulated market, an multilateral trading facility or an organised trading facility without operating a multilateral system.
     * 
     */
    SINT,

    /**
     * Multilateral system which brings together multiple third-party buying and selling interests in financial instruments in a way that results in a contract.
     * 
     */
    MLTF,

    /**
     * Multilateral system which is not a regulated market or multilateral trading facility in which multiple third-party buying and selling interests in bonds, structured finance products, emission allowances or derivatives are able to interact in a way that results in a contract.
     * 
     */
    OTFS,

    /**
     * Market on which financial instruments can be traded according to rules defined by the stock exchange.
     * 
     */
    RMKT;

    public String value() {
        return name();
    }

    public static TradingVenue1Code fromValue(String v) {
        return valueOf(v);
    }

}
