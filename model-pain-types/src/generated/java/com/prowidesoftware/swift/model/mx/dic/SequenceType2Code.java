
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SequenceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SequenceType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RCUR"/>
 *     <enumeration value="OOFF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SequenceType2Code")
@XmlEnum
public enum SequenceType2Code {


    /**
     * Direct debit instruction where the debtor's authorisation is used for regular direct debit transactions initiated by the creditor.
     * 
     */
    RCUR,

    /**
     * Direct debit instruction where the debtor's authorisation is used to initiate one single direct debit transaction.
     * 
     */
    OOFF;

    public String value() {
        return name();
    }

    public static SequenceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
