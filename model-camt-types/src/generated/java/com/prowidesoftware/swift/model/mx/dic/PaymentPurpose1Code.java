
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentPurpose1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentPurpose1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SALA"/>
 *     <enumeration value="TREA"/>
 *     <enumeration value="ADVA"/>
 *     <enumeration value="AGRT"/>
 *     <enumeration value="ALMY"/>
 *     <enumeration value="BECH"/>
 *     <enumeration value="BENE"/>
 *     <enumeration value="BONU"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="CBFF"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="CMDT"/>
 *     <enumeration value="COMC"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="COST"/>
 *     <enumeration value="CPYR"/>
 *     <enumeration value="DIVI"/>
 *     <enumeration value="FREX"/>
 *     <enumeration value="GDDS"/>
 *     <enumeration value="GOVT"/>
 *     <enumeration value="IHRP"/>
 *     <enumeration value="INTC"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="LICF"/>
 *     <enumeration value="LOAN"/>
 *     <enumeration value="LOAR"/>
 *     <enumeration value="NETT"/>
 *     <enumeration value="PAYR"/>
 *     <enumeration value="PENS"/>
 *     <enumeration value="REFU"/>
 *     <enumeration value="RENT"/>
 *     <enumeration value="ROYA"/>
 *     <enumeration value="SCVE"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="SSBE"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="TAXS"/>
 *     <enumeration value="VATX"/>
 *     <enumeration value="COMT"/>
 *     <enumeration value="DBTC"/>
 *     <enumeration value="SUPP"/>
 *     <enumeration value="HEDG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
