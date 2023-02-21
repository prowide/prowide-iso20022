
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QRCodeEncodingMode1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QRCodeEncodingMode1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALFA"/&gt;
 *     &lt;enumeration value="BINA"/&gt;
 *     &lt;enumeration value="KANJ"/&gt;
 *     &lt;enumeration value="NUME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QRCodeEncodingMode1Code")
@XmlEnum
public enum QRCodeEncodingMode1Code {


    /**
     * Alphanumeric value provided in Barcode field.
     * 
     */
    ALFA,

    /**
     * Binary value provided in Quick Response Code Binary Value.
     * 
     */
    BINA,

    /**
     * Kanji value provided in Quick Response Code Binary Value.
     * 
     */
    KANJ,

    /**
     * Numeric value provided in Barcode field.
     * 
     */
    NUME;

    public String value() {
        return name();
    }

    public static QRCodeEncodingMode1Code fromValue(String v) {
        return valueOf(v);
    }

}
