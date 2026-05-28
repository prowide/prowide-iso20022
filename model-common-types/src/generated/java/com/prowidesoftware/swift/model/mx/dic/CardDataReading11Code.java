
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardDataReading11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ICPY"/>
 *     <enumeration value="MGSP"/>
 *     <enumeration value="MICR"/>
 *     <enumeration value="MLEY"/>
 *     <enumeration value="OCRR"/>
 *     <enumeration value="MSIP"/>
 *     <enumeration value="OPTC"/>
 *     <enumeration value="RFID"/>
 *     <enumeration value="UNSP"/>
 *     <enumeration value="KEEN"/>
 *     <enumeration value="CDFS"/>
 *     <enumeration value="CDFL"/>
 *     <enumeration value="MGST"/>
 *     <enumeration value="NFCF"/>
 *     <enumeration value="ICCY"/>
 *     <enumeration value="ICCP"/>
 *     <enumeration value="ICMG"/>
 *     <enumeration value="ICFM"/>
 *     <enumeration value="DCPY"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardDataReading11Code")
@XmlEnum
public enum CardDataReading11Code {


    /**
     * ICC contactless proximity
     * 
     */
    ICPY,

    /**
     * Magnetic stripe is read, only partial data is available.
     * 
     */
    MGSP,

    /**
     * Recognition of magnetic ink characters
     * 
     */
    MICR,

    /**
     * Manual, no terminal used.
     * 
     */
    MLEY,

    /**
     * OCR either at time of transaction or after the event.
     * 
     */
    OCRR,

    /**
     * Magstripe image contactless proximity
     * 
     */
    MSIP,

    /**
     * Optical coded reading capabilities (e.g. barcode, QR code, etc.)
     * 
     */
    OPTC,

    /**
     * Radio Frequency Identification tag capabilities.
     * 
     */
    RFID,

    /**
     * Unspecified capability.
     * 
     */
    UNSP,

    /**
     * Key entered.
     * 
     */
    KEEN,

    /**
     * Card information are stored on a server.
     * 
     */
    CDFS,

    /**
     * Card information are stored on a file.
     * 
     */
    CDFL,

    /**
     * Magnetic stripe.
     * 
     */
    MGST,

    /**
     * NFC Type-F frquency.
     * 
     */
    NFCF,

    /**
     * ICC contact capability
     * 
     */
    ICCY,

    /**
     * Integrated circuit card read; only partial data is available.
     * 
     */
    ICCP,

    /**
     * ICC contact with fallback to magstripe mode 
     * 
     */
    ICMG,

    /**
     * ICC contact with fallback to manual mode 
     * 
     */
    ICFM,

    /**
     * Domestic ICC Contactess
     * 
     */
    DCPY,

    /**
     * Other card data reading mode.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static CardDataReading11Code fromValue(String v) {
        return valueOf(v);
    }

}
