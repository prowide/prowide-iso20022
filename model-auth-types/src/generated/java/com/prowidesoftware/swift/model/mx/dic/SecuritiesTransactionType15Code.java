
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionType15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesTransactionType15Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUYI"/&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecuritiesTransactionType15Code")
@XmlEnum
public enum SecuritiesTransactionType15Code {


    /**
     * Transaction is a purchase of financial instrument.
     * 
     */
    BUYI,

    /**
     * Transaction is a sale of financial instrument.
     * 
     */
    SELL;

    public String value() {
        return name();
    }

    public static SecuritiesTransactionType15Code fromValue(String v) {
        return valueOf(v);
    }

}
