
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecutionTimeLimit1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExecutionTimeLimit1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPEN"/>
 *     <enumeration value="CLOS"/>
 *     <enumeration value="GDAY"/>
 *     <enumeration value="GTCA"/>
 *     <enumeration value="GTHD"/>
 *     <enumeration value="GTMO"/>
 *     <enumeration value="FIKI"/>
 *     <enumeration value="GTNM"/>
 *     <enumeration value="GTXO"/>
 *     <enumeration value="IOCA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExecutionTimeLimit1Code")
@XmlEnum
public enum ExecutionTimeLimit1Code {


    /**
     * A round lot order to be executed at the opening of the market.
     * 
     */
    OPEN,

    /**
     * An order to buy or sell at the closing price or an odd lot order to buy or sell to be filled at the closing of the round lot offer, plus a differential for a buy order or minus the differential on a sell order.
     * 
     */
    CLOS,

    /**
     * An order that, if not executed, expires at the end of the trading day on which the order is entered.
     * 
     */
    GDAY,

    /**
     * An order that remains in effect until it is either executed or cancelled.
     * 
     */
    GTCA,

    /**
     * An Order that if not executed, expires at the end of the specified expiry date.
     * 
     */
    GTHD,

    /**
     * An order that, if not executed, expires at the end of the month on which the order is entered.
     * 
     */
    GTMO,

    /**
     * A market or limit order that is to be executed in its entirety as soon as it is submitted; if not so executed, the order is to be cancelled.
     * 
     */
    FIKI,

    /**
     * Indicates an order that is good until the end of next month.
     * 
     */
    GTNM,

    /**
     * Indicates an order that is good till crossed.
     * 
     */
    GTXO,

    /**
     * A market or limit order to be executed in whole or in part as soon as it is submitted; any portion not so executed is to be cancelled.
     * 
     */
    IOCA;

    public String value() {
        return name();
    }

    public static ExecutionTimeLimit1Code fromValue(String v) {
        return valueOf(v);
    }

}
