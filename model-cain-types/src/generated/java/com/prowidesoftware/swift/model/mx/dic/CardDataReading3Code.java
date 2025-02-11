
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardDataReading3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CDFL"/>
 *     <enumeration value="ECTL"/>
 *     <enumeration value="CICC"/>
 *     <enumeration value="MGST"/>
 *     <enumeration value="CTLS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardDataReading3Code")
@XmlEnum
public enum CardDataReading3Code {


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
     * Contactless proximity reader.
     * 
     */
    CTLS;

    public String value() {
        return name();
    }

    public static CardDataReading3Code fromValue(String v) {
        return valueOf(v);
    }

}
