
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardDataReading2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DFLE"/>
 *     <enumeration value="BRCD"/>
 *     <enumeration value="CDFL"/>
 *     <enumeration value="ECTL"/>
 *     <enumeration value="CICC"/>
 *     <enumeration value="MGST"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="CTLS"/>
 *     <enumeration value="TAGC"/>
 *     <enumeration value="UNKW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardDataReading2Code")
@XmlEnum
public enum CardDataReading2Code {


    /**
     * Account data on file.
     * 
     */
    DFLE,

    /**
     * Bar code.
     * 
     */
    BRCD,

    /**
     * Card information are stored on a file.
     * 
     */
    CDFL,

    /**
     * Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).
     * 
     */
    ECTL,

    /**
     * ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.
     * 
     */
    CICC,

    /**
     * Magnetic stripe.
     * 
     */
    MGST,

    /**
     * Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.
     * 
     */
    PHYS,

    /**
     * Contactless proximity reader.
     * 
     */
    CTLS,

    /**
     * Tag reading capabilities (RFID, etc.).
     * 
     */
    TAGC,

    /**
     * Unknown card reading capability.
     * 
     */
    UNKW;

    public String value() {
        return name();
    }

    public static CardDataReading2Code fromValue(String v) {
        return valueOf(v);
    }

}
