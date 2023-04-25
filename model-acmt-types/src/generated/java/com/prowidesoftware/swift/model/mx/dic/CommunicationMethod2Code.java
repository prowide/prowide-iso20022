
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CommunicationMethod2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EMAL"/>
 *     <enumeration value="FAXI"/>
 *     <enumeration value="FILE"/>
 *     <enumeration value="ONLI"/>
 *     <enumeration value="POST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CommunicationMethod2Code")
@XmlEnum
public enum CommunicationMethod2Code {


    /**
     * Transmission by e-mail.
     * 
     */
    EMAL,

    /**
     * Transmission by fax.
     * 
     */
    FAXI,

    /**
     * Transmission by file transfer.
     * 
     */
    FILE,

    /**
     * Transmission on line, for example, in a web portal.
     * 
     */
    ONLI,

    /**
     * Transmission by postal service.
     * 
     */
    POST;

    public String value() {
        return name();
    }

    public static CommunicationMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
