
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FXAmountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FXAmountType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ZWIS"/&gt;
 *     &lt;enumeration value="WITH"/&gt;
 *     &lt;enumeration value="VATA"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="TRAX"/&gt;
 *     &lt;enumeration value="STEX"/&gt;
 *     &lt;enumeration value="STAM"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="COUN"/&gt;
 *     &lt;enumeration value="LOCL"/&gt;
 *     &lt;enumeration value="LOCO"/&gt;
 *     &lt;enumeration value="LYDT"/&gt;
 *     &lt;enumeration value="LOTE"/&gt;
 *     &lt;enumeration value="LIDT"/&gt;
 *     &lt;enumeration value="EXEC"/&gt;
 *     &lt;enumeration value="EUTR"/&gt;
 *     &lt;enumeration value="EQUL"/&gt;
 *     &lt;enumeration value="COAX"/&gt;
 *     &lt;enumeration value="AKTI"/&gt;
 *     &lt;enumeration value="ERFE"/&gt;
 *     &lt;enumeration value="ENTF"/&gt;
 *     &lt;enumeration value="MARG"/&gt;
 *     &lt;enumeration value="MACO"/&gt;
 *     &lt;enumeration value="ANTO"/&gt;
 *     &lt;enumeration value="CREB"/&gt;
 *     &lt;enumeration value="SPCN"/&gt;
 *     &lt;enumeration value="SUBS"/&gt;
 *     &lt;enumeration value="TOTL"/&gt;
 *     &lt;enumeration value="DEAL"/&gt;
 *     &lt;enumeration value="ACRU"/&gt;
 *     &lt;enumeration value="BAKL"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="CBCH"/&gt;
 *     &lt;enumeration value="LADT"/&gt;
 *     &lt;enumeration value="DSCA"/&gt;
 *     &lt;enumeration value="HDGE"/&gt;
 *     &lt;enumeration value="ISDI"/&gt;
 *     &lt;enumeration value="LEVY"/&gt;
 *     &lt;enumeration value="OCMT"/&gt;
 *     &lt;enumeration value="PRMA"/&gt;
 *     &lt;enumeration value="OTMG"/&gt;
 *     &lt;enumeration value="REGF"/&gt;
 *     &lt;enumeration value="REMU"/&gt;
 *     &lt;enumeration value="RESU"/&gt;
 *     &lt;enumeration value="SAMG"/&gt;
 *     &lt;enumeration value="SETT"/&gt;
 *     &lt;enumeration value="SHIP"/&gt;
 *     &lt;enumeration value="ACCA"/&gt;
 *     &lt;enumeration value="PRDF"/&gt;
 *     &lt;enumeration value="REFD"/&gt;
 *     &lt;enumeration value="PRWI"/&gt;
 *     &lt;enumeration value="RSCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FXAmountType1Code")
@XmlEnum
public enum FXAmountType1Code {


    /**
     * Zwischengewinn.
     * 
     */
    ZWIS,

    /**
     * Tax is on income deducted at source, which the paying agent is legally obliged to deduct from its payments of interest on deposits and other proceeds of a financial instrument.
     * 
     */
    WITH,

    /**
     * Tax is a value added tax.
     * 
     */
    VATA,

    /**
     * Tax levied on a transfer.
     * 
     */
    TRAN,

    /**
     * Tax levied on a transaction.
     * 
     */
    TRAX,

    /**
     * Tax collected by a stock exchange.
     * 
     */
    STEX,

    /**
     * Tax is on certain documents and transactions.
     * 
     */
    STAM,

    /**
     * Another type of commission or fees.
     * 
     */
    OTHR,

    /**
     * Tax is a country, national, or federal tax that is usually charged by the custodian.
     * 
     */
    COUN,

    /**
     * Tax that is charged by a local settlement system or local jurisdiction.
     * 
     */
    LOCL,

    /**
     * Local broker's commission amount.
     * 
     */
    LOCO,

    /**
     * Local tax (Ertrag Besitzanteilig) yield liable for interest down payment tax.
     * 
     */
    LYDT,

    /**
     * Local tax (Zinstopf) offset interest per unit against tax exempt amount (variation to offset interest per unit in relation to tax exempt amount).
     * 
     */
    LOTE,

    /**
     * Local tax (ZAS pflichtige Zinsen) - interest liable for interest down payment tax (proportion of gross interest per unit/interim profits that is not covered by the credit in the interest pool).
     * 
     */
    LIDT,

