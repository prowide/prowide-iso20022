
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseIdentifierType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PurchaseIdentifierType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONU"/>
 *     <enumeration value="CUOR"/>
 *     <enumeration value="CUPO"/>
 *     <enumeration value="FONU"/>
 *     <enumeration value="INNU"/>
 *     <enumeration value="ORNU"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PRNU"/>
 *     <enumeration value="PUID"/>
 *     <enumeration value="RELO"/>
 *     <enumeration value="REAG"/>
 *     <enumeration value="RENU"/>
 *     <enumeration value="RSNU"/>
 *     <enumeration value="SUOR"/>
 *     <enumeration value="TINU"/>
 *     <enumeration value="TRNU"/>
 *     <enumeration value="SUIN"/>
 *     <enumeration value="TNID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PurchaseIdentifierType1Code")
@XmlEnum
public enum PurchaseIdentifierType1Code {


    /**
     * Contract Number
     * 
     */
    CONU,

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
     * Folio Number
     * 
     */
    FONU,

    /**
     * Invoice Number
     * 
     */
    INNU,

    /**
     * Order Number
     * 
     */
    ORNU,

    /**
     * Other Purchase Identifier defined at a national level.
     * 
     */
    OTHN,

    /**
     * Other Purchase Identifier defined at a private level.
     * 
     */
    OTHP,

    /**
     * Payment Reference Number
     * 
     */
    PRNU,

    /**
     * Purchase Identification
     * 
     */
    PUID,

    /**
     * Record Locator
     * 
     */
    RELO,

    /**
     * Rental Agreement
     * 
     */
    REAG,

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
     * Supplier Order
     * 
     */
    SUOR,

    /**
     * Ticket Number 
     * 
     */
    TINU,

    /**
     * Tracking Number
     * 
     */
    TRNU,

    /**
     * Supplier Invoice
     * 
     */
    SUIN,

    /**
     * Transaction Identification is a proprietary value provided by the card acceptor or acquirer to uniquely identify a given transaction. 
     * 
     */
    TNID;

    public String value() {
        return name();
    }

    public static PurchaseIdentifierType1Code fromValue(String v) {
        return valueOf(v);
    }

}
