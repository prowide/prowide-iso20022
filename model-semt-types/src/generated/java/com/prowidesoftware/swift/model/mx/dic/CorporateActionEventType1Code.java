
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionEventType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DRIP"/>
 *     <enumeration value="CAPG"/>
 *     <enumeration value="DVCA"/>
 *     <enumeration value="DVOP"/>
 *     <enumeration value="DVSE"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="MRGR"/>
 *     <enumeration value="NAME"/>
 *     <enumeration value="SOFF"/>
 *     <enumeration value="SPLF"/>
 *     <enumeration value="SPLR"/>
 *     <enumeration value="TEND"/>
 *     <enumeration value="BONU"/>
 *     <enumeration value="RHDI"/>
 *     <enumeration value="EXRI"/>
 *     <enumeration value="CHAN"/>
 *     <enumeration value="REDO"/>
 *     <enumeration value="EXOP"/>
 *     <enumeration value="EXOF"/>
 *     <enumeration value="DECR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionEventType1Code")
@XmlEnum
public enum CorporateActionEventType1Code {


    /**
     * Event is a dividend payment type where cash dividend is rolled over into additional shares in the issuing company.
     * 
     */
    DRIP,

    /**
     * Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or Sicavs are recipients of capital gains distributions and are often reinvested in additional shares of the fund.
     * 
     */
    CAPG,

    /**
     * Event is a distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. The shareholder must take cash and is not offered a choice in the form of distribution.
     * 
     */
    DVCA,

    /**
     * Event is a distribution of a dividend to shareholders with the choice of payment method. The shareholder must choose the form of payment - stock, cash, or both.
     * 
     */
    DVOP,

    /**
     * Event is a dividend paid to shareholders in the form of shares of stock in the issuing company or in another company. The shareholder must take stock and is not offered a choice in the form of distribution.
     * 
     */
    DVSE,

    /**
     * Event is a liquidating dividend or liquidation that consists of a distribution of cash, assets, or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security. The security holder may be able to choose the form of liquidation distribution.
     * 
     */
    LIQU,

    /**
     * Event is a mandatory or voluntary exchange of outstanding securities as the result of two or more companies combining assets. Cash payments may accompany share exchange.
     * 
     */
    MRGR,

    /**
     * Event is a name change. The issuing company changes its name. The event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar.
     * 
     */
    NAME,

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
     * Event is an acquisition or take-over or offre publique de retrait (FR) or purchase offer or buy-back. It is an offer made to shareholders requesting them to sell (tender) their shares for a specified price usually at a premium over prevailing market price. Generally, the objective of a tender offer is to take control of the target company.
     * 
     */
    TEND,

    /**
     * Event is a bonus issue or scrip issue or capitalisation issue. Security holders are awarded additional assets free of payment from the issuer in proportion to their holding. A bonus issue is typically represented by shares, rights or warrants. Nominal value doesn't change. Holder may be offered choice of form.
     * 
     */
    BONU,

    /**
     * Event is the distribution of rights to shareholders, in proportion to their equity holding.
     * 
     */
    RHDI,

    /**
     * Event is a call or exercise on nil-paid securities or rights resulting from a rights distribution (RHDI). This is to be used for the second event in those cases where the rights issue is dealt with in two events, the first event being the rights distribution (RHDI).
     * 
     */
    EXRI,

    /**
     * Event is a generic change. For example, a change in the terms of an issue, a change in the identification of a security, change of a board lot, a change from global to definitive.
     * 
     */
    CHAN,

    /**
     * Event by which the unit (currency and/or nominal) of a financial instrument is restated, eg, the debt in a national currency is restated in euro.
     * 
     */
    REDO,

    /**
     * Event is an option for the shareholders to exchange their securities for other securities and/or cash. Exchange options are mentioned in the terms and conditions of a security and are valid during the whole lifetime of a security.
     * 
     */
    EXOP,

    /**
     * Event is an exchange offer or capital reorganisation.
     * It is an offer to shareholders to exchange their holdings for other securities and/or cash. Exchange offers are usually voluntary involving the exchange of outstanding security for a different security or securities and/or cash.
     * 
     */
    EXOF,

    /**
     * Event is a reduction of the share capital and face value of a single share. The number of the circulating shares remains unchanged. It may include a capital pay-out to shareholder.
     * 
     */
    DECR;

    public String value() {
        return name();
    }

    public static CorporateActionEventType1Code fromValue(String v) {
        return valueOf(v);
    }

}
