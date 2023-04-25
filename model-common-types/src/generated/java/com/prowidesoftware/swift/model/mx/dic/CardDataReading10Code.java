
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardDataReading10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ICPY"/>
 *     <enumeration value="MGST"/>
 *     <enumeration value="ICCY"/>
 *     <enumeration value="MICR"/>
 *     <enumeration value="MLEY"/>
 *     <enumeration value="OCRR"/>
 *     <enumeration value="MSIP"/>
 *     <enumeration value="OPTC"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="RFID"/>
 *     <enumeration value="UNSP"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="KEEN"/>
 *     <enumeration value="DFLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardDataReading10Code")
@XmlEnum
public enum CardDataReading10Code {


    /**
     * ICC contactless proximity
     * 
     */
    ICPY,

    /**
     * Magnetic stripe.
     * 
     */
    MGST,

    /**
     * ICC contact capability
     * 
     */
    ICCY,

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
     * Other national capability type assigned at national level.
     * 
     */
    OTHN,

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
     * Other card reading capability assigned on a private basis.
     * 
     */
    OTHP,

    /**
     * Key entered.
     * 
     */
    KEEN,

    /**
     * Account data on file.
     * 
     */
    DFLE;

    public String value() {
        return name();
    }

    public static CardDataReading10Code fromValue(String v) {
        return valueOf(v);
    }

}
