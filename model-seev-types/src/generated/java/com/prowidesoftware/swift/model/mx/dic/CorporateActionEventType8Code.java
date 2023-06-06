
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionEventType8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="ATTI"/>
 *     <enumeration value="BIDS"/>
 *     <enumeration value="BONU"/>
 *     <enumeration value="BPUT"/>
 *     <enumeration value="BRUP"/>
 *     <enumeration value="CAPG"/>
 *     <enumeration value="CAPI"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="CHAN"/>
 *     <enumeration value="CLSA"/>
 *     <enumeration value="CONS"/>
 *     <enumeration value="CONV"/>
 *     <enumeration value="COOP"/>
 *     <enumeration value="DECR"/>
 *     <enumeration value="DETI"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="DLST"/>
 *     <enumeration value="DRAW"/>
 *     <enumeration value="DRIP"/>
 *     <enumeration value="DSCL"/>
 *     <enumeration value="DTCH"/>
 *     <enumeration value="DVCA"/>
 *     <enumeration value="DVOP"/>
 *     <enumeration value="DVSC"/>
 *     <enumeration value="DVSE"/>
 *     <enumeration value="EXOF"/>
 *     <enumeration value="EXRI"/>
 *     <enumeration value="EXTM"/>
 *     <enumeration value="EXWA"/>
 *     <enumeration value="CAPD"/>
 *     <enumeration value="INCR"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="MCAL"/>
 *     <enumeration value="MRGR"/>
 *     <enumeration value="ODLT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PARI"/>
 *     <enumeration value="PCAL"/>
 *     <enumeration value="PDEF"/>
 *     <enumeration value="PINK"/>
 *     <enumeration value="PLAC"/>
 *     <enumeration value="PPMT"/>
 *     <enumeration value="PRED"/>
 *     <enumeration value="PRII"/>
 *     <enumeration value="PRIO"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="REDO"/>
 *     <enumeration value="REMK"/>
 *     <enumeration value="RHDI"/>
 *     <enumeration value="RHTS"/>
 *     <enumeration value="SHPR"/>
 *     <enumeration value="SMAL"/>
 *     <enumeration value="SOFF"/>
 *     <enumeration value="SPLF"/>
 *     <enumeration value="SPLR"/>
 *     <enumeration value="SUSP"/>
 *     <enumeration value="TEND"/>
 *     <enumeration value="TREC"/>
 *     <enumeration value="WRTH"/>
 *     <enumeration value="WTRC"/>
 *     <enumeration value="CREV"/>
 *     <enumeration value="DRCA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionEventType8Code")
@XmlEnum
public enum CorporateActionEventType8Code {


    /**
     * Trading in security has commenced or security has been re-activated after a suspension in trading.
     * 
     */
    ACTV,

    /**
     * Combination of different security types to create a unit. Units are usually comprised of warrants and bonds or warrants and equities. Securities may be combined at the request of the security holder or based on market convention.
     * 
     */
    ATTI,

    /**
     * Repurchase offer/Issuer bid/ Reverse rights. Offer to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity. The objective of the offer is to reduce the number of outstanding equities.
     * 
     */
    BIDS,

    /**
     * Event is a bonus issue or scrip issue or capitalisation issue. Security holders are awarded additional assets free of payment from the issuer in proportion to their holding. A bonus issue is typically represented by shares, rights or warrants. Nominal value doesn't change. Holder may be offered choice of form.
     * 
     */
    BONU,

    /**
     * Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and with no reduction in nominal value.
     * 
     */
    BPUT,

    /**
     * Legal status of a company unable to pay creditors. Bankruptcy usually involves a formal court ruling. Securities may become valueless.
     * 
     */
    BRUP,

    /**
     * Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or Sicavs are recipients of capital gains distributions and are often reinvested in additional shares of the fund.
     * 
     */
    CAPG,

    /**
     * Increase of the current principal of a debt instrument without increasing the nominal value. It normally arises from the incorporation of due but unpaid interest into the principal. This is commonly done by increasing the pool factor value, eg, capitalisation, and negative amortisation.
     * 
     */
    CAPI,

