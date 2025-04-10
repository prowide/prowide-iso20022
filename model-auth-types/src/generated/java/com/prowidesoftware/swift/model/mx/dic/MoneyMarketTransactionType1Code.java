
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyMarketTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MoneyMarketTransactionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BORR"/&gt;
 *     &lt;enumeration value="LEND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MoneyMarketTransactionType1Code")
@XmlEnum
public enum MoneyMarketTransactionType1Code {


    /**
     * Transaction is a borrowing.
     * 
     */
    BORR,

    /**
     * Transaction is a lending.
     * 
     */
    LEND;

    public String value() {
        return name();
    }

    public static MoneyMarketTransactionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
