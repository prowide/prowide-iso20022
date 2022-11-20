
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentPurpose1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentPurpose1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SALA"/&gt;
 *     &lt;enumeration value="TREA"/&gt;
 *     &lt;enumeration value="ADVA"/&gt;
 *     &lt;enumeration value="AGRT"/&gt;
 *     &lt;enumeration value="ALMY"/&gt;
 *     &lt;enumeration value="BECH"/&gt;
 *     &lt;enumeration value="BENE"/&gt;
 *     &lt;enumeration value="BONU"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CBFF"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="COLL"/&gt;
 *     &lt;enumeration value="CMDT"/&gt;
 *     &lt;enumeration value="COMC"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="COST"/&gt;
 *     &lt;enumeration value="CPYR"/&gt;
 *     &lt;enumeration value="DIVI"/&gt;
 *     &lt;enumeration value="FREX"/&gt;
 *     &lt;enumeration value="GDDS"/&gt;
 *     &lt;enumeration value="GOVT"/&gt;
 *     &lt;enumeration value="IHRP"/&gt;
 *     &lt;enumeration value="INTC"/&gt;
 *     &lt;enumeration value="INSU"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="LICF"/&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="LOAR"/&gt;
 *     &lt;enumeration value="NETT"/&gt;
 *     &lt;enumeration value="PAYR"/&gt;
 *     &lt;enumeration value="PENS"/&gt;
 *     &lt;enumeration value="REFU"/&gt;
 *     &lt;enumeration value="RENT"/&gt;
 *     &lt;enumeration value="ROYA"/&gt;
 *     &lt;enumeration value="SCVE"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="SSBE"/&gt;
 *     &lt;enumeration value="SUBS"/&gt;
 *     &lt;enumeration value="TAXS"/&gt;
 *     &lt;enumeration value="VATX"/&gt;
 *     &lt;enumeration value="COMT"/&gt;
 *     &lt;enumeration value="DBTC"/&gt;
 *     &lt;enumeration value="SUPP"/&gt;
 *     &lt;enumeration value="HEDG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentPurpose1Code")
@XmlEnum
public enum PaymentPurpose1Code {


    /**
     * Transaction is the payment of salaries.
     * 
     */
    SALA,

    /**
     * Transaction is related to treasury operations.
     * 
     */
    TREA,

    /**
     * Transaction is an advance payment.
     * 
     */
    ADVA,

    /**
     * Transaction is related to the agricultural domain.
     * 
     */
    AGRT,

    /**
     * Transaction is the payment of alimony.
     * 
     */
    ALMY,

    /**
     * Transaction is related to a payment made to assist parent/guardian to maintain child.
     * 
     */
    BECH,

    /**
     * Transaction is related to a payment to a person who is unemployed/disabled.
     * 
     */
    BENE,

    /**
     * Transaction is related to payment of a bonus.
     * 
     */
    BONU,

    /**
     * Transaction is a general cash management instruction.
     * 
     */
    CASH,

    /**
     * Transaction is related to capital building fringe fortune, ie capital building for retirement.
     * 
     */
    CBFF,

    /**
     * Transaction is a payment for charity reasons.
     * 
     */
    CHAR,

    /**
     * Transaction is a collection of funds initiated via a credit transfer or direct debit.
     * 
     */
    COLL,

    /**
     * Transaction is payment of commodities.
     * 
     */
    CMDT,

    /**
     * Transaction is related to a payment of commercial credit or debit. (formerly CommercialCredit).
     * 
     */
    COMC,

    /**
     * Transaction is payment of commission.
     * 
     */
    COMM,

    /**
     * Transaction is related to payment of costs.
     * 
     */
    COST,

    /**
     * Transaction is payment of copyright.
     * 
     */
    CPYR,

    /**
     * Transaction is payment of dividends.
     * 
     */
    DIVI,

    /**
     * Transaction is related to a foreign exchange operation.
     * 
     */
    FREX,

    /**
     * Transaction is related to purchase and sale of goods.
     * 
     */
    GDDS,

    /**
     * Transaction is a payment to or from a government department.
     * 
     */
    GOVT,

    /**
     * Transaction is payment for an installment/hire-purchase agreement.
     * 
     */
    IHRP,

    /**
     * Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group.
     * 
     */
    INTC,

    /**
     * Transaction is payment of an insurance premium.
     * 
     */
    INSU,

    /**
     * Transaction is payment of interest.
     * 
     */
    INTE,

    /**
     * Transaction is payment of a license fee.
     * 
     */
    LICF,

    /**
     * Transaction is related to transfer of loan to borrower.
     * 
     */
    LOAN,

    /**
     * Transaction is related to repayment of loan to lender.
     * 
     */
    LOAR,

    /**
     * Transaction is related to a netting operation.
     * 
     */
    NETT,

    /**
     * Transaction is related to the payment of payroll.
     * 
     */
    PAYR,

    /**
     * Transaction is the payment of pension.
     * 
     */
    PENS,

    /**
     * Transaction is the payment of a refund.
     * 
     */
    REFU,

    /**
     * Transaction is the payment of rent.
     * 
     */
    RENT,

    /**
     * Transaction is the payment of royalties.
     * 
     */
    ROYA,

    /**
     * Transaction is related to purchase and sale of services.
     * 
     */
    SCVE,

    /**
     * Transaction is the payment of securities.
     * 
     */
    SECU,

    /**
     * Transaction is a social security benefit, ie payment made by a government to support individuals.
     * 
     */
    SSBE,

    /**
     * Transaction is related to a payment of information or entertainment services either in printed or electronic form.
     * 
     */
    SUBS,

    /**
     * Transaction is the payment of taxes.
     * 
     */
    TAXS,

    /**
     * Transaction is the payment of value added tax.
     * 
     */
    VATX,

    /**
     * Transaction is a payment used by a third party who can collect funds to pay on behalf of consumers, ie credit counseling or bill payment companies.
     * 
     */
    COMT,

    /**
     * Collection of funds initiated via a debit transfer.
     * 
     */
    DBTC,

    /**
     * Transaction is related to a payment to a supplier.
     * 
     */
    SUPP,

    /**
     * Transaction is related to a hedging operation.
     * 
     */
    HEDG;

    public String value() {
        return name();
    }

    public static PaymentPurpose1Code fromValue(String v) {
        return valueOf(v);
    }

}
