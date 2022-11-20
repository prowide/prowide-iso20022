
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiptType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReceiptType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PAPR"/&gt;
 *     &lt;enumeration value="SMSM"/&gt;
 *     &lt;enumeration value="URID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
