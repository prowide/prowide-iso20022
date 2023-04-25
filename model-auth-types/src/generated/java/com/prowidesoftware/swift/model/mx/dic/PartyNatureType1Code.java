
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyNatureType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyNatureType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHR"/>
 *     <enumeration value="NFIN"/>
 *     <enumeration value="FIIN"/>
 *     <enumeration value="CCPS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyNatureType1Code")
@XmlEnum
public enum PartyNatureType1Code {


    /**
     * Other type of issuer.
     * 
     */
    OTHR,

    /**
     * Issuer is a non-financial institution.
     * 
     */
    NFIN,

    /**
     * Issuer is a financial institution.
     * 
     */
    FIIN,

    /**
     * Issuer is a central counterparty.
     * 
     */
    CCPS;

    public String value() {
        return name();
    }

    public static PartyNatureType1Code fromValue(String v) {
        return valueOf(v);
    }

}
