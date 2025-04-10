
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageClass1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageClass1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADDE"/>
 *     <enumeration value="AMDT"/>
 *     <enumeration value="AUTH"/>
 *     <enumeration value="CMGT"/>
 *     <enumeration value="CBCK"/>
 *     <enumeration value="FEEC"/>
 *     <enumeration value="FINL"/>
 *     <enumeration value="INQY"/>
 *     <enumeration value="VERI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
