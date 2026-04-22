
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntermediateSecurityDistributionType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IntermediateSecurityDistributionType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BIDS"/>
 *     <enumeration value="DRIP"/>
 *     <enumeration value="DVCA"/>
 *     <enumeration value="DVOP"/>
 *     <enumeration value="EXRI"/>
 *     <enumeration value="PRIO"/>
 *     <enumeration value="DVSC"/>
 *     <enumeration value="DVSE"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="SOFF"/>
 *     <enumeration value="SPLF"/>
 *     <enumeration value="BONU"/>
 *     <enumeration value="EXOF"/>
 *     <enumeration value="MRGR"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IntermediateSecurityDistributionType6Code")
@XmlEnum
public enum IntermediateSecurityDistributionType6Code {


    /**
     * Offer to existing holders by the issuing company to repurchase its own securities. The objective of the offer is to reduce the number of outstanding securities.
     * 
     */
    BIDS,

    /**
     * Dividend payment where holders can keep cash or have the cash reinvested in the market by the issuer into additional shares in the issuing company. To be distinguished from DVOP as the company invests the dividend in the market rather than creating new share capital in exchange for the dividend.
     * 
     */
    DRIP,

    /**
     * Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency.
     * 
     */
    DVCA,

    /**
     * Distribution of dividend option.
     * 
     */
    DVOP,

    /**
     * Call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI). This code is used for the second event, when an intermediate securities' issue (rights/coupons) is composed of two events, the first event being the distribution of intermediate securities.
     * 
     */
    EXRI,

    /**
     * Form of open or public offer where, due to a limited amount of securities available, priority is given to existing shareholders.
     * 
     */
    PRIO,

    /**
     * Dividend or interest paid in the form of scrip.
     * 
     */
    DVSC,

    /**
     * Dividend paid to shareholders in the form of equities of the issuing corporation.
     * 
     */
    DVSE,

    /**
     * Interest payment distributed to holders of an interest bearing asset.
     * 
     */
    INTR,

    /**
     * Distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security.
     * 
     */
    LIQU,

    /**
     * Distribution of subsidiary stock to the shareholders.
     * 
     */
    SOFF,

    /**
     * Also known as change in nominal value or subdivision.
     * Increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly.
     * 
     */
    SPLF,

    /**
     * Bonus or capitalisation issue. Security holders receive additional assets free of payment from the issuer, in proportion to their holding.
     * 
     */
    BONU,

    /**
     * Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example "exchange offer", "capital reorganisation" or "funds separation".
     * 
     */
    EXOF,

    /**
     * Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange.
     * 
     */
    MRGR,

    /**
     * Intermediate securities are distributed before the use of them has been established.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static IntermediateSecurityDistributionType6Code fromValue(String v) {
        return valueOf(v);
    }

}
