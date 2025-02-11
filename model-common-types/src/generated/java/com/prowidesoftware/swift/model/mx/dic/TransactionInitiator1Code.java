
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionInitiator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionInitiator1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MERC"/>
 *     <enumeration value="CUST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
