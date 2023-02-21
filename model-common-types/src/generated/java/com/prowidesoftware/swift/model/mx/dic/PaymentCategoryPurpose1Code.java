
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCategoryPurpose1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentCategoryPurpose1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CORT"/&gt;
 *     &lt;enumeration value="SALA"/&gt;
 *     &lt;enumeration value="TREA"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="DIVI"/&gt;
 *     &lt;enumeration value="GOVT"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="PENS"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="SSBE"/&gt;
 *     &lt;enumeration value="SUPP"/&gt;
 *     &lt;enumeration value="TAXS"/&gt;
 *     &lt;enumeration value="TRAD"/&gt;
 *     &lt;enumeration value="VATX"/&gt;
 *     &lt;enumeration value="HEDG"/&gt;
 *     &lt;enumeration value="INTC"/&gt;
 *     &lt;enumeration value="WHLD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
