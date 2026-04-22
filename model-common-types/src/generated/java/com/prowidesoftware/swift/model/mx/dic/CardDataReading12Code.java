
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardDataReading12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNKW"/>
 *     <enumeration value="CAMR"/>
 *     <enumeration value="KEEN"/>
 *     <enumeration value="ICPY"/>
 *     <enumeration value="OPTC"/>
 *     <enumeration value="CDFL"/>
 *     <enumeration value="MBNK"/>
 *     <enumeration value="TOKN"/>
 *     <enumeration value="ICCP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardDataReading12Code")
@XmlEnum
public enum CardDataReading12Code {


    /**
     * Unknown card reading capability.
     * 
     */
    UNKW,

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
     * Integrated circuit card read; only partial data is available.
     * 
     */
    ICCP;

    public String value() {
        return name();
    }

    public static CardDataReading12Code fromValue(String v) {
        return valueOf(v);
    }

}
