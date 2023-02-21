
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventType29Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionEventType29Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="ATTI"/&gt;
 *     &lt;enumeration value="BRUP"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="BONU"/&gt;
 *     &lt;enumeration value="EXRI"/&gt;
 *     &lt;enumeration value="CAPD"/&gt;
 *     &lt;enumeration value="CAPG"/&gt;
 *     &lt;enumeration value="CAPI"/&gt;
 *     &lt;enumeration value="DRCA"/&gt;
 *     &lt;enumeration value="DVCA"/&gt;
 *     &lt;enumeration value="CHAN"/&gt;
 *     &lt;enumeration value="COOP"/&gt;
 *     &lt;enumeration value="CLSA"/&gt;
 *     &lt;enumeration value="CONS"/&gt;
 *     &lt;enumeration value="CONV"/&gt;
 *     &lt;enumeration value="CREV"/&gt;
 *     &lt;enumeration value="DECR"/&gt;
 *     &lt;enumeration value="DETI"/&gt;
 *     &lt;enumeration value="DSCL"/&gt;
 *     &lt;enumeration value="DVOP"/&gt;
 *     &lt;enumeration value="DRIP"/&gt;
 *     &lt;enumeration value="DRAW"/&gt;
 *     &lt;enumeration value="DTCH"/&gt;
 *     &lt;enumeration value="EXOF"/&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="MCAL"/&gt;
 *     &lt;enumeration value="INCR"/&gt;
 *     &lt;enumeration value="PPMT"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="RHDI"/&gt;
 *     &lt;enumeration value="LIQU"/&gt;
 *     &lt;enumeration value="EXTM"/&gt;
 *     &lt;enumeration value="MRGR"/&gt;
 *     &lt;enumeration value="NOOF"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *     &lt;enumeration value="ODLT"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PARI"/&gt;
 *     &lt;enumeration value="PCAL"/&gt;
 *     &lt;enumeration value="PRED"/&gt;
 *     &lt;enumeration value="PINK"/&gt;
 *     &lt;enumeration value="PLAC"/&gt;
 *     &lt;enumeration value="PDEF"/&gt;
 *     &lt;enumeration value="PRIO"/&gt;
 *     &lt;enumeration value="BPUT"/&gt;
 *     &lt;enumeration value="REDO"/&gt;
 *     &lt;enumeration value="REMK"/&gt;
 *     &lt;enumeration value="BIDS"/&gt;
 *     &lt;enumeration value="SPLR"/&gt;
 *     &lt;enumeration value="RHTS"/&gt;
 *     &lt;enumeration value="DVSC"/&gt;
 *     &lt;enumeration value="SHPR"/&gt;
 *     &lt;enumeration value="SMAL"/&gt;
 *     &lt;enumeration value="SOFF"/&gt;
 *     &lt;enumeration value="DVSE"/&gt;
 *     &lt;enumeration value="SPLF"/&gt;
 *     &lt;enumeration value="TREC"/&gt;
 *     &lt;enumeration value="TEND"/&gt;
 *     &lt;enumeration value="DLST"/&gt;
 *     &lt;enumeration value="SUSP"/&gt;
 *     &lt;enumeration value="EXWA"/&gt;
 *     &lt;enumeration value="WTRC"/&gt;
 *     &lt;enumeration value="WRTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionEventType29Code")
@XmlEnum
public enum CorporateActionEventType29Code {


    /**
     * Trading in the security has commenced or security has been re-activated after a suspension in trading.
     * 
     */
    ACTV,

    /**
     * Combination of different security types to create a unit. Units are usually comprised of warrants and bonds or warrants and equities. Securities may be combined at the request of the security holder or based on market convention.
     * 
     */
    ATTI,

    /**
     * Legal status of a company unable to pay creditors. Bankruptcy usually involves a formal court ruling. Securities may become valueless.
     * 
     */
    BRUP,

    /**
     * Failure by the company to perform obligations defined as default events under the bond agreement and that have not been remedied.
     * 
     */
    DFLT,

    /**
     * Bonus or capitalisation issue. Security holders receive additional assets free of payment from the issuer, in proportion to their holding.
     * 
     */
    BONU,

    /**
     * Call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI). This code is used for the second event, when an intermediate securities' issue (rights/coupons) is composed of two events, the first event being the distribution of intermediate securities.
     * 
     */
    EXRI,

    /**
     * Corporate event pays shareholders an amount in cash issued from the capital account. There is no reduction to the face value of a single share (or the share has no par value). The number of circulating shares remains unchanged.
     * 
     */
    CAPD,

    /**
     * Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or SICAVs are recipients of capital gains distributions and are often reinvested in additional shares of the fund.
     * 
     */
    CAPG,

    /**
     * Increase of the current principal of a debt instrument without increasing the nominal value. It normally arises from the incorporation of due but unpaid interest into the principal. This is commonly done by increasing the pool factor value, for example, capitalisation, and negative amortisation.
     * 
     */
    CAPI,

    /**
     * Distribution to shareholders of cash resulting from the selling of non-eligible securities, for example, in the frame of a depositary receipt program.
     * 
     */
    DRCA,

    /**
     * Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency.
     * 
     */
    DVCA,

    /**
     * Information regarding a change further described in the corporate action details.
     * 
     */
    CHAN,

    /**
     * Company option may be granted by the company, allowing the holder to take up shares at some future date(s) at a pre arranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date.
     * 
     */
    COOP,

