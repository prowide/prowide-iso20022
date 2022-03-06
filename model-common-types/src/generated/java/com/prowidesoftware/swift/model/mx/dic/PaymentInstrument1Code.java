
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrument1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentInstrument1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BDT"/&gt;
 *     &lt;enumeration value="BCT"/&gt;
 *     &lt;enumeration value="CDT"/&gt;
 *     &lt;enumeration value="CCT"/&gt;
 *     &lt;enumeration value="CHK"/&gt;
 *     &lt;enumeration value="BKT"/&gt;
 *     &lt;enumeration value="DCP"/&gt;
 *     &lt;enumeration value="CCP"/&gt;
 *     &lt;enumeration value="RTI"/&gt;
 *     &lt;enumeration value="CAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentInstrument1Code")
@XmlEnum
public enum PaymentInstrument1Code {


    /**
     * Direct debit instruction in which the debtor and the creditor are financial institutions.
     * 
     */
    BDT,

    /**
     * Funds transfer in which the debtor and the creditor are financial institutions.
     * 
     */
    BCT,

    /**
     * Direct debit instruction in which the debtor or the creditor or both are non-financial institutions.
     * 
     */
    CDT,

    /**
     * Funds transfer in which the debtor or the creditor or both are non-financial institutions.
     * 
     */
    CCT,

    /**
     * Payment instrument is a cheque. (A written order on which instructions are given to an account holder (a financial institution) to pay a stated sum to a named recipient (the payee)).
     * 
     */
    CHK,

    /**
     * Transfer that is a movement of cash on the books of the account servicer.
     * 
     */
    BKT,

    /**
     * Payment instrument is a debit card. (The payment originated using a debit card scheme.)
     * 
     */
    DCP,

    /**
     * Payment instrument is a credit card. (The payment originated using a credit card scheme.)
     * 
     */
    CCP,

    /**
     * Entry related to a returned or unpaid item.
     * 
     */
    RTI,

    /**
     * Reverse entry that is the result of the cancellation of a previously booked entry.
     * 
     */
    CAN;

    public String value() {
        return name();
    }

    public static PaymentInstrument1Code fromValue(String v) {
        return valueOf(v);
    }

}
