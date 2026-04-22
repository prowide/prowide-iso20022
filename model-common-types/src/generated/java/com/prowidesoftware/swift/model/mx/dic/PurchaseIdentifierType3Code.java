
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseIdentifierType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PurchaseIdentifierType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SUIN"/>
 *     <enumeration value="RELO"/>
 *     <enumeration value="INNU"/>
 *     <enumeration value="PUID"/>
 *     <enumeration value="RENU"/>
 *     <enumeration value="RSNU"/>
 *     <enumeration value="TINU"/>
 *     <enumeration value="SUOR"/>
 *     <enumeration value="CONU"/>
 *     <enumeration value="FONU"/>
 *     <enumeration value="PRNU"/>
 *     <enumeration value="ORNU"/>
 *     <enumeration value="CUOR"/>
 *     <enumeration value="CUPO"/>
 *     <enumeration value="REAG"/>
 *     <enumeration value="TRNU"/>
 *     <enumeration value="TREF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PurchaseIdentifierType3Code")
@XmlEnum
public enum PurchaseIdentifierType3Code {


    /**
     * Supplier Invoice
     * 
     */
    SUIN,

    /**
     * Record Locator
     * 
     */
    RELO,

    /**
     * Invoice Number
     * 
     */
    INNU,

    /**
     * Purchase Identification
     * 
     */
    PUID,

    /**
     * Rental Number
     * 
     */
    RENU,

    /**
     * Reservation Number
     * 
     */
    RSNU,

    /**
     * Ticket Number 
     * 
     */
    TINU,

    /**
     * Supplier Order
     * 
     */
    SUOR,

    /**
     * Contract Number
     * 
     */
    CONU,

    /**
     * Folio Number
     * 
     */
    FONU,

    /**
     * Payment Reference Number
     * 
     */
    PRNU,

    /**
     * Order Number
     * 
     */
    ORNU,

    /**
     * Customer Order
     * 
     */
    CUOR,

    /**
     * Customer Purchase Order
     * 
     */
    CUPO,

    /**
     * Rental Agreement
     * 
     */
    REAG,

    /**
     * Tracking Number
     * 
     */
    TRNU,

    /**
     * Transaction Reference Number
     * 
     */
    TREF;

    public String value() {
        return name();
    }

    public static PurchaseIdentifierType3Code fromValue(String v) {
        return valueOf(v);
    }

}