    /**
     * Situation where interested parties seek restitution for financial loss. The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction.
     * 
     */
    CLSA,

    /**
     * Procedure that aims to obtain consent of holder to a proposal by the issuer or a third party without convening a meeting. For example, consent to change the terms of a bond.
     * 
     */
    CONS,

    /**
     * Conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price/ratio.
     * 
     */
    CONV,

    /**
     * Occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill its financial obligations (as defined in terms and conditions).
     * 
     */
    CREV,

    /**
     * Reduction of face value of a single share or the value of fund assets. The number of circulating shares/units remains unchanged. This event may include a cash payout to holders.
     * 
     */
    DECR,

    /**
     * Separation of components that comprise a security, for example, usually units comprised of warrants and bond or warrants and equity. Units may be broken up at the request of the security holder or based on market convention.
     * 
     */
    DETI,

    /**
     * Requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer.
     * 
     */
    DSCL,

    /**
     * Distribution of a dividend to shareholders with a choice of benefit to receive. Shareholders may choose to receive shares or cash. To be distinguished from DRIP as the company creates new share capital in exchange for the dividend rather than investing the dividend in the market.
     * 
     */
    DVOP,

    /**
     * Dividend payment where holders can keep cash or have the cash reinvested in the market by the issuer into additional shares in the issuing company. To be distinguished from DVOP as the company invests the dividend in the market rather than creating new share capital in exchange for the dividend.
     * 
     */
    DRIP,

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
     * Redemption of an entire issue outstanding of securities, for example, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager, before final maturity.
     * 
     */
    MCAL,

    /**
     * Increase in the face value of a single security. The number of circulating securities remains unchanged.
     * 
     */
    INCR,

    /**
     * Instalment towards the purchase of equity capital, subject to an agreement between an issuer and a purchaser.
     * 
     */
    PPMT,

    /**
     * Interest payment distributed to holders of an interest bearing asset.
     * 
     */
    INTR,

    /**
     * Distribution of intermediate securities that gives the holder the right to take part in a future event.
     * 
     */
    RHDI,

    /**
     * Distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security.
     * 
     */
    LIQU,

    /**
     * As stipulated in the security's Terms and Conditions, the issuer or the holder may prolong the maturity date of a security. After extension, the security details may differ from the original issue. An issuer initiated extension may be subject to holder's approval.
     * 
     */
    EXTM,

    /**
     * Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange.
     * 
     */
    MRGR,

    /**
     * Offers that are not supervised or regulated by an official entity and being offered by a party, for example a broker, usually at a discount price, for example broker offer, mini-tender, mini odd lot offer or third party offer.
     * 
     */
    NOOF,

    /**
     * Non-US beneficial owner certification requirement for exchange of temporary to permanent notes.
     * 
     */
    CERT,

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
     * Occurs when securities with different characteristics, for example, shares with different entitlements to dividend or voting rights, become identical in all respects, for example, pari-passu or assimilation. May be scheduled in advance, for example, shares resulting from a bonus may become fungible after a pre-set period of time, or may result from outside events, for example, merger, reorganisation, issue of supplementary tranches.
     * 
     */
    PARI,

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
     * Changes in the state of incorporation for US companies and changes in the place of incorporation for foreign companies. Where shares need to be registered following the incorporation change, the holder(s) may have to elect the registrar.
     * 
     */
    PLAC,

    /**
     * Also called partial defeasance. Issuer has money set aside to redeem a portion of an issue and the indenture states that the securities could be called earlier than the stated maturity.
     * 
     */
    PDEF,

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
     * Event by which the unit (currency and/or nominal) of a security is restated, for example, nominal/par value of security in a national currency is restated in another currency.
     * 
     */
    REDO,

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
     * Offer to holders of a security to subscribe for additional securities via the distribution of an intermediate security. Both processes are included in the same event.
     * 
     */
    RHTS,

    /**
     * Dividend or interest paid in the form of scrip.
     * 
     */
    DVSC,

    /**
     * Corporate event pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications.
     * 
     */
    SHPR,

    /**
     * Modification of the smallest negotiable unit of shares in order to obtain a new negotiable unit.
     * 
     */
    SMAL,

    /**
     * Distribution of securities issued by another company. The distributed securities may either be of a newly created or of an existing company. For example, spin-off, demerger, unbundling, divestment.
     * 
     */
    SOFF,

    /**
     * Dividend paid to shareholders in the form of equities of the issuing corporation.
     * 
     */
    DVSE,

    /**
     * Increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly.
     * 
     */
    SPLF,

    /**
     * Event related to tax reclaim activities.
     * 
     */
    TREC,

    /**
     * Offer made to holders by a third party, requesting them to sell (tender) or exchange their securities.
     * 
     */
    TEND,

    /**
     * Security is no longer able to comply with the listing requirements of a stock exchange and is removed from official board quotation.
     * 
     */
    DLST,

    /**
     * Trading in the security has been suspended.
     * 
     */
    SUSP,

    /**
     * Option offered to holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue).
     * 
     */
    EXWA,

    /**
     * Certification process for withholding tax reduction or exemption based on the tax status of the holder.
     * 
     */
    WTRC,

    /**
     * Booking out of valueless securities.
     * 
     */
    WRTH;

    public String value() {
        return name();
    }

    public static CorporateActionEventType29Code fromValue(String v) {
        return valueOf(v);
    }

}
