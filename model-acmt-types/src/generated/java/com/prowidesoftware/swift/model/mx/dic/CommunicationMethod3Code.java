
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationMethod3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CommunicationMethod3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EMAL"/>
 *     <enumeration value="FAXI"/>
 *     <enumeration value="POST"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="FILE"/>
 *     <enumeration value="ONLI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CommunicationMethod3Code")
@XmlEnum
public enum CommunicationMethod3Code {


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
     * Transmission by postal service.
     * 
     */
    POST,

    /**
     * Transmission by telephone.
     * 
     */
    PHON,

    /**
     * Transmission by file transfer.
     * 
     */
    FILE,

    /**
     * Transmission on line, for example, in a web portal.
     * 
     */
    ONLI;

    public String value() {
        return name();
    }

    public static CommunicationMethod3Code fromValue(String v) {
        return valueOf(v);
    }

}
