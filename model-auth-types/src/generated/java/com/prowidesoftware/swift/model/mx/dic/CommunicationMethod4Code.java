
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationMethod4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CommunicationMethod4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EMAL"/>
 *     <enumeration value="FAXI"/>
 *     <enumeration value="FILE"/>
 *     <enumeration value="ONLI"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="POST"/>
 *     <enumeration value="PROP"/>
 *     <enumeration value="SWMT"/>
 *     <enumeration value="SWMX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CommunicationMethod4Code")
@XmlEnum
public enum CommunicationMethod4Code {


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
     * Transmission by telephone.
     * 
     */
    PHON,

    /**
     * Transmission by postal service.
     * 
     */
    POST,

    /**
     * Transmission by proprietary method.
     * 
     */
    PROP,

    /**
     * Transmission by Swift (FIN).
     * 
     */
    SWMT,

    /**
     * Transmission by SWIFTNET.
     * 
     */
    SWMX;

    public String value() {
        return name();
    }

    public static CommunicationMethod4Code fromValue(String v) {
        return valueOf(v);
    }

}
