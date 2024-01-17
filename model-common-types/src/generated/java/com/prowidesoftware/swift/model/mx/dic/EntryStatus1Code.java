
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
     * Entry is on the books of the account servicer and value has been applied to the account owner.
     * 
     */
    BOOK,

    /**
     * Entry is on the books of the account servicer and value has not yet been applied to the account owner.
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
