
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QRCodePresentmentMode1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QRCodePresentmentMode1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CPMD"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="MPMD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
