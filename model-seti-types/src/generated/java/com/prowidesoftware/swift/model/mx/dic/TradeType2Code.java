
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RISK"/>
 *     <enumeration value="VWAP"/>
 *     <enumeration value="AGEN"/>
 *     <enumeration value="GUAR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeType2Code")
@XmlEnum
public enum TradeType2Code {


    /**
     * Trade involving risk.
     * 
     */
    RISK,

    /**
     * Trade whose price is guaranteed as the weighted average of the trade prices on a specific day.
     * 
     */
    VWAP,

    /**
     * Trade in which an agent intermediates between a buyer and a seller.
     * 
     */
    AGEN,

    /**
     * Trade which is guaranteed to be finalized.
     * 
     */
    GUAR;

    public String value() {
        return name();
    }

    public static TradeType2Code fromValue(String v) {
        return valueOf(v);
    }

}
