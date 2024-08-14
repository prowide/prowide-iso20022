
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemSecuritiesAccountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SystemSecuritiesAccountType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSDP"/>
 *     <enumeration value="CSDM"/>
 *     <enumeration value="ICSA"/>
 *     <enumeration value="TOFF"/>
 *     <enumeration value="CSDO"/>
 *     <enumeration value="ISSA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SystemSecuritiesAccountType1Code")
@XmlEnum
public enum SystemSecuritiesAccountType1Code {


    /**
     * Account owned by a CSD Participant
     * .
     * 
     */
    CSDP,

    /**
     * Account operated by CSD for mirroring positions
     * .
     * 
     */
    CSDM,

    /**
     * Account operated by CSD for settlement of securities legs for instructions involving internal CSD s.
     * 
     */
    ICSA,

    /**
     * Account operated by CSDs in a direct holding market context.
     * 
     */
    TOFF,

    /**
     * Account operated by CSD in cross-CSD settlement context.
     * 
     */
    CSDO,

    /**
     * Account reflecting the holdings of the participants of the issuer CSD for a given financial instrument.
     * 
     */
    ISSA;

    public String value() {
        return name();
    }

    public static SystemSecuritiesAccountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
