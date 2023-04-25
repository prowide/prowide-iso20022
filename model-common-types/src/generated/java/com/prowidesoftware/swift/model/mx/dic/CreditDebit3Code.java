
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditDebit3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CreditDebit3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRDT"/>
 *     <enumeration value="DBIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CreditDebit3Code")
@XmlEnum
public enum CreditDebit3Code {


    /**
     * Operation is an increase.
     * 
     */
    CRDT,

    /**
     * Operation is a decrease.
     * 
     */
    DBIT;

    public String value() {
        return name();
    }

    public static CreditDebit3Code fromValue(String v) {
        return valueOf(v);
    }

}
