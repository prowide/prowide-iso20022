
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SWMT"/&gt;
 *     &lt;enumeration value="SWMX"/&gt;
 *     &lt;enumeration value="FAXI"/&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="PROP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
