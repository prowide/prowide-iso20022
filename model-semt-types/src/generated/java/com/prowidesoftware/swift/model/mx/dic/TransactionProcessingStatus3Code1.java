
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionProcessingStatus3Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionProcessingStatus3Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAND"/>
 *     <enumeration value="PACK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionProcessingStatus3Code__1")
@XmlEnum
public enum TransactionProcessingStatus3Code1 {


    /**
     * Instruction has been cancelled.
     * 
     */
    CAND,

    /**
     * Instruction has been acknowledged/accepted for further processing by the account servicer.
     * 
     */
    PACK;

    public String value() {
        return name();
    }

    public static TransactionProcessingStatus3Code1 fromValue(String v) {
        return valueOf(v);
    }

}
