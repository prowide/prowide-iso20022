
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionEventType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="ATTI"/&gt;
 *     &lt;enumeration value="BIDS"/&gt;
 *     &lt;enumeration value="BONU"/&gt;
 *     &lt;enumeration value="BPUT"/&gt;
 *     &lt;enumeration value="BRUP"/&gt;
 *     &lt;enumeration value="CHAN"/&gt;
 *     &lt;enumeration value="CONV"/&gt;
 *     &lt;enumeration value="COOP"/&gt;
 *     &lt;enumeration value="DECR"/&gt;
 *     &lt;enumeration value="DETI"/&gt;
 *     &lt;enumeration value="DLST"/&gt;
 *     &lt;enumeration value="DRAW"/&gt;
 *     &lt;enumeration value="DRIP"/&gt;
 *     &lt;enumeration value="DTCH"/&gt;
 *     &lt;enumeration value="DVOP"/&gt;
 *     &lt;enumeration value="DVSC"/&gt;
 *     &lt;enumeration value="DVSE"/&gt;
 *     &lt;enumeration value="EXOF"/&gt;
 *     &lt;enumeration value="EXRI"/&gt;
 *     &lt;enumeration value="EXWA"/&gt;
 *     &lt;enumeration value="INCR"/&gt;
 *     &lt;enumeration value="LIQU"/&gt;
 *     &lt;enumeration value="MCAL"/&gt;
 *     &lt;enumeration value="MRGR"/&gt;
 *     &lt;enumeration value="ODLT"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PARI"/&gt;
 *     &lt;enumeration value="PCAL"/&gt;
 *     &lt;enumeration value="PDEF"/&gt;
 *     &lt;enumeration value="PINK"/&gt;
 *     &lt;enumeration value="PLAC"/&gt;
 *     &lt;enumeration value="PPMT"/&gt;
 *     &lt;enumeration value="PRII"/&gt;
 *     &lt;enumeration value="PRIO"/&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="REDO"/&gt;
 *     &lt;enumeration value="REMK"/&gt;
 *     &lt;enumeration value="RHDI"/&gt;
 *     &lt;enumeration value="RHTS"/&gt;
 *     &lt;enumeration value="SMAL"/&gt;
 *     &lt;enumeration value="SOFF"/&gt;
 *     &lt;enumeration value="SPLF"/&gt;
 *     &lt;enumeration value="SPLR"/&gt;
 *     &lt;enumeration value="SUSP"/&gt;
 *     &lt;enumeration value="TEND"/&gt;
 *     &lt;enumeration value="WRTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionEventType3Code")
@XmlEnum
public enum CorporateActionEventType3Code {


    /**
     * Trading in security has commenced or security has been reactivated after a suspension in trading.
     * 
     */
    ACTV,

    /**
     * The combination of different security types to create a unit. Units are usually comprised of warrants and bond or warrants and equity. Securities may be combined at the request of the security holder or based on market convention.
     * 
     */
    ATTI,

    /**
     * Also called Issuer Bid or Reverse Rights. Offer to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity. The objective of the offer is to reduce the number of outstanding equities.
     * 
     */
    BIDS,

    /**
     * Event is a bonus issue or scrip issue or capitalisation issue. Security holders are awarded additional assets free of payment from the issuer in proportion to their holding. A bonus issue is typically represented by shares, rights or warrants. Nominal value doesn't change. Holder may be offered choice of form.
     * 
     */
    BONU,

    /**
     * Early redemption of a security at the election of the holder subject to the terms and condition of the issue.
     * 
     */
    BPUT,

    /**
     * Legal status of a company unable to pay creditors. Bankruptcy usually involves a formal court ruling. Securities may become valueless.
     * 
     */
    BRUP,

    /**
     * Event is a generic change. For example,  a change in the terms of an issue, a change in the identification of a security, change of a board lot, a change from global to definitive.
     * 
     */
    CHAN,

    /**
     * Conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price.
     * 
     */
    CONV,

    /**
     * Company option may be granted by the company, allowing the holder to take up shares at some future date(s) at a prearranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date.
     * 
     */
    COOP,

