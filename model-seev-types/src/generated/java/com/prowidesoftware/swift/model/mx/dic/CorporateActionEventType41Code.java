
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventType41Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionEventType41Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DRIP"/>
 *     <enumeration value="CAPG"/>
 *     <enumeration value="DVCA"/>
 *     <enumeration value="DVOP"/>
 *     <enumeration value="MRGR"/>
 *     <enumeration value="SOFF"/>
 *     <enumeration value="TEND"/>
 *     <enumeration value="BONU"/>
 *     <enumeration value="REDO"/>
 *     <enumeration value="EXOF"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="CONV"/>
 *     <enumeration value="EXRI"/>
 *     <enumeration value="CAPI"/>
 *     <enumeration value="CONS"/>
 *     <enumeration value="COOP"/>
 *     <enumeration value="DRAW"/>
 *     <enumeration value="DTCH"/>
 *     <enumeration value="MCAL"/>
 *     <enumeration value="EXTM"/>
 *     <enumeration value="ODLT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PCAL"/>
 *     <enumeration value="PRED"/>
 *     <enumeration value="PINK"/>
 *     <enumeration value="PRIO"/>
 *     <enumeration value="BPUT"/>
 *     <enumeration value="REMK"/>
 *     <enumeration value="BIDS"/>
 *     <enumeration value="SPLR"/>
 *     <enumeration value="SHPR"/>
 *     <enumeration value="SPLF"/>
 *     <enumeration value="EXWA"/>
 *     <enumeration value="CAPD"/>
 *     <enumeration value="ACCU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionEventType41Code")
@XmlEnum
public enum CorporateActionEventType41Code {


    /**
     * Dividend payment where holders can keep cash or have the cash reinvested in the market by the issuer into additional shares in the issuing company. To be distinguished from DVOP as the company invests the dividend in the market rather than creating new share capital in exchange for the dividend.
     * 
     */
    DRIP,

    /**
     * Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or SICAVs are recipients of capital gains distributions and are often reinvested in additional shares of the fund.
     * 
     */
    CAPG,

    /**
     * Distribution of cash to holders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Holder must take cash and may be offered a choice of currencies.
     * 
     */
    DVCA,

    /**
     * Distribution of a dividend to holders with a choice of benefit to receive additional securities or cash. To be distinguished from DRIP as the company creates new share capital in exchange for the dividend rather than investing the dividend in the market.
     * 
     */
    DVOP,

    /**
     * Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange.
     * 
     */
    MRGR,

    /**
     * Distribution of securities issued by another company. The distributed securities may either be of a newly created or of an existing company. For example, spin-off, demerger, unbundling, divestment.
     * 
     */
    SOFF,

    /**
     * Offer made to holders by a third party, requesting them to sell (tender) or exchange their securities.
     * 
     */
    TEND,

    /**
     * Bonus or capitalisation issue. Security holders receive additional assets free of payment from the issuer, in proportion to their holding.
     * 
     */
    BONU,

    /**
     * Event by which the unit (currency and/or nominal) of a security is restated, for example, nominal/par value of security in a national currency is restated in another currency.
     * 
     */
    REDO,

    /**
     * Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example "exchange offer", "capital reorganisation" or "funds separation".
     * 
     */
    EXOF,

    /**
     * Redemption of an entire issue outstanding of securities, for example, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager, at final maturity.
     * 
     */
    REDM,

    /**
     * Interest payment distributed to holders of an interest bearing asset.
     * 
     */
    INTR,

    /**
     * Conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price/ratio.
     * 
     */
    CONV,

    /**
     * Call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI). This code is used for the second event, when an intermediate securities' issue (rights/coupons) is composed of two events, the first event being the distribution of intermediate securities.
     * 
     */
    EXRI,

    /**
     * Increase of the current principal of a debt instrument without increasing the nominal value. It normally arises from the incorporation of due but unpaid interest into the principal. This is commonly done by increasing the pool factor value, for example, capitalisation, and negative amortisation.
     * 
     */
    CAPI,

    /**
     * Procedure that aims to obtain consent of holder to a proposal by the issuer or a third party without convening a meeting. For example, consent to change the terms of a bond.
     * 
     */
    CONS,

    /**
     * Company option may be granted by the company, allowing the holder to take up shares at some future date(s) at a pre arranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date.
     * 
     */
    COOP,

    /**
     * Securities are redeemed in part before the scheduled final maturity date. It is done without any pool factor reduction. The redemption is reflected in a debit of the face amount (FAMT). Drawing is distinct from partial call since drawn bonds are chosen by lottery. Therefore, not every holder is affected in the same way.
     * 
     */
    DRAW,

    /**
     * Action by a party wishing to acquire a security. Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer.
     * 
     */
    DTCH,

    /**
     * Redemption of an entire issue outstanding of securities, for example, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager, before final maturity.
     * 
     */
    MCAL,

    /**
     * As stipulated in the security's Terms and Conditions, the issuer or the holder may prolong the maturity date of a security. After extension, the security details may differ from the original issue. An issuer initiated extension may be subject to holder's approval.
     * 
     */
    EXTM,

    /**
     * Sale or purchase of odd-lots to/from the issuing company, initiated either by the holder of the security or through an offer made by the issuer.
     * 
     */
    ODLT,

    /**
     * Other event, use only when no other event type applies, for example, a new event type.
     * 
     */
    OTHR,

    /**
     * Securities are redeemed in part before their scheduled final maturity date. It is done without any pool factor reduction. The redemption is reflected in a debit of the face amount (FAMT).
     * 
     */
    PCAL,

    /**
     * Securities are redeemed in part before their scheduled final maturity date. The redemption is reflected in a pool factor reduction. No movement of securities occurs.
     * 
     */
    PRED,

    /**
     * Interest payment, in any kind except cash, distributed to holders of an interest bearing asset.
     * 
     */
    PINK,

    /**
     * Form of open or public offer where, due to a limited amount of securities available, priority is given to existing shareholders.
     * 
     */
    PRIO,

    /**
     * Early redemption of a security at the election of the holder subject to the terms and condition of the issue with no reduction in nominal value.
     * 
     */
    BPUT,

    /**
     * Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders.
     * 
     */
    REMK,

    /**
     * Repurchase offer / issuer bid / reverse rights. Offer to existing holders by the issuing company to repurchase its own securities. The objective of the offer is to reduce the number of outstanding securities.
     * 
     */
    BIDS,

    /**
     * Decrease in a company's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are increased accordingly.
     * 
     */
    SPLR,

    /**
     * Corporate event pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications.
     * 
     */
    SHPR,

    /**
     * Increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly.
     * 
     */
    SPLF,

    /**
     * Option offered to holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue).
     * 
     */
    EXWA,

    /**
     * Corporate event pays shareholders an amount in cash issued from the capital account. There is no reduction to the face value of a single share (or the share has no par value). The number of circulating shares remains unchanged.
     * 
     */
    CAPD,

    /**
     * Funds related event in which the income (for example accumulation units) that accrues during an accounting period is retained within the fund instead of being paid away to investors. The retained income is nonetheless deemed to have been distributed to investors for tax purposes.
     * 
     */
    ACCU;

    public String value() {
        return name();
    }

    public static CorporateActionEventType41Code fromValue(String v) {
        return valueOf(v);
    }

}
