
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationMethod4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationMethod4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="FAXI"/&gt;
 *     &lt;enumeration value="FILE"/&gt;
 *     &lt;enumeration value="ONLI"/&gt;
 *     &lt;enumeration value="PHON"/&gt;
 *     &lt;enumeration value="POST"/&gt;
 *     &lt;enumeration value="PROP"/&gt;
 *     &lt;enumeration value="SWMT"/&gt;
 *     &lt;enumeration value="SWMX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
