
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangePolicy1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExchangePolicy1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ONDM"/>
 *     <enumeration value="IMMD"/>
 *     <enumeration value="ASAP"/>
 *     <enumeration value="AGRP"/>
 *     <enumeration value="NBLT"/>
 *     <enumeration value="TTLT"/>
 *     <enumeration value="CYCL"/>
 *     <enumeration value="NONE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExchangePolicy1Code")
@XmlEnum
public enum ExchangePolicy1Code {


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
    NONE;

    public String value() {
        return name();
    }

    public static ExchangePolicy1Code fromValue(String v) {
        return valueOf(v);
    }

}
