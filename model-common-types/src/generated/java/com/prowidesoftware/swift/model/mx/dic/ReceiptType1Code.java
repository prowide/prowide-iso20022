
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiptType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReceiptType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EMAL"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PAPR"/>
 *     <enumeration value="SMSM"/>
 *     <enumeration value="URID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReceiptType1Code")
@XmlEnum
public enum ReceiptType1Code {


    /**
     * Receipt transmitted by Email.
     * 
     */
    EMAL,

    /**
     * Other type of channel to transmit receipt information to the recipient.
     * 
     */
    OTHR,

    /**
     * Receipt in a paper form.
     * 
     */
    PAPR,

    /**
     * Receipt transmitted by SMS message.
     * 
     */
    SMSM,

    /**
     * Receipt transmitted to a Uniform Resource Identifier (URI) address.
     * 
     */
    URID;

    public String value() {
        return name();
    }

    public static ReceiptType1Code fromValue(String v) {
        return valueOf(v);
    }

}
