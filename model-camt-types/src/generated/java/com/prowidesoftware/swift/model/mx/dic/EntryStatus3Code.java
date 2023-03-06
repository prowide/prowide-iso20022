
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntryStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntryStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOOK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntryStatus3Code")
@XmlEnum
public enum EntryStatus3Code {


    /**
     * Booked means that the transfer of money has been completed between account servicer and account owner
     * 
     * Usage: 
     * Status Booked does not necessarily imply finality of money as this depends on other factors such as the payment system used, the completion of the end-to-end transaction and the terms agreed between account servicer and owner.
     * Status Booked is the only status that can be reversed.
     * 
     */
    BOOK;

    public String value() {
        return name();
    }

    public static EntryStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
