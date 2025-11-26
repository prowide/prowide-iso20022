
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDate8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementDate8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASAP"/>
 *     <enumeration value="ENDC"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="CLEA"/>
 *     <enumeration value="MONT"/>
 *     <enumeration value="FUTU"/>
 *     <enumeration value="PRVD"/>
 *     <enumeration value="REGU"/>
 *     <enumeration value="SAVE"/>
 *     <enumeration value="SELL"/>
 *     <enumeration value="TBAT"/>
 *     <enumeration value="TFIV"/>
 *     <enumeration value="TFOR"/>
 *     <enumeration value="TONE"/>
 *     <enumeration value="TTRE"/>
 *     <enumeration value="TTWO"/>
 *     <enumeration value="WHIF"/>
 *     <enumeration value="WDIS"/>
 *     <enumeration value="WISS"/>
 *     <enumeration value="WHID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementDate8Code")
@XmlEnum
public enum SettlementDate8Code {


    /**
     * Transfer is to be effected as soon as possible.
     * 
     */
    ASAP,

    /**
     * Transfer is to be effected at the end of the contract.
     * 
     */
    ENDC,

    /**
     * Settlement takes place on the trade date.
     * 
     */
    CASH,

    /**
     * Cash settlement takes place before trade date.
     * 
     */
    CLEA,

    /**
     * Settlement takes place at the end of the month.
     * 
     */
    MONT,

    /**
     * Settlement takes place on the trade date plus six or more business days.
     * 
     */
    FUTU,

    /**
     * Event occurs on the previous day.
     * 
     */
    PRVD,

    /**
     * Settlement takes place under the standard rules applicable to the market and instrument.
     * 
     */
    REGU,

    /**
     * Money is withdrawn automatically from the savings plan.
     * 
     */
    SAVE,

    /**
     * Settlement takes place at the choice/option of the seller.
     * 
     */
    SELL,

    /**
     * Settlement takes place as a result of a "to be announced" trade.
     * 
     */
    TBAT,

    /**
     * Settlement takes place on the trade date plus five business days.
     * 
     */
    TFIV,

    /**
     * Settlement takes place on the trade date plus four business days.
     * 
     */
    TFOR,

    /**
     * Settlement takes place on the trade date plus one business day.
     * 
     */
    TONE,

    /**
     * Settlement takes place on the trade date plus three business days.
     * 
     */
    TTRE,

    /**
     * Settlement takes place on the trade date plus two business days.
     * 
     */
    TTWO,

    /**
     * Settlement takes place when the financial instrument is issued by the issuer.
     * 
     */
    WHIF,

    /**
     * Settlement takes place when the financial instrument is distributed.
     * 
     */
    WDIS,

    /**
     * Settlement is to be done when the security is issued.
     * 
     */
    WISS,

    /**
     * Settlement takes place when the financial instrument is issued or distributed.
     * 
     */
    WHID;

    public String value() {
        return name();
    }

    public static SettlementDate8Code fromValue(String v) {
        return valueOf(v);
    }

}
