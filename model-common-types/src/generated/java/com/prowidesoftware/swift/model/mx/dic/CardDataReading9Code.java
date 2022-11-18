
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardDataReading9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKW"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="CAMR"/&gt;
 *     &lt;enumeration value="KEEN"/&gt;
 *     &lt;enumeration value="ICPY"/&gt;
 *     &lt;enumeration value="OPTC"/&gt;
 *     &lt;enumeration value="CDFL"/&gt;
 *     &lt;enumeration value="MBNK"/&gt;
 *     &lt;enumeration value="TOKN"/&gt;
 *     &lt;enumeration value="ICCY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardDataReading9Code")
@XmlEnum
public enum CardDataReading9Code {


    /**
     * Unknown card reading capability.
     * 
     */
    UNKW,

    /**
     * Other national capability type assigned at national level.
     * 
     */
    OTHN,

    /**
     * Other card reading capability assigned on a private basis.
     * 
     */
    OTHP,

    /**
     * Card details captured via camera.
     * 
     */
    CAMR,

    /**
     * Key entered.
     * 
     */
    KEEN,

    /**
     * ICC contactless proximity
     * 
     */
    ICPY,

    /**
     * Optical coded reading capabilities (e.g. barcode, QR code, etc.)
     * 
     */
    OPTC,

    /**
     * Card information are stored on a file.
     * 
     */
    CDFL,

    /**
     * Card details were obtained via a mobile banking application.
     * 
     */
    MBNK,

    /**
     * Card details were obtained via a token.
     * 
     */
    TOKN,

    /**
     * ICC contact capability
     * 
     */
    ICCY;

    public String value() {
        return name();
    }

    public static CardDataReading9Code fromValue(String v) {
        return valueOf(v);
    }

}
