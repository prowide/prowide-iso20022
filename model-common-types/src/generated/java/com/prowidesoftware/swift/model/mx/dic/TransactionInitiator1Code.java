
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionInitiator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionInitiator1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionInitiator1Code")
@XmlEnum
public enum TransactionInitiator1Code {


    /**
     * Merchant initiated transaction.
     * 
     */
    MERC,

    /**
     * Customer initiated transaction.
     * 
     */
    CUST;

    public String value() {
        return name();
    }

    public static TransactionInitiator1Code fromValue(String v) {
        return valueOf(v);
    }

}
