
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethod3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethod3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHK"/&gt;
 *     &lt;enumeration value="TRF"/&gt;
 *     &lt;enumeration value="TRA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethod3Code")
@XmlEnum
public enum PaymentMethod3Code {


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
     * Transfer of an amount of money in the books of the account servicer. An advice should be sent back to the account owner.
     * 
     */
    TRA;

    public String value() {
        return name();
    }

    public static PaymentMethod3Code fromValue(String v) {
        return valueOf(v);
    }

}
