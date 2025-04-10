
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangePolicy2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExchangePolicy2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ONDM"/>
 *     <enumeration value="IMMD"/>
 *     <enumeration value="ASAP"/>
 *     <enumeration value="AGRP"/>
 *     <enumeration value="NBLT"/>
 *     <enumeration value="TTLT"/>
 *     <enumeration value="CYCL"/>
 *     <enumeration value="NONE"/>
 *     <enumeration value="BLCK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExchangePolicy2Code")
@XmlEnum
public enum ExchangePolicy2Code {


    /**
     * Exchange is performed if requested by the acquirer in a previous exchange, or at any time by the acceptor.
     * 
     */
    ONDM,

    /**
     * Exchange is performed just after the transaction completion.
     * 
     */
    IMMD,

    /**
     * As soon as the acquirer is contacted, for example with the next on-line transaction.
     * 
     */
    ASAP,

    /**
     * Exchanges are performed after reaching a maximum number of transaction or time period.
     * 
     */
    AGRP,

    /**
     * Exchange is performed after reaching a number of transactions without exchanges with the acquirer.
     * 
     */
    NBLT,

    /**
     * Exchange is performed after reaching a cumulative amount of transactions without exchanges with the acquirer.
     * 
     */
    TTLT,

    /**
     * Cyclic exchanges based on the related time conditions.
     * 
     */
    CYCL,

    /**
     * No exchange.
     * 
     */
    NONE,

    /**
     * All pending process must be paused until exchange is exclusively performed just after the transaction completion.
     * 
     */
    BLCK;

    public String value() {
        return name();
    }

    public static ExchangePolicy2Code fromValue(String v) {
        return valueOf(v);
    }

}
