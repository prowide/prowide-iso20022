
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardDataReading6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TAGC"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="BRCD"/>
 *     <enumeration value="MGST"/>
 *     <enumeration value="CICC"/>
 *     <enumeration value="DFLE"/>
 *     <enumeration value="CTLS"/>
 *     <enumeration value="ECTL"/>
 *     <enumeration value="CDFL"/>
 *     <enumeration value="SICC"/>
 *     <enumeration value="UNKW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardDataReading6Code")
@XmlEnum
public enum CardDataReading6Code {


    /**
     * Tag reading capabilities (RFID, etc.).
     * 
     */
    TAGC,

    /**
     * Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.
     * 
     */
    PHYS,

    /**
     * Bar code.
     * 
     */
    BRCD,

    /**
     * Magnetic stripe.
     * 
     */
    MGST,

    /**
     * ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.
     * 
     */
    CICC,

    /**
     * Account data on file.
     * 
     */
    DFLE,

    /**
     * Contactless proximity reader.
     * 
     */
    CTLS,

    /**
     * Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).
     * 
     */
    ECTL,

    /**
     * Card information are stored on a file.
     * 
     */
    CDFL,

    /**
     * Synchronous ICC - (Integrated Circuit Card) with contact.
     * 
     */
    SICC,

    /**
     * Unknown card reading capability.
     * 
     */
    UNKW;

    public String value() {
        return name();
    }

    public static CardDataReading6Code fromValue(String v) {
        return valueOf(v);
    }

}
