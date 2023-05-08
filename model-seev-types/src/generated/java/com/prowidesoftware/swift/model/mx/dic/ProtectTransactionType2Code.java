
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectTransactionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProtectTransactionType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PROT"/>
 *     <enumeration value="COVP"/>
 *     <enumeration value="COVR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProtectTransactionType2Code")
@XmlEnum
public enum ProtectTransactionType2Code {


    /**
     * Reorganisation is a protect transaction type.
     * 
     */
    PROT,

    /**
     * Reorganisation is a cover on behalf of another participant transaction type.
     * 
     */
    COVP,

    /**
     * Reorganisation is a cover protect transaction type.
     * 
     */
    COVR;

    public String value() {
        return name();
    }

    public static ProtectTransactionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
