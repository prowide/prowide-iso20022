
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PegType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PegType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIXE"/>
 *     <enumeration value="LAST"/>
 *     <enumeration value="MARK"/>
 *     <enumeration value="MIDP"/>
 *     <enumeration value="OPEN"/>
 *     <enumeration value="PRIM"/>
 *     <enumeration value="VWAP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PegType1Code")
@XmlEnum
public enum PegType1Code {


    /**
     * Order pegged against a fixed amount (local best bid or offer, at time of order).
     * 
     */
    FIXE,

    /**
     * Order pegged against the last price.
     * 
     */
    LAST,

    /**
     * Order pegged against the current market price. Relative to the offering if buying and relative to the bid if selling.
     * 
     */
    MARK,

    /**
     * Order pegged against the mid price, which is the average between the offer and bid prices.
     * 
     */
    MIDP,

    /**
     * Order pegged against the opening price.
     * 
     */
    OPEN,

    /**
     * Order pegged against the primary market where the financial instrument is traded. It is relative to the offering if buying and relative to the bid if selling.
     * 
     */
    PRIM,

    /**
     * Order pegged against the volume weighted average price for the day.
     * 
     */
    VWAP;

    public String value() {
        return name();
    }

    public static PegType1Code fromValue(String v) {
        return valueOf(v);
    }

}
