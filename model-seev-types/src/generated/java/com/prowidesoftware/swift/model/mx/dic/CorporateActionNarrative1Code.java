
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionNarrative1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionNarrative1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TAXE"/>
 *     <enumeration value="REGI"/>
 *     <enumeration value="WTRC"/>
 *     <enumeration value="RFMC"/>
 *     <enumeration value="PAUT"/>
 *     <enumeration value="CTIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionNarrative1Code")
@XmlEnum
public enum CorporateActionNarrative1Code {


    /**
     * Provides taxation conditions that cannot be included within the structured fields of this message.
     * 
     */
    TAXE,

    /**
     * Provides information required for the registration.
     * 
     */
    REGI,

    /**
     * Certification process for withholding tax reduction or exemption based on the tax status of the holder.
     * 
     */
    WTRC,

    /**
     * In the context of a corporate action, an International Central Securities Depository (ICSD) refuses a mark-up/mark-down confirmation sent by the account servicer.
     * 
     */
    RFMC,

    /**
     * International Central Securities Depository (ICSD) chases the authorisation from the account servicer in order to process the exchange from global temporary to global permanent.
     * 
     */
    PAUT,

    /**
     * Confirmation of transfer of interests between International Central Securities Depositories (ICSDs) following a corporate actions.
     * 
     */
    CTIN;

    public String value() {
        return name();
    }

    public static CorporateActionNarrative1Code fromValue(String v) {
        return valueOf(v);
    }

}
