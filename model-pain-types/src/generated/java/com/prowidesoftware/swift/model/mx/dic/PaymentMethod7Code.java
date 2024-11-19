
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethod7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentMethod7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CHK"/>
 *     <enumeration value="TRF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentMethod7Code")
@XmlEnum
public enum PaymentMethod7Code {


    /**
     * Written order to a bank to pay a certain amount of money from one person to another person.
     * 
     */
    CHK,

    /**
     * Transfer of an amount of money in the books of the account servicer.
     * 
     */
    TRF;

    public String value() {
        return name();
    }

    public static PaymentMethod7Code fromValue(String v) {
        return valueOf(v);
    }

}
