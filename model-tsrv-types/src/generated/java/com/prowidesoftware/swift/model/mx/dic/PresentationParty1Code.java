
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentationParty1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PresentationParty1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ETHR"/>
 *     <enumeration value="EXCN"/>
 *     <enumeration value="EXIS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
