
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntryStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EntryStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOOK"/>
 *     <enumeration value="PDNG"/>
 *     <enumeration value="FUTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EntryStatus1Code")
@XmlEnum
public enum EntryStatus1Code {


    /**
     * Booked means that the transfer of money has been completed between account servicer and account owner
     * 
     * Usage: 
     * Status Booked does not necessarily imply finality of money as this depends on other factors such as the payment system used, the completion of the end-to-end transaction and the terms agreed between account servicer and owner.
     * Status Booked is the only status that can be reversed.
     * 
     */
    BOOK,

    /**
     * Booking on the account owner's account in the account servicer's ledger has not been completed.
     * 
     * Usage: this can be used for expected items, or for items for which some conditions still need to be fulfilled before they can be booked. If booking takes place, the entry will be included with status Booked in subsequent account report or statement. Status Pending cannot be reversed.
     * 
     */
    PDNG,

    /**
     * Entry is on the books of the account servicer and value will be applied to the account owner at a future date and time.
     * 
     */
    FUTR;

    public String value() {
        return name();
    }

    public static EntryStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
