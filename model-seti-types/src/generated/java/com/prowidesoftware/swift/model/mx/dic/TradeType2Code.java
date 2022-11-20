
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RISK"/&gt;
 *     &lt;enumeration value="VWAP"/&gt;
 *     &lt;enumeration value="AGEN"/&gt;
 *     &lt;enumeration value="GUAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
