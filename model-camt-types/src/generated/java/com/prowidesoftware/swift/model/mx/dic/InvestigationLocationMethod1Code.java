
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestigationLocationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestigationLocationMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EDIC"/>
 *     <enumeration value="EMAL"/>
 *     <enumeration value="FAXI"/>
 *     <enumeration value="POST"/>
 *     <enumeration value="SMSM"/>
 *     <enumeration value="URID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestigationLocationMethod1Code")
@XmlEnum
public enum InvestigationLocationMethod1Code {


    /**
     * Investigation related data must be sent through Electronic Data Interchange (EDI).
     * 
     */
    EDIC,

    /**
     * Investigation related data must be sent through e-mail.
     * 
     */
    EMAL,

    /**
     * Investigation related data must be faxed.
     * 
     */
    FAXI,

    /**
     * Investigation related data must be sent through postal services.
     * 
     */
    POST,

    /**
     * Investigation related data must be sent through by phone as a short message service (SMS).
     * 
     */
    SMSM,

    /**
     * Investigation related data needs to be sent to a Uniform Resource Identifier (URI). URI is a compact string of characters that uniquely identify an abstract or physical resource. URI's are the super-set of identifiers, such as URLs, email addresses, ftp sites, etc, and as such, provide the syntax for all of the identification schemes.
     * 
     */
    URID;

    public String value() {
        return name();
    }

    public static InvestigationLocationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
