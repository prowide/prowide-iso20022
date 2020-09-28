
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionEventType13Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCU"/&gt;
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
 *     &lt;enumeration value="CLSA"/&gt;
 *     &lt;enumeration value="COOP"/&gt;
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
 *     &lt;enumeration value="PRII"/&gt;
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
@XmlType(name = "CorporateActionEventType13Code")
@XmlEnum
public enum CorporateActionEventType13Code {


    /**
     * Funds related event in which the income (for example accumulation units) that accrues during an accounting period is retained within the fund instead of being paid away to investors. The retained income is nonetheless deemed to have been distributed to investors for tax purposes. 
     * 
     */
    ACCU,

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
     * Event is a bonus issue or scrip issue or capitalisation issue. Security holders are awarded additional assets free of payment from the issuer in proportion to their holding. A bonus issue is typically represented by shares, rights or warrants. Nominal value doesn't change. Holder may be offered choice of form.
     * 
     */
    BONU,

    /**
     * Call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI). This code is used for the second event, when an intermediate securities' issue (rights/coupons) is composed of two events, the first event being the distribution of intermediate securities.
     * 
     */
    EXRI,

    /**
     * The Corporate event pays shareholders an amount in cash issued from the Capital account. There is no reduction to the face value of a single share (or the share has no par value). The number of circulating shares remains unchanged.
     * 
     */
    CAPD,

    /**
     * Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or Sicavs are recipients of capital gains distributions and are often reinvested in additional shares of the fund.
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
     * Situation where interested parties seek restitution for financial loss. The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction.
     * 
     */
    CLSA,

    /**
     * A Company Option may be granted by the company, allowing the holder to take up shares at some future date(s) at a pre arranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date.
     * 
     */
    COOP,

    /**
     * Procedure that aims to obtain consent of holder  to a proposal by the issuer or a third party without convening a meeting. For example, consent to change the terms of a bond.
     * 
     */
    CONS,

    /**
     * Conversion of securities ( generally convertible bonds or preferred shares) into another form of securities ( usually common shares) at a pre-stated price/ratio.
     * 
     */
    CONV,

    /**
     * An occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill his financial obligations (as defined in terms and conditions).
     * 
     */
    CREV,

    /**
     * Reduction of face value of a single share or the value of fund assets. The number of circulating shares/units remains unchanged. This event may include a cash payout to holders.
     * 
     */
    DECR,

    /**
     * Separation of components that comprise a security, for example, usually units comprised of warrants and bond or warrants and equity . Units may be broken up at the request of the security holder or based on market convention.
     * 
     */
    DETI,

    /**
     * Requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer.
     * 
     */
    DSCL,

    /**
     * Event is a distribution of a dividend to shareholders with the choice of payment method. The shareholder must choose the form of payment - stock, cash, or both.
     * 
     */
    DVOP,

    /**
     * Event is a dividend payment type where cash dividend is rolled over into additional shares in the issuing company.
     * 
     */
    DRIP,

    /**
     * Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and with no reduction in nominal value.
     * 
     */
    DRAW,

    /**
     * An action by a party wishing to acquire a security. Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer.
     * 
     */
    DTCH,

    /**
     * Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example "exchange offer", "capital reorganisation" or "funds separation" .
     * 
     */
    EXOF,

    /**
     * The redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager, at final maturity.
     * 
     */
    REDM,

    /**
     * The redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager,before final maturity.
     * 
     */
    MCAL,

    /**
     * Increase in the face value of a single security. The number of circulating securities remains unchanged .
     * 
     */
    INCR,

    /**
     * An instalment towards the purchase of equity capital, subject to an agreement between an issuer and a purchaser.
     * 
     */
    PPMT,

    /**
     * Interest payment distributed to holders of an interest bearing asset.
     * 
     */
    INTR,

    /**
     * An event which consists of two components, the decrease of the amortized value of a pool factor security and an interest payment.
     * 
     */
    PRII,

    /**
     * The distribution of intermediate securities that gives the holder the right to take part in a future event.
     * 
     */
    RHDI,

    /**
     * A distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security.
     * 
     */
    LIQU,

    /**
     * As stipulated in a bond's Terms and Conditions, the issuer or the bond-holder may prolong the maturity date of a bond. After extension, the security may differ from original issue (new rate or maturity date). May be subject to bondholder's approval.
     * 
     */
    EXTM,

    /**
     * Event is a mandatory or voluntary exchange of outstanding securities as the result of two or more companies combining assets. Cash payments may accompany share exchange.
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
     * Odd Lot Sale/Purchase . Sale or purchase of odd-lots to/from the issuing company, initiated either by the holder of the security or through an offer made by the issuer.
     * 
     */
    ODLT,

    /**
     * Other event, use only when no other event type applies, for example, a new event type.
     * 
     */
    OTHR,

    /**
     * Occurs when securities with different characteristics, for example, shares with different entitlements to dividend or voting rights, become identical in all respects, for example , pari-passu or assimilation. May be scheduled in advance, for example, shares resulting from a bonus may become fungible after a pre-set period of time, or may result from outside events, for example, merger, reorganisation, issue of supplementary tranches.
     * 
     */
    PARI,

    /**
     * Securities are redeemed in part before their scheduled final maturity date with reduction of the nominal value of the shares. The outstanding amount of securities will be reduced proportionally.
     * 
     */
    PCAL,

    /**
     * Securities are redeemed in part before their scheduled final maturity date without reduction of the nominal value of the shares. This is commonly done by pool factor reduction.
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
     * Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and with no reduction in nominal value.
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
     * Repurchase offer/Issuer bid/ Reverse rights. Offer to existing holders by the issuing company to repurchase its own securities. The objective of the offer is to reduce the number of outstanding securities.
     * 
     */
    BIDS,

    /**
     * Event is a change in nominal value, a consolidation. It is a decrease in number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly.
     * 
     */
    SPLR,

    /**
     * Rights Issue/ Subscription Rights/ Rights Offer. Offer to holders of a security to subscribe for additional securities via the distribution of an intermediate security. Both processes are included in the same event.
     * 
     */
    RHTS,

    /**
     * Scrip Dividend/Payment. Dividend or interest paid in the form of scrip.
     * 
     */
    DVSC,

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
     * Event is a dividend paid to shareholders in the form of shares of stock in the issuing company or in another company. The shareholder must take stock and is not offered a choice in the form of distribution.
     * 
     */
    DVSE,

    /**
     * Event is a change in nominal value, a subdivision. It is an increase in a corporation's number of outstanding shares of stock without any change in the shareholder's equity or the aggregate market value at the time of the split. Stock price and nominal value are reduced accordingly.
     * 
     */
    SPLF,

    /**
     * Event related to tax reclaim activities.
     * 
     */
    TREC,

    /**
     * Event is an acquisition or take-over or offre publique de retrait (FR) or purchase offer. It is an offer made to holders by a third party, requesting them to sell (tender) or exchange their securities.
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

    public static CorporateActionEventType13Code fromValue(String v) {
        return valueOf(v);
    }

}