    /**
     * Executing broker's commission amount.
     * 
     */
    EXEC,

    /**
     * Tax withheld at source in the framework of the European Directive on taxation of savings in the form of interest payments.
     * 
     */
    EUTR,

    /**
     * Investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.
     * 
     */
    EQUL,

    /**
     * Tax that is levied on goods and services purchased by customers, and is added to the retail price.
     * 
     */
    COAX,

    /**
     * Share-related profit. This is a tax specific to the German market. The share-related-profit gives the fund the opportunity to pass on to the institutional investor redeeming fund units certain tax-free income from equity. The calculation method is based on the old Investment Tax Act (Investmentsteuergesetz).
     * 
     */
    AKTI,

    /**
     * Early redemption fees.
     * 
     */
    ERFE,

    /**
     * Entrance fees amount
     * 
     */
    ENTF,

    /**
     * Margin amount related commissions and fees.
     * 
     */
    MARG,

    /**
     * Fee charged for matching and/or confirmation.
     * 
     */
    MACO,

    /**
     * Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off.
     * 
     */
    ANTO,

    /**
     * Rebate or bonification fees or commission amount.
     * 
     */
    CREB,

    /**
     * Fees, drawdown, or other reduction from or in addition to the deal price.
     * 
     */
    SPCN,

    /**
     * Subscription interest.
     * 
     */
    SUBS,

    /**
     * Total amount of all commissions or fees
     * 
     */
    TOTL,

    /**
     * Trade deal amount fees.
     * 
     */
    DEAL,

    /**
     * Amount of interest earned on a debt, such as a bond, but not yet collected.
     * 
     */
    ACRU,

    /**
     * Amount paid by investors when selling mutual fund shares.
     * 
     */
    BAKL,

    /**
     * Amount of money that cannot be categorised by another qualifier.
     * 
     */
    CHAR,

    /**
     * Charge of the correspondent bank for transferring money.
     * 
     */
    CBCH,

    /**
     * Local tax (ZAS Anrechnungsbetrag) subject to interest down payment tax (proportion of interest liable for interest down payment tax/interim profit that is not covered by the tax exempt amount).
     * 
     */
    LADT,

    /**
     * Aggregate amount of discount.
     * 
     */
    DSCA,

    /**
     * Amount due and payable to a hedge counterparty under a hedge agreement during the relevant period.
     * 
     */
    HDGE,

    /**
     * Amount of money defined as a discount on a new issue or on a tranche of an existing issue.
     * 
     */
    ISDI,

    /**
     * Tax levied on a payment.
     * 
     */
    LEVY,

    /**
     * Posting/settlement amount in its original currency when conversion from/into another currency has occurred.
     * 
     */
    OCMT,

    /**
     * Difference between the amount of money of the first leg and the amount of the second leg of the transaction.
     * 
     */
    PRMA,

    /**
     * Amount is an on top margin.
     * 
     */
    OTMG,

    /**
     * Amount of money charged by a regulatory authority, for example, Securities and Exchange fees.
     * 
     */
    REGF,

    /**
     * Amount of any other remuneration received or to be received by the broker in connection with the transaction.
     * 
     */
    REMU,

    /**
     * Counter value of a foreign exchange conversion.
     * 
     */
    RESU,

    /**
     * Financial metric used to assess a firm's financial health by revealing the proportion of money left over from revenues after accounting for the cost of goods sold. Gross profit margin serves as the source for paying additional expenses and future savings.
     * 
     */
    SAMG,

    /**
     * Amount of all settled transactions.
     * 
     */
    SETT,

    /**
     * Charge for shipping, including the insurance of securities.
     * 
     */
    SHIP,

    /**
     * Amount of unpaid interest (on bonds which have defaulted and have subsequently 
     * restructured), which is capitalized and added to the original principal amount of the bond.
     * 
     */
    ACCA,

    /**
     * Difference between the deal price and another reference price.
     * 
     */
    PRDF,

    /**
     * Amount of the expected refund.
     * 
     */
    REFD,

    /**
     * Amount retained by a fund and paid out later at a time decided by the fund.
     * 
     */
    PRWI,

    /**
     * Charge or commission paid by the investor to a distributor/intermediary or other service provider for the provision of financial research.
     * 
     */
    RSCH;

    public String value() {
        return name();
    }

    public static FXAmountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
