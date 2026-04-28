
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectTransactionType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProtectTransactionType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
