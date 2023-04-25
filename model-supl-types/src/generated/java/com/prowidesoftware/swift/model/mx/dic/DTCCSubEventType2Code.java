
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCCSubEventType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCCSubEventType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPTO"/>
 *     <enumeration value="DRPD"/>
 *     <enumeration value="PLCL"/>
 *     <enumeration value="BLOT"/>
 *     <enumeration value="RMRK"/>
 *     <enumeration value="UNWD"/>
 *     <enumeration value="SHEX"/>
 *     <enumeration value="STDT"/>
 *     <enumeration value="XFER"/>
 *     <enumeration value="SOPT"/>
 *     <enumeration value="MBCK"/>
 *     <enumeration value="SALE"/>
 *     <enumeration value="PRNI"/>
 *     <enumeration value="POPI"/>
 *     <enumeration value="DRPI"/>
 *     <enumeration value="MROS"/>
 *     <enumeration value="SHPP"/>
 *     <enumeration value="OPOF"/>
 *     <enumeration value="TWRI"/>
 *     <enumeration value="CILI"/>
 *     <enumeration value="BTST"/>
 *     <enumeration value="FTPR"/>
 *     <enumeration value="ADRS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCCSubEventType2Code")
@XmlEnum
public enum DTCCSubEventType2Code {


    /**
     * Identifies an event (for example Cash Dividend) where DTC (the Depository Trust Company) offers a DRIP option as a default option (holder must opt out of the DRIP Option).
     * 
     */
    OPTO,

    /**
     * Identifies an event where the Issue is eligible for a Dividend Reinvestment program at DTCC (The Depository Trust and Clearing Corporation).
     * 
     */
    DRPD,

    /**
     * Identifies a change in the place where the security is listed.
     * 
     */
    PLCL,

    /**
     * Identifies a change in Board Lot size.
     * 
     */
    BLOT,

    /**
     * Identifies an event that involves a Stock Purchase Contract product that is offering an early settlement or remarketing feature prior to the contract's expiration.
     * 
     */
    RMRK,

    /**
     * Identifies an event where "unwinding" of the basket of securities occurs.
     * 
     */
    UNWD,

    /**
     * Identifies an event where two companies exchange their shares during a merger. After the share exchange, one company becomes a subsidiary of the other and is no longer listed. Usually applicable to an event in JP markets.
     * 
     */
    SHEX,

    /**
     * Identifies an event where one company merges with the other and assumes the name of the surviving company. It is the standard market-accepted merger. Usually applicable to an event in JP markets.
     * 
     */
    STDT,

    /**
     * Identifies an event where one company transfers all of its shares to a newly created company. Usually applicable to an event in JP markets.
     * 
     */
    XFER,

    /**
     * Indicates an event where the Issue has an early redemption feature. This feature allows the holder to elect to sell bonds back to the issuer on a predetermined basis (excluding monthly) according to specific priorities.
     * 
     */
    SOPT,

    /**
     * Indicates an event where the issue has an early redemption feature that allows the holder to elect to sell bonds back to the issuer on a monthly basis, according to specified conditions.
     * 
     */
    MBCK,

    /**
     * Identifies an event where the distribution is from the proceeds of the sale of assets.
     * 
     */
    SALE,

    /**
     * Identifies an event where the company is not issuing a security with the right to subscribe for additional shares. In these instances, a User CUSIP is created by DTC (The Depository Trust Company) as opposed to a company-issued CUSIP in order to identify these issues.
     * 
     */
    PRNI,

    /**
     * Identifies sale of rights event where issuers redeem poison pill rights.
     * 
     */
    POPI,

    /**
     * Identifies an event where the issuer offers a dividend reinvestment program that is not processed by DTC (the Depository Trust Company).
     * 
     */
    DRPI,

    /**
     * Identifies an event where redemption shares are issued in addition to shares of the original security. This is related to the Mandatory Exchange event with the same sub-event type name.
     * 
     */
    MROS,

    /**
     * Identifies an event involving the offer of shares by a corporation listed on the Australia Stock Exchange, in which ASIC will give relief so that the company can offer existing shareholders the opportunity to acquire small numbers of additional shares without needing a disclosure document or Product Disclosure Statement (PDS).
     * 
     */
    SHPP,

    /**
     * Identifies an event in certain markets where underlying rights are not issued.
     * 
     */
    OPOF,

    /**
     * Identifies a tender offer event on a Rights security. Holders must submit both the ordinary share(s) and right(s) to be eligible to receive the tender consideration. The ratio of ordinary shares to rights is defined in the offer.
     * 
     */
    TWRI,

    /**
     * Identifies DTC (the Depository Trust Company) specific sub-event where holders can elect to "sell" whole shares to satisfy fractional entitlements (usually as a result of a merger) at the beneficial owner level.
     * 
     */
    CILI,

    /**
     * Identifies a tender offer event in which the holder can choose the price at which they are willing to tender their securities. This price may or may not be accepted by the offeror.
     * 
     */
    BTST,

    /**
     * Identifies a tender offer event made by another company to purchase a portion or all of the outstanding shares.
     * 
     */
    FTPR,

    /**
     * Identifies when the event security is an ADR. The underlying security is American Depositary Receipt.
     * 
     */
    ADRS;

    public String value() {
        return name();
    }

    public static DTCCSubEventType2Code fromValue(String v) {
        return valueOf(v);
    }

}
