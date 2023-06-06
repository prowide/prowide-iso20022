
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectTransactionType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProtectTransactionType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PROT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProtectTransactionType3Code")
@XmlEnum
public enum ProtectTransactionType3Code {


    /**
     * Reorganisation is a protect transaction type.
     * 
     */
    PROT;

    public String value() {
        return name();
    }

    public static ProtectTransactionType3Code fromValue(String v) {
        return valueOf(v);
    }

}
