
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionChannel2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionChannel2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIAD"/>
 *     <enumeration value="HOBA"/>
 *     <enumeration value="BRAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionChannel2Code")
@XmlEnum
public enum TransactionChannel2Code {


    /**
     * Financial advisor.
     * 
     */
    FIAD,

    /**
     * Home banking.
     * 
     */
    HOBA,

    /**
     * Office or branch.
     * 
     */
    BRAN;

    public String value() {
        return name();
    }

    public static TransactionChannel2Code fromValue(String v) {
        return valueOf(v);
    }

}
