
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCCSubEventType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCCSubEventType5Code">
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
 *     <enumeration value="WITH"/>
 *     <enumeration value="WITO"/>
 *     <enumeration value="CTAX"/>
 *     <enumeration value="A144"/>
 *     <enumeration value="CASE"/>
 *     <enumeration value="REGS"/>
 *     <enumeration value="NOTI"/>
 *     <enumeration value="RDTH"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="PREQ"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="COTE"/>
 *     <enumeration value="MITE"/>
 *     <enumeration value="SETE"/>
 *     <enumeration value="GDRS"/>
 *     <enumeration value="M871"/>
 *     <enumeration value="C305"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCCSubEventType5Code")
@XmlEnum
public enum DTCCSubEventType5Code {


    /**
     * Identifies an event (for example Cash Dividend) where DTC (the Depository Trust Company) offers a DRIP option as a default option (holder must opt out of the DRIP Option).
     * 
     */
    OPTO("OPTO"),

    /**
     * Identifies an event where the Issue is eligible for a Dividend Reinvestment program at DTCC (The Depository Trust and Clearing Corporation).
     * 
     */
    DRPD("DRPD"),

    /**
     * Identifies a change in the place where the security is listed.
     * 
     */
    PLCL("PLCL"),

    /**
     * Identifies a change in Board Lot size.
     * 
     */
    BLOT("BLOT"),

    /**
     * Identifies an event that involves a Stock Purchase Contract product that is offering an early settlement or remarketing feature prior to the contract's expiration.
     * 
     */
    RMRK("RMRK"),

    /**
     * Identifies an event where "unwinding" of the basket of securities occurs.
     * 
     */
    UNWD("UNWD"),

    /**
     * Identifies an event where two companies exchange their shares during a merger. After the share exchange, one company becomes a subsidiary of the other and is no longer listed. Usually applicable to an event in JP markets.
     * 
     */
    SHEX("SHEX"),

    /**
     * Identifies an event where one company merges with the other and assumes the name of the surviving company. It is the standard market-accepted merger. Usually applicable to an event in JP markets.
     * 
     */
    STDT("STDT"),

    /**
     * Identifies an event where one company transfers all of its shares to a newly created company. Usually applicable to an event in JP markets.
     * 
     */
    XFER("XFER"),

    /**
     * Indicates an event where the Issue has an early redemption feature. This feature allows the holder to elect to sell bonds back to the issuer on a predetermined basis (excluding monthly) according to specific priorities.
     * 
     */
    SOPT("SOPT"),

    /**
     * Indicates an event where the issue has an early redemption feature that allows the holder to elect to sell bonds back to the issuer on a monthly basis, according to specified conditions.
     * 
     */
    MBCK("MBCK"),

    /**
     * Identifies an event where the distribution is from the proceeds of the sale of assets.
     * 
     */
    SALE("SALE"),

    /**
     * Identifies an event where the company is not issuing a security with the right to subscribe for additional shares. In these instances, a User CUSIP is created by DTC (The Depository Trust Company) as opposed to a company-issued CUSIP in order to identify these issues.
     * 
     */
    PRNI("PRNI"),

    /**
     * Identifies sale of rights event where issuers redeem poison pill rights.
     * 
     */
    POPI("POPI"),

    /**
     * Identifies an event where the issuer offers a dividend reinvestment program that is not processed by DTC (the Depository Trust Company).
     * 
     */
    DRPI("DRPI"),

    /**
     * Identifies an event where redemption shares are issued in addition to shares of the original security. This is related to the Mandatory Exchange event with the same sub-event type name.
     * 
     */
    MROS("MROS"),

    /**
     * Identifies an event involving the offer of shares by a corporation listed on the Australia Stock Exchange, in which ASIC will give relief so that the company can offer existing shareholders the opportunity to acquire small numbers of additional shares without needing a disclosure document or Product Disclosure Statement (PDS).
     * 
     */
    SHPP("SHPP"),

    /**
     * Identifies an event in certain markets where underlying rights are not issued.
     * 
     */
    OPOF("OPOF"),

    /**
     * Identifies a tender offer event on a Rights security. Holders must submit both the ordinary share(s) and right(s) to be eligible to receive the tender consideration. The ratio of ordinary shares to rights is defined in the offer.
     * 
     */
    TWRI("TWRI"),

    /**
     * Identifies DTC (the Depository Trust Company) specific sub-event where holders can elect to "sell" whole shares to satisfy fractional entitlements (usually as a result of a merger) at the beneficial owner level.
     * 
     */
    CILI("CILI"),

    /**
     * Identifies a tender offer event in which the holder can choose the price at which they are willing to tender their securities. This price may or may not be accepted by the offeror.
     * 
     */
    BTST("BTST"),

    /**
     * Identifies a tender offer event made by another company to purchase a portion or all of the outstanding shares.
     * 
     */
    FTPR("FTPR"),

    /**
     * Identifies when the event security is an ADR. The underlying security is American Depositary Receipt.
     * 
     */
    ADRS("ADRS"),

    /**
     * Identifies a consent event with payout.
     * 
     */
    WITH("WITH"),

    /**
     * Identifies a consent event without payout.
     * 
     */
    WITO("WITO"),

    /**
     * Identifies an event where a tax credit relating to the Build America Bonds will occur.
     * 
     */
    CTAX("CTAX"),

    /**
     * Identifies an exchange offer on securities that are subject to Securities Rule 144A.
     * 
     */
    @XmlEnumValue("A144")
    A_144("A144"),

    /**
     * Identifies an event where the payout will be both cash and securities.
     * 
     */
    CASE("CASE"),

    /**
     * Identifies an exchange offer on securities that are subject to securities rule Reg S.
     * 
     */
    REGS("REGS"),

    /**
     * Identifies a MMI Important Notice.
     * 
     */
    NOTI("NOTI"),

    /**
     * Identifies an event which will be based on record date holdings.
     * 
     */
    RDTH("RDTH"),

    /**
     * Identifies an event where the payout will be cash.
     * 
     */
    CASH("CASH"),

    /**
     * Identifies an event where the presentation of securities will be required.
     * 
     */
    PREQ("PREQ"),

    /**
     * Identifies an event where the payout will be securities.
     * 
     */
    SECU("SECU"),

    /**
     * Identifies a tender offer with a convert feature.
     * 
     */
    COTE("COTE"),

    /**
     * Identifies when a tender offer is a mini tender.
     * 
     */
    MITE("MITE"),

    /**
     * Identifies when a tender offer is a self tender.
     * 
     */
    SETE("SETE"),

    /**
     * Identifies when the event security is a GDR. The underlying security is a global depositary receipt.
     * 
     */
    GDRS("GDRS"),

    /**
     * Identifies an event which has been considered a dividend equivalent payment under Section 871(m) of the United States Internal Revenue Code.
     * 
     */
    @XmlEnumValue("M871")
    M_871("M871"),

    /**
     * Identifies an event which has been considered a deemed distribution under Section 305(c) of the United States  Internal Revenue Code.
     * 
     */
    @XmlEnumValue("C305")
    C_305("C305");
    private final String value;

    DTCCSubEventType5Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DTCCSubEventType5Code fromValue(String v) {
        for (DTCCSubEventType5Code c: DTCCSubEventType5Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
