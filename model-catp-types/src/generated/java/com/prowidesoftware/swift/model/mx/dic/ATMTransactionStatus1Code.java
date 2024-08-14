
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransactionStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMTransactionStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DOBT"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="SCSS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMTransactionStatus1Code")
@XmlEnum
public enum ATMTransactionStatus1Code {


    /**
     * Undetermined status, for instance possibly forgotten notes.
     * 
     */
    DOBT,

    /**
     * Transaction failed.
     * 
     */
    FAIL,

    /**
     * Transaction was successfully completed.
     * 
     */
    SCSS;

    public String value() {
        return name();
    }

    public static ATMTransactionStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