    /**
     * Non-US beneficial owner certification requirement for exchange of temporary to permanent notes.
     * 
     */
    CERT,

    /**
     * Information regarding a change further described in the corporate action details.
     * 
     */
    CHAN,

    /**
     * Situation where interested parties seek restitution for financial loss. The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction.
     * 
     */
    CLSA,

    /**
     * Procedure that aims to obtain consent of holder to a proposal by the issuer or a third party intended to progress an event to the next stage. This procedure is not required to be linked to the organisation of a formal meeting. For example, consent to approve a plan of reorganisation for a bankruptcy proceeding.
     * 
     */
    CONS,

    /**
     * Conversion of securities ( generally convertible bonds or preferred shares) into another form of securities ( usually common shares) at a pre-stated price/ratio.
     * 
     */
    CONV,

    /**
     * A Company Option may be granted by the company, allowing the holder to take up shares at some future date(s) at a pre arranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date.
     * 
     */
    COOP,

    /**
     * Reduction of face value of a single share or the value of fund assets. The number of circulating shares/units remains unchanged. This event may include a cash payout to holders.
     * 
     */
    DECR,

    /**
     * Separation of components that comprise a security, eg, usually units comprised of warrants and bond or warrants and equity. Units may be broken up at the request of the security holder or based on market convention.
     * 
     */
    DETI,

    /**
     * Failure by the company to perform obligations defined as default events under the bond agreement and that have not been remedied.
     * 
     */
    DFLT,

    /**
     * Security is no longer able to comply with the listing requirements of a stock exchange and is removed from official board quotation.
     * 
     */
    DLST,

    /**
     * Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and with no reduction in nominal value.
     * 
     */
    DRAW,

    /**
     * Event is a dividend payment type where cash dividend is rolled over into additional shares in the issuing company.
     * 
     */
    DRIP,

    /**
     * Requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer.
     * 
     */
    DSCL,

    /**
     * An action by a party wishing to acquire a security. Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer.
     * 
     */
    DTCH,

    /**
     * Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency.
     * 
     */
    DVCA,

    /**
     * Event is a distribution of a dividend to shareholders with the choice of payment method. The shareholder must choose the form of payment - stock, cash, or both.
     * 
     */
    DVOP,

    /**
     * Scrip Dividend/Payment. Dividend or interest paid in the form of scrip.
     * 
     */
    DVSC,

    /**
     * Event is a dividend paid to shareholders in the form of shares of stock in the issuing company or in another company. The shareholder must take stock and is not offered a choice in the form of distribution.
     * 
     */
    DVSE,

    /**
     * Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example "exchange offer", "capital reorganisation" or "funds separation".
     * 
     */
    EXOF,

    /**
     * Call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI). This code is used for the second event, when an intermediate securities' issue (rights/coupons) is composed of two events, the first event being the distribution of intermediate securities.
     * 
     */
    EXRI,

    /**
     * As stipulated in a bond's Terms and Conditions, the issuer or the bond-holder may prolong the maturity date of a bond. After extension, the security may differ from original issue (new rate or maturity date). May be subject to bondholder's approval.
     * 
     */
    EXTM,

    /**
     * Option offered to holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue).
     * 
     */
    EXWA,

    /**
     * The Corporate event pays shareholders an amount in cash issued from the Capital account. There is no reduction to the face value of a single share (or the share has no par value). The number of circulating shares remains unchanged.
     * 
     */
    CAPD,

    /**
     * Increase in the face value of a single security. The number of circulating securities remains unchanged.
     * 
     */
    INCR,

    /**
     * Regular interest payment distributed to holders of an interest bearing asset.
     * 
     */
    INTR,

    /**
     * A distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security.
     * 
     */
    LIQU,

    /**
     * The redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, eg, asset manager,before final maturity.
     * 
     */
    MCAL,

    /**
     * Event is a mandatory or voluntary exchange of outstanding securities as the result of two or more companies combining assets. Cash payments may accompany share exchange.
     * 
     */
    MRGR,

