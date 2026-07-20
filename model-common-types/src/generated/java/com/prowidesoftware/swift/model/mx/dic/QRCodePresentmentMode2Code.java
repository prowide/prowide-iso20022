
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QRCodePresentmentMode2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="QRCodePresentmentMode2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CPMD"/>
 *     <enumeration value="MPMD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "QRCodePresentmentMode2Code")
@XmlEnum
public enum QRCodePresentmentMode2Code {


    /**
     * The consumer presented a QR Code at the point of service for the transaction.
     * 
     */
    CPMD,

    /**
     * The acceptor presented a QR Code to the consumer for the transaction.
     * 
     */
    MPMD;

    public String value() {
        return name();
    }

    public static QRCodePresentmentMode2Code fromValue(String v) {
        return valueOf(v);
    }

}
