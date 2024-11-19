
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequeType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ChequeType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CCHQ"/>
 *     <enumeration value="CCCH"/>
 *     <enumeration value="BCHQ"/>
 *     <enumeration value="DRFT"/>
 *     <enumeration value="ELDR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ChequeType2Code")
@XmlEnum
public enum ChequeType2Code {


    /**
     * Cheque drawn on the account of the debtor, and debited on the debtor's account when the cheque is cashed. Synonym is 'corporate cheque'.
     * 
     */
    CCHQ,

    /**
     * Cheque drawn on the account of the debtor, and debited on the debtor's account when the cheque is cashed. The financial institution prints and certifies the cheque, guaranteeing the payment.
     * 
     */
    CCCH,

    /**
     * Cheque drawn on the account of the debtor's financial institution, which is debited on the debtor's account when the cheque is issued.These cheques are printed by the debtor's financial institution and payment is guaranteed by the financial institution. Synonym is 'cashier's cheque'.
     * 
     */
    BCHQ,

    /**
     * A guaranteed bank cheque with a future value date (do not pay before], which in commercial terms is a 'negotiatable instrument': the beneficiary can receive early payment from any bank under subtraction of a discount. The ordering customer's account is debited on value date.
     * 
     */
    DRFT,

    /**
     * An instrument with a future value date (do not pay before], which in commercial terms is a 'negotiatable instrument': the beneficiary can receive early payment from any bank under subtraction of a discount. The ordering customer's account is debited on value date.
     * 
     */
    ELDR;

    public String value() {
        return name();
    }

    public static ChequeType2Code fromValue(String v) {
        return valueOf(v);
    }

}
