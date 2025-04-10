
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDateCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementDateCode">
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
 *     <enumeration value="FUTU"/>
 *     <enumeration value="ASAP"/>
 *     <enumeration value="ENDC"/>
 *     <enumeration value="WHIF"/>
 *     <enumeration value="WDIS"/>
 *     <enumeration value="WHID"/>
 *     <enumeration value="TBAT"/>
 *     <enumeration value="MONT"/>
 *     <enumeration value="CLEA"/>
 *     <enumeration value="SAVE"/>
 *     <enumeration value="WISS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementDateCode")
@XmlEnum
public enum SettlementDateCode {


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
     * Settlement takes place on the trade date plus six or more business days.
     * 
     */
    FUTU,

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
     * Settlement takes place at the end of the month.
     * 
     */
    MONT,

    /**
     * Cash settlement takes place before trade date.
     * 
     */
    CLEA,

    /**
     * Money is withdrawn automatically from the savings plan.
     * 
     */
    SAVE,

    /**
     * Settlement is to be done when the security is issued.
     * 
     */
    WISS;

    public String value() {
        return name();
    }

    public static SettlementDateCode fromValue(String v) {
        return valueOf(v);
    }

}
