
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CommunicationMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SWMT"/>
 *     <enumeration value="SWMX"/>
 *     <enumeration value="FAXI"/>
 *     <enumeration value="EMAL"/>
 *     <enumeration value="PROP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CommunicationMethod1Code")
@XmlEnum
public enum CommunicationMethod1Code {


    /**
     * Transmission by Swift (FIN).
     * 
     */
    SWMT,

    /**
     * Transmission by SWIFTNET.
     * 
     */
    SWMX,

    /**
     * Transmission by fax.
     * 
     */
    FAXI,

    /**
     * Transmission by e-mail.
     * 
     */
    EMAL,

    /**
     * Transmission by proprietary method.
     * 
     */
    PROP;

    public String value() {
        return name();
    }

    public static CommunicationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
