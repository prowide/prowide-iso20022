
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentationParty1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PresentationParty1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ETHR"/&gt;
 *     &lt;enumeration value="EXCN"/&gt;
 *     &lt;enumeration value="EXIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PresentationParty1Code")
@XmlEnum
public enum PresentationParty1Code {


    /**
     * Presentation made either to the issuer or other nominated party.
     * 
     */
    ETHR,

    /**
     * Presentation made exclusively to the confirmer.
     * 
     */
    EXCN,

    /**
     * Presentation made exclusively to the issuer.
     * 
     */
    EXIS;

    public String value() {
        return name();
    }

    public static PresentationParty1Code fromValue(String v) {
        return valueOf(v);
    }

}
