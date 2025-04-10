
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType25Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyType25Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACQR"/>
 *     <enumeration value="CISS"/>
 *     <enumeration value="CSCH"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyType25Code")
@XmlEnum
public enum PartyType25Code {


    /**
     * Entity acquiring card transactions.
     * 
     */
    ACQR,

    /**
     * Party that issues cards.
     * 
     */
    CISS,

    /**
     * Entity defining rules and procedures for card payment transactions acting as an intermediary between an acquirer and an issuer.
     * 
     */
    CSCH,

    /**
     * Entity providing card payment processing services acting as an intermediary between an acquirer and an issuer.
     * 
     */
    AGNT,

    /**
     * Other card payment entity type defined at national level
     * 
     */
    OTHN,

    /**
     * Other card payment entity type defined at private level
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static PartyType25Code fromValue(String v) {
        return valueOf(v);
    }

}
