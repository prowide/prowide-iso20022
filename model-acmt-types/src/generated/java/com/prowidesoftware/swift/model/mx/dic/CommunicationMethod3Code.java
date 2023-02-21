
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationMethod3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationMethod3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="FAXI"/&gt;
 *     &lt;enumeration value="POST"/&gt;
 *     &lt;enumeration value="PHON"/&gt;
 *     &lt;enumeration value="FILE"/&gt;
 *     &lt;enumeration value="ONLI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
