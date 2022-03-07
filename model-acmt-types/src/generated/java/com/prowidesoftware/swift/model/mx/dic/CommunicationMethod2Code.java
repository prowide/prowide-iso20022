
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationMethod2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="FAXI"/&gt;
 *     &lt;enumeration value="FILE"/&gt;
 *     &lt;enumeration value="ONLI"/&gt;
 *     &lt;enumeration value="POST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Transmission by Fax.
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
