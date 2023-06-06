
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrument1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentInstrument1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BDT"/>
 *     <enumeration value="BCT"/>
 *     <enumeration value="CDT"/>
 *     <enumeration value="CCT"/>
 *     <enumeration value="CHK"/>
 *     <enumeration value="BKT"/>
 *     <enumeration value="DCP"/>
 *     <enumeration value="CCP"/>
 *     <enumeration value="RTI"/>
 *     <enumeration value="CAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
     * Payment instrument is a debit card. (The payment originated using a debit card scheme.).
     * 
     */
    DCP,

    /**
     * Payment instrument is a credit card. (The payment originated using a credit card scheme.).
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