    /**
     * Event is a reduction of the share capital and face value of a single share. The number of the circulating shares remains unchanged. It may include a capital pay-out to shareholder.
     * 
     */
    DECR,

    /**
     * Separation of components that comprise a security usually units comprised of warrants and bond or warrants and equity. Units may be broken up at the request of the security holder or based on market convention.
     * 
     */
    DETI,

    /**
     * Security is no longer able to comply with the listing requirements of a stock exchange and is removed from official board quotation.
     * 
     */
    DLST,

    /**
     * Redemption in part before the scheduled final maturity date of a security. Drawing is distinct from partial call since drawn bonds are chosen by lottery and results are confirmed to bondholder.
     * 
     */
    DRAW,

    /**
     * Event is a dividend payment type where cash dividend is rolled over into additional shares in the issuing company.
     * 
     */
    DRIP,

    /**
     * Action by a party wishing to acquire a security. Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer.
     * 
     */
    DTCH,

    /**
     * Event is a distribution of a dividend to shareholders with the choice of payment method. The shareholder must choose the form of payment - stock, cash, or both.
     * 
     */
    DVOP,

    /**
     * Dividend or interest paid in the form of scrip.
     * 
     */
    DVSC,

    /**
     * Event is a dividend paid to shareholders in the form of shares of stock in the issuing company or in another company. The shareholder must take stock and is not offered a choice in the form of distribution.
     * 
     */
    DVSE,

    /**
     * Event is an exchange offer or capital reorganisation. It is an offer to shareholders to exchange their holdings for other securities and/or cash. Exchange offers are usually voluntary involving the exchange of outstanding security for a different security or securities and/or cash.
     * 
     */
    EXOF,

    /**
     * Event is a call or exercise on nil-paid securities or rights resulting from a rights distribution (RHDI). This is to be used for the second event in those cases where the rights issue is dealt with in two events, the first event being the rights distribution (RHDI).
     * 
     */
    EXRI,

    /**
     * Warrant conversion. Option offered to security holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue).
     * 
     */
    EXWA,

    /**
     * Increase in the face value of a single security. The number of circulating securities remains unchanged.
     * 
     */
    INCR,

    /**
     * Distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security.
     * 
     */
    LIQU,

    /**
     * Redemption of an entire issue outstanding of bonds/preferred equity by the issuer before final maturity. Also known as early redemption.
     * 
     */
    MCAL,

    /**
     * Event is a mandatory or voluntary exchange of outstanding securities as the result of two or more companies combining assets. Cash payments may accompany share exchange.
     * 
     */
    MRGR,

    /**
     * Sale to or purchase of odd-lots from the issuing company, initiated either by the holder of the security or through an offer made by the issuer.
     * 
     */
    ODLT,

    /**
     * Other event, use only when no other event type applies, for example, a new event type.
     * 
     */
    OTHR,

    /**
     * Also called Assimilation or Enfranchisement. Occurs when securities with different characteristics, for example, equities with different entitlements to dividend or voting rights, are assimilated, that is, become identical in all respects. The event may be scheduled in advance or be the result of an outside event.
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
     * Instalment towards the purchase of equity capital, subject to an agreement between an issuer and a purchaser.
     * 
     */
    PPMT,

    /**
     * A payment of a portion of the principal of an interest bearing asset, in addition to the interest payment.
     * 
     */
    PRII,

    /**
     * Form of open or public offer where priority is given to existing shareholders due to limited amount of securities available in the offer. Shareholders can buy a type of security during a short period of time.
     * 
     */
    PRIO,

    /**
     * Redemption of an entire issue outstanding of securities by the issuer at final maturity.
     * 
     */
    REDM,

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
     * Event is the distribution of rights to shareholders, in proportion to their equity holding.
     * 
     */
    RHDI,

    /**
     * Distribution of a security or privilege that gives the holder an entitlement or right to take part in a future event. Also known as subscription rights or rights offer.
     * 
     */
    RHTS,

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
     * Booking out of valueless securities.
     * 
     */
    WRTH;

    public String value() {
        return name();
    }

    public static CorporateActionEventType3Code fromValue(String v) {
        return valueOf(v);
    }

}
