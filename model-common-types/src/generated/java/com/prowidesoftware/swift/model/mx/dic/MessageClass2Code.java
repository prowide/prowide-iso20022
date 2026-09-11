
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageClass2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageClass2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADDE"/>
 *     <enumeration value="AMDT"/>
 *     <enumeration value="AUTH"/>
 *     <enumeration value="CMGT"/>
 *     <enumeration value="CBCK"/>
 *     <enumeration value="FEEC"/>
 *     <enumeration value="FINL"/>
 *     <enumeration value="INVR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageClass2Code")
@XmlEnum
public enum MessageClass2Code {


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
     * Inquiry verification class of messages
     * 
     */
    INVR;

    public String value() {
        return name();
    }

    public static MessageClass2Code fromValue(String v) {
        return valueOf(v);
    }

}
