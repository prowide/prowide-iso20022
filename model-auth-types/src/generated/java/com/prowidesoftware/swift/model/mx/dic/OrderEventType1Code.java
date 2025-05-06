
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderEventType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OrderEventType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAME"/>
 *     <enumeration value="CAMO"/>
 *     <enumeration value="CHME"/>
 *     <enumeration value="CHMO"/>
 *     <enumeration value="EXPI"/>
 *     <enumeration value="FILL"/>
 *     <enumeration value="NEWO"/>
 *     <enumeration value="PARF"/>
 *     <enumeration value="REMA"/>
 *     <enumeration value="REMO"/>
 *     <enumeration value="REMH"/>
 *     <enumeration value="REME"/>
 *     <enumeration value="TRIG"/>
 *     <enumeration value="RFQS"/>
 *     <enumeration value="RFQR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OrderEventType1Code")
@XmlEnum
public enum OrderEventType1Code {


    /**
     * Member, participant or client decides upon its own initiative to cancel the order it has previously entered.
     * 
     */
    CAME,

    /**
     * Includes a protection mechanism provided for investment firms carrying out a market-making activity.
     * 
     */
    CAMO,

    /**
     * Includes activation and deactivation.
     * 
     */
    CHME,

    /**
     * Change of status due to market operations.
     * 
     */
    CHMO,

    /**
     * Where the order is removed from the order book upon the end of its validity period.  
     * 
     */
    EXPI,

    /**
     * Where there is no more quantity to be executed.
     * 
     */
    FILL,

    /**
     * Receipt of a new order by the operator of the trading venue. 
     * 
     */
    NEWO,

    /**
     * Where the order is not fully executed so that there remains a quantity to be executed.  
     * 
     */
    PARF,

    /**
     * Where any characteristic of an order is changed by the trading venue operator's IT systems. This includes where a peg order's or a trailing stop order's current characteristics are changed to reflect how the order is located within the order book. 
     * 
     */
    REMA,

    /**
     * Order received but rejected by the operator of the trading venue. 
     * 
     */
    REMO,

    /**
     * Where any characteristic of an order is changed by a trading venue operator's staff. This includes the situation where a member, participant of the trading venue has IT issues and needs its orders to be cancelled urgently. 
     * 
     */
    REMH,

    /**
     * Where a member, participant or client of the trading venue decides upon its own initiative to change any characteristic of the order it has previously entered into the order book. 
     * 
     */
    REME,

    /**
     * Order which becomes executable or, as the case may be, non-executable upon the realisation of a pre-determined condition. 
     * 
     */
    TRIG,

    /**
     * Request for quote by one or more members or participants.
     * 
     */
    RFQS,

    /**
     * Response to a request for quote submitted by one or more members or participants. 
     * 
     */
    RFQR;

    public String value() {
        return name();
    }

    public static OrderEventType1Code fromValue(String v) {
        return valueOf(v);
    }

}
