
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCategoryPurpose1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentCategoryPurpose1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CORT"/>
 *     <enumeration value="SALA"/>
 *     <enumeration value="TREA"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="DIVI"/>
 *     <enumeration value="GOVT"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="LOAN"/>
 *     <enumeration value="PENS"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="SSBE"/>
 *     <enumeration value="SUPP"/>
 *     <enumeration value="TAXS"/>
 *     <enumeration value="TRAD"/>
 *     <enumeration value="VATX"/>
 *     <enumeration value="HEDG"/>
 *     <enumeration value="INTC"/>
 *     <enumeration value="WHLD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentCategoryPurpose1Code")
@XmlEnum
public enum PaymentCategoryPurpose1Code {


    /**
     * Transaction is related to settlement of a trade, eg a foreign exchange deal or a securities transaction.
     * 
     */
    CORT,

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
     * Transaction is a general cash management instruction.
     * 
     */
    CASH,

    /**
     * Transaction is the payment of dividends.
     * 
     */
    DIVI,

    /**
     * Transaction is a payment to or from a government department.
     * 
     */
    GOVT,

    /**
     * Transaction is the payment of interest.
     * 
     */
    INTE,

    /**
     * Transaction is related to the transfer of a loan to a borrower.
     * 
     */
    LOAN,

    /**
     * Transaction is the payment of pension.
     * 
     */
    PENS,

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
     * Transaction is related to a payment to a supplier.
     * 
     */
    SUPP,

    /**
     * Transaction is the payment of taxes.
     * 
     */
    TAXS,

    /**
     * Transaction is related to the payment of a trade transaction.
     * 
     */
    TRAD,

    /**
     * Transaction is the payment of value added tax.
     * 
     */
    VATX,

    /**
     * Transaction is related to the payment of a hedging operation.
     * 
     */
    HEDG,

    /**
     * Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group.
     * 
     */
    INTC,

    /**
     * Transaction is the payment of withholding tax.
     * 
     */
    WHLD;

    public String value() {
        return name();
    }

    public static PaymentCategoryPurpose1Code fromValue(String v) {
        return valueOf(v);
    }

}
