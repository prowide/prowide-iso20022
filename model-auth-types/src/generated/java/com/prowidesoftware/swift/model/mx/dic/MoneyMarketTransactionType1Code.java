
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyMarketTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MoneyMarketTransactionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BORR"/>
 *     <enumeration value="LEND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
