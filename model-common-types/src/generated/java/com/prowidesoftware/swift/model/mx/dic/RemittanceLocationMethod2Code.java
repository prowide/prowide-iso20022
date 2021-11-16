
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemittanceLocationMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemittanceLocationMethod2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAXI"/&gt;
 *     &lt;enumeration value="EDIC"/&gt;
 *     &lt;enumeration value="URID"/&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="POST"/&gt;
 *     &lt;enumeration value="SMSM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RemittanceLocationMethod2Code")
@XmlEnum
public enum RemittanceLocationMethod2Code {


    /**
     * Remittance advice information must be faxed.
     * 
     */
    FAXI,

    /**
     * Remittance advice information must be sent through Electronic Data Interchange (EDI).
     * 
     */
    EDIC,

    /**
     * Remittance advice  information needs to be sent to a Uniform Resource Identifier (URI). URI  is a compact string of characters that uniquely identify an abstract or physical resource.  URI's are the super-set of identifiers, such as URLs, email addresses, ftp sites, etc, and as such, provide the syntax for all of the identification schemes.
     * 
     */
    URID,

    /**
     * Remittance advice  information must be sent through e-mail.
     * 
     */
    EMAL,

    /**
     * Remittance advice information must be sent through postal services.
     * 
     */
    POST,

    /**
     * Remittance advice  information must be sent through by phone as a short message service (SMS).
     * 
     */
    SMSM;

    public String value() {
        return name();
    }

    public static RemittanceLocationMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
