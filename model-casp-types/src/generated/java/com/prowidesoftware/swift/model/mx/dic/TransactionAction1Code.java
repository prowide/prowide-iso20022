
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionAction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STAR"/>
 *     <enumeration value="STOP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionAction1Code")
@XmlEnum
public enum TransactionAction1Code {


    /**
     * Start a transaction by a swipe ahead mechanism, with the services which are enabled.
     * 
     */
    STAR,

    /**
     * Keep quite after a swipe ahead mechanism.
     * 
     */
    STOP;

    public String value() {
        return name();
    }

    public static TransactionAction1Code fromValue(String v) {
        return valueOf(v);
    }

}
