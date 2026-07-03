
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseIdentifierType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchaseIdentifierType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SUIN"/&gt;
 *     &lt;enumeration value="RELO"/&gt;
 *     &lt;enumeration value="INNU"/&gt;
 *     &lt;enumeration value="PUID"/&gt;
 *     &lt;enumeration value="RENU"/&gt;
 *     &lt;enumeration value="RSNU"/&gt;
 *     &lt;enumeration value="TINU"/&gt;
 *     &lt;enumeration value="SUOR"/&gt;
 *     &lt;enumeration value="CONU"/&gt;
 *     &lt;enumeration value="FONU"/&gt;
 *     &lt;enumeration value="PRNU"/&gt;
 *     &lt;enumeration value="ORNU"/&gt;
 *     &lt;enumeration value="CUOR"/&gt;
 *     &lt;enumeration value="CUPO"/&gt;
 *     &lt;enumeration value="REAG"/&gt;
 *     &lt;enumeration value="TRNU"/&gt;
 *     &lt;enumeration value="TREF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseIdentifierType2Code")
@XmlEnum
public enum PurchaseIdentifierType2Code {


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

    public static PurchaseIdentifierType2Code fromValue(String v) {
        return valueOf(v);
    }

}
