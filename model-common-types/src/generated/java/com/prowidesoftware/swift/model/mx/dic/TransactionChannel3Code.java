
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionChannel3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionChannel3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MAIL"/>
 *     <enumeration value="TLPH"/>
 *     <enumeration value="ECOM"/>
 *     <enumeration value="TVPY"/>
 *     <enumeration value="SECM"/>
 *     <enumeration value="MOBL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionChannel3Code")
@XmlEnum
public enum TransactionChannel3Code {


    /**
     * Mail order.
     * 
     */
    MAIL,

    /**
     * Telephone order.
     * 
     */
    TLPH,

    /**
     * Electronic commerce.
     * 
     */
    ECOM,

    /**
     * Payment on television.
     * 
     */
    TVPY,

    /**
     * Electronic commerce with cardholder authentication.
     * 
     */
    SECM,

    /**
     * Payment performed through a cardholder mobile device.
     * 
     */
    MOBL;

    public String value() {
        return name();
    }

    public static TransactionChannel3Code fromValue(String v) {
        return valueOf(v);
    }

}
