
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethod4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentMethod4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CHK"/>
 *     <enumeration value="TRF"/>
 *     <enumeration value="DD"/>
 *     <enumeration value="TRA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentMethod4Code")
@XmlEnum
public enum PaymentMethod4Code {


    /**
     * Written order to a bank to pay a certain amount of money from one person to another person.
     * 
     */
    CHK,

    /**
     * Transfer of an amount of money in the books of the account servicer.
     * 
     */
    TRF,

    /**
     * Collection of an amount of money from the debtor's bank account by the creditor. The amount of money and dates of collections may vary.
     * 
     */
    DD,

    /**
     * Transfer of an amount of money in the books of the account servicer. An advice should be sent back to the account owner.
     * 
     */
    TRA;

    public String value() {
        return name();
    }

    public static PaymentMethod4Code fromValue(String v) {
        return valueOf(v);
    }

}
