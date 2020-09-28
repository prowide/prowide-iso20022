
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntryStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntryStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOOK"/&gt;
 *     &lt;enumeration value="PDNG"/&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntryStatus2Code")
@XmlEnum
public enum EntryStatus2Code {


    /**
     * Booked means that the transfer of money has been completed between account servicer and account owner
     * 
     * Usage :   
     * Status Booked does not necessarily imply finality of money as this depends on other factors such as the payment system used, the completion of the end-to-end transaction and the terms agreed between account servicer and owner.
     * Status Booked is the only status that can be reversed.
     * 
     */
    BOOK,

    /**
     * Booking on the account owner's account in the account servicer's ledger has not been completed.
     * 
     * Usage : this can be used for expected items, or for items for which some conditions still need to be fulfilled before they can be booked. If booking takes place, the entry will be included with status Booked in subsequent account report or statement. Status Pending cannot be reversed.
     * 
     */
    PDNG,

    /**
     * Entry is only provided for information, and no booking on the account owner's account in the account servicer's ledger has been performed.
     * 
     */
    INFO;

    public String value() {
        return name();
    }

    public static EntryStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
