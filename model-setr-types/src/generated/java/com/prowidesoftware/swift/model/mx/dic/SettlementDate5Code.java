
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDate5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementDate5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REGU"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="NXTD"/>
 *     <enumeration value="TONE"/>
 *     <enumeration value="TTWO"/>
 *     <enumeration value="TTRE"/>
 *     <enumeration value="TFOR"/>
 *     <enumeration value="TFIV"/>
 *     <enumeration value="SELL"/>
 *     <enumeration value="WDIS"/>
 *     <enumeration value="WHID"/>
 *     <enumeration value="TBAT"/>
 *     <enumeration value="WISS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementDate5Code")
@XmlEnum
public enum SettlementDate5Code {


    /**
     * Settlement takes place under the standard rules applicable to the market and instrument.
     * 
     */
    REGU,

    /**
     * Settlement takes place on the trade date.
     * 
     */
    CASH,

    /**
     * Settlement takes place on the day after trade date.
     * 
     */
    NXTD,

    /**
     * Settlement takes place on the trade date plus one business day.
     * 
     */
    TONE,

    /**
     * Settlement takes place on the trade date plus two business days.
     * 
     */
    TTWO,

    /**
     * Settlement takes place on the trade date plus three business days.
     * 
     */
    TTRE,

    /**
     * Settlement takes place on the trade date plus four business days.
     * 
     */
    TFOR,

    /**
     * Settlement takes place on the trade date plus five business days.
     * 
     */
    TFIV,

    /**
     * Settlement takes place at the choice/option of the seller.
     * 
     */
    SELL,

    /**
     * Settlement takes place when the financial instrument is distributed.
     * 
     */
    WDIS,

    /**
     * Settlement takes place when the financial instrument is issued or distributed.
     * 
     */
    WHID,

    /**
     * Settlement takes place as a result of a "to be announced" trade.
     * 
     */
    TBAT,

    /**
     * Settlement is to be done when the security is issued.
     * 
     */
    WISS;

    public String value() {
        return name();
    }

    public static SettlementDate5Code fromValue(String v) {
        return valueOf(v);
    }

}
