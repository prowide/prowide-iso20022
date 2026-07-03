
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardDataReading7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CDFL"/&gt;
 *     &lt;enumeration value="ICPY"/&gt;
 *     &lt;enumeration value="MGST"/&gt;
 *     &lt;enumeration value="ICCY"/&gt;
 *     &lt;enumeration value="MICR"/&gt;
 *     &lt;enumeration value="MLEY"/&gt;
 *     &lt;enumeration value="OCRR"/&gt;
 *     &lt;enumeration value="MSIP"/&gt;
 *     &lt;enumeration value="OPTC"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="RFID"/&gt;
 *     &lt;enumeration value="UNSP"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="KEEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardDataReading7Code")
@XmlEnum
public enum CardDataReading7Code {


    /**
     * Card information are stored on a file.
     * 
     */
    CDFL,

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
    KEEN;

    public String value() {
        return name();
    }

    public static CardDataReading7Code fromValue(String v) {
        return valueOf(v);
    }

}
