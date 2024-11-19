
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QRCodePresentmentMode1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="QRCodePresentmentMode1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CPMD"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="MPMD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "QRCodePresentmentMode1Code")
@XmlEnum
public enum QRCodePresentmentMode1Code {


    /**
     * The consumer presented a QR Code at the point of service for the transaction.
     * 
     */
    CPMD,

    /**
     * Other nationally defined method for QR Code presentment for the transaction.
     * 
     */
    OTHN,

    /**
     * Other QR Code presentment mode defined by bilateral agreement.
     * 
     */
    OTHP,

    /**
     * The acceptor presented a QR Code to the consumer for the transaction.
     * 
     */
    MPMD;

    public String value() {
        return name();
    }

    public static QRCodePresentmentMode1Code fromValue(String v) {
        return valueOf(v);
    }

}
