
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDate2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementDate2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REGU"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="NXTD"/&gt;
 *     &lt;enumeration value="TONE"/&gt;
 *     &lt;enumeration value="TTWO"/&gt;
 *     &lt;enumeration value="TTRE"/&gt;
 *     &lt;enumeration value="TFOR"/&gt;
 *     &lt;enumeration value="TFIV"/&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *     &lt;enumeration value="FUTU"/&gt;
 *     &lt;enumeration value="ASAP"/&gt;
 *     &lt;enumeration value="ENDC"/&gt;
 *     &lt;enumeration value="WHIF"/&gt;
 *     &lt;enumeration value="WDIS"/&gt;
 *     &lt;enumeration value="WHID"/&gt;
 *     &lt;enumeration value="TBAT"/&gt;
 *     &lt;enumeration value="MONT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementDate2Code")
@XmlEnum
public enum SettlementDate2Code {


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
    MONT;

    public String value() {
        return name();
    }

    public static SettlementDate2Code fromValue(String v) {
        return valueOf(v);
    }

}
