
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionChannel3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionChannel3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAIL"/&gt;
 *     &lt;enumeration value="TLPH"/&gt;
 *     &lt;enumeration value="ECOM"/&gt;
 *     &lt;enumeration value="TVPY"/&gt;
 *     &lt;enumeration value="SECM"/&gt;
 *     &lt;enumeration value="MOBL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
