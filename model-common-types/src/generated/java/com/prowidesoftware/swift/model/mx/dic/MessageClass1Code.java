
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageClass1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageClass1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADDE"/&gt;
 *     &lt;enumeration value="AMDT"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="CMGT"/&gt;
 *     &lt;enumeration value="CBCK"/&gt;
 *     &lt;enumeration value="FEEC"/&gt;
 *     &lt;enumeration value="FINL"/&gt;
 *     &lt;enumeration value="INQY"/&gt;
 *     &lt;enumeration value="VERI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageClass1Code")
@XmlEnum
public enum MessageClass1Code {


    /**
     * Addendum class of messages.
     * 
     */
    ADDE,

    /**
     * Amendment class of messages.
     * 
     */
    AMDT,

    /**
     * Authorisation class of messages.
     * 
     */
    AUTH,

    /**
     * Card management class of messages.
     * 
     */
    CMGT,

    /**
     * Charge back class of messages.
     * 
     */
    CBCK,

    /**
     * Fee collection class of messages.
     * 
     */
    FEEC,

    /**
     * Financial class of messages.
     * 
     */
    FINL,

    /**
     * Inquiry class of messages.
     * 
     */
    INQY,

    /**
     * Verification class of messages.
     * 
     */
    VERI;

    public String value() {
        return name();
    }

    public static MessageClass1Code fromValue(String v) {
        return valueOf(v);
    }

}
