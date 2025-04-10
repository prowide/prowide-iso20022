
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardDataReading9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNKW"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="CAMR"/>
 *     <enumeration value="KEEN"/>
 *     <enumeration value="ICPY"/>
 *     <enumeration value="OPTC"/>
 *     <enumeration value="CDFL"/>
 *     <enumeration value="MBNK"/>
 *     <enumeration value="TOKN"/>
 *     <enumeration value="ICCY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
