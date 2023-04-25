
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAccountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardAccountType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DFLT"/>
 *     <enumeration value="SVNG"/>
 *     <enumeration value="CHCK"/>
 *     <enumeration value="CRDT"/>
 *     <enumeration value="UVRL"/>
 *     <enumeration value="INVS"/>
 *     <enumeration value="EPRS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardAccountType1Code")
@XmlEnum
public enum CardAccountType1Code {


    /**
     * Default account.
     * 
     */
    DFLT,

    /**
     * Savings account.
     * 
     */
    SVNG,

    /**
     * Checking account.
     * 
     */
    CHCK,

    /**
     * Credit card account.
     * 
     */
    CRDT,

    /**
     * Universal account.
     * 
     */
    UVRL,

    /**
     * Investment account.
     * 
     */
    INVS,

    /**
     * Electronic purse card account.
     * 
     */
    EPRS;

    public String value() {
        return name();
    }

    public static CardAccountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
