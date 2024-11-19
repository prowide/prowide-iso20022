
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RVSL"/>
 *     <enumeration value="REBO"/>
 *     <enumeration value="CANC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionStatus1Code")
@XmlEnum
public enum TransactionStatus1Code {


    /**
     * Transaction has been reversed.
     * 
     */
    RVSL,

    /**
     * Transaction has been rebooked.
     * 
     */
    REBO,

    /**
     * Transaction has been cancelled.
     * 
     */
    CANC;

    public String value() {
        return name();
    }

    public static TransactionStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
