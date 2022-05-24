
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionNarrative1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionNarrative1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TAXE"/&gt;
 *     &lt;enumeration value="REGI"/&gt;
 *     &lt;enumeration value="WTRC"/&gt;
 *     &lt;enumeration value="RFMC"/&gt;
 *     &lt;enumeration value="PAUT"/&gt;
 *     &lt;enumeration value="CTIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * In the context of  a corporate action, an International Central Securities Depository (ICSD)  refuses a mark-up/mark-down confirmation sent by the account servicer.
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
