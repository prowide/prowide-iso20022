
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseIdentifierType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchaseIdentifierType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONU"/&gt;
 *     &lt;enumeration value="CUOR"/&gt;
 *     &lt;enumeration value="CUPO"/&gt;
 *     &lt;enumeration value="FONU"/&gt;
 *     &lt;enumeration value="INNU"/&gt;
 *     &lt;enumeration value="ORNU"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PRNU"/&gt;
 *     &lt;enumeration value="PUID"/&gt;
 *     &lt;enumeration value="RELO"/&gt;
 *     &lt;enumeration value="REAG"/&gt;
 *     &lt;enumeration value="RENU"/&gt;
 *     &lt;enumeration value="RSNU"/&gt;
 *     &lt;enumeration value="SUOR"/&gt;
 *     &lt;enumeration value="TINU"/&gt;
 *     &lt;enumeration value="TRNU"/&gt;
 *     &lt;enumeration value="SUIN"/&gt;
 *     &lt;enumeration value="TNID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