    /**
     * Odd Lot Sale/Purchase. Sale or purchase of odd-lots to/from the issuing company, initiated either by the holder of the security or through an offer made by the issuer.
     * 
     */
    ODLT,

    /**
     * Other event, use only when no other event type applies, eg, a new event type.
     * 
     */
    OTHR,

    /**
     * Occurs when securities with different characteristics, eg, shares with different entitlements to dividend or voting rights, become identical in all respects, eg, pari-passu or assimilation. May be scheduled in advance, eg, shares resulting from a bonus may become fungible after a pre-set period of time, or may result from outside events, eg, merger, reorganisation, issue of supplementary tranches, etc.
     * 
     */
    PARI,

    /**
     * Securities are redeemed in part before their scheduled final maturity date with reduction of the nominal value of the shares. The outstanding amount of securities will be reduced proportionally.
     * 
     */
    PCAL,

    /**
     * Also called partial defeasance. Issuer has money set aside to redeem a portion of an issue and the indenture states that the securities could be called earlier than the stated maturity.
     * 
     */
    PDEF,

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
     * An instalment towards the purchase of equity capital, subject to an agreement between an issuer and a purchaser.
     * 
     */
    PPMT,

    /**
     * Securities are redeemed in part before their scheduled final maturity date without reduction of the nominal value of the shares. This is commonly done by pool factor reduction.
     * 
     */
    PRED,

    /**
     * An event which consists of two components, the decrease of the amortized value of a pool factor security and an interest payment.
     * 
     */
    PRII,

    /**
     * Form of open or public offer where, due to a limited amount of securities available, priority is given to existing shareholders.
     * 
     */
    PRIO,

    /**
     * The redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, eg, asset manager, at final maturity.
     * 
     */
    REDM,

    /**
     * Event by which the unit (currency and/or nominal) of a security is restated, eg, nominal/par value of security in a national currency is restated in another currency.
     * 
     */
    REDO,

    /**
     * Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders.
     * 
     */
    REMK,

    /**
     * The distribution of intermediate securities or privilege that gives the holder the right to take part in a future event.
     * 
     */
    RHDI,

    /**
     * Rights Issue/ Subscription Rights/ Rights Offer. Distribution of a security or privilege that gives the holder an entitlement or right to take part in a future event.
     * 
     */
    RHTS,

    /**
     * This corporate event pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications.
     * 
     */
    SHPR,

    /**
     * Modification of the smallest negotiable unit of shares in order to obtain a new negotiable unit.
     * 
     */
    SMAL,

    /**
     * Event is a demerger or distribution or an unbundling. It is a distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares. A spin-off represents a form of divestiture resulting in an independent company. Normally this is without cost to the parent issue shareholder.
     * 
     */
    SOFF,

    /**
     * Event is a change in nominal value, a subdivision. It is an increase in a corporation's number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly.
     * 
     */
    SPLF,

    /**
     * Event is a change in nominal value, a consolidation. It is a decrease in number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly.
     * 
     */
    SPLR,

    /**
     * Trading in the security has been suspended.
     * 
     */
    SUSP,

    /**
     * Event is an acquisition or take-over or offre publique de retrait (FR) or purchase offer or buy-back. It is an offer made to shareholders requesting them to sell (tender) their shares for a specified price usually at a premium over prevailing market price. Generally, the objective of a tender offer is to take control of the target company.
     * 
     */
    TEND,

    /**
     * Event related to tax reclaim activities.
     * 
     */
    TREC,

    /**
     * Booking out of valueless securities.
     * 
     */
    WRTH,

    /**
     * Certification process for withholding tax reduction or exemption based on the tax status of the holder.
     * 
     */
    WTRC,

    /**
     * An occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill its financial obligations (as defined in terms and conditions).
     * 
     */
    CREV,

    /**
     * Distribution to shareholders of cash resulting from the selling of non-eligible securities, for example, in the frame of a depositary receipt program.
     * 
     */
    DRCA;

    public String value() {
        return name();
    }

    public static CorporateActionEventType8Code fromValue(String v) {
        return valueOf(v);
    }

}
