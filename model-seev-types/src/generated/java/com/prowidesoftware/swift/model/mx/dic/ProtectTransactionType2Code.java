
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectTransactionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProtectTransactionType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROT"/&gt;
 *     &lt;enumeration value="COVP"/&gt;
 *     &lt;enumeration value="COVR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
