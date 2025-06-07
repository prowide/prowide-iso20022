
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardDataReading2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DFLE"/&gt;
 *     &lt;enumeration value="BRCD"/&gt;
 *     &lt;enumeration value="CDFL"/&gt;
 *     &lt;enumeration value="ECTL"/&gt;
 *     &lt;enumeration value="CICC"/&gt;
 *     &lt;enumeration value="MGST"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="CTLS"/&gt;
 *     &lt;enumeration value="TAGC"/&gt;
 *     &lt;enumeration value="UNKW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
