
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyType17Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="ACQR"/>
 *     <enumeration value="ACQP"/>
 *     <enumeration value="CISS"/>
 *     <enumeration value="CISP"/>
 *     <enumeration value="AGNT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyType17Code")
@XmlEnum
public enum PartyType17Code {


    /**
     * Other card payment entity type defined at national level
     * 
     */
    OTHN,

    /**
     * Other card payment entity type defined at private level
     * 
     */
    OTHP,

    /**
     * Entity acquiring card transactions.
     * 
     */
    ACQR,

    /**
     * Entity providing acquiring card payment processing services on behalf on an acquirer.
     * 
     */
    ACQP,

    /**
     * Party that issues cards.
     * 
     */
    CISS,

    /**
     * Entity providing issuing card payment processing services on behalf on an issuer.
     * 
     */
    CISP,

    /**
     * Entity providing card payment processing services acting as an intermediary between an acquirer and an issuer.
     * 
     */
    AGNT;

    public String value() {
        return name();
    }

    public static PartyType17Code fromValue(String v) {
        return valueOf(v);
    }

}
