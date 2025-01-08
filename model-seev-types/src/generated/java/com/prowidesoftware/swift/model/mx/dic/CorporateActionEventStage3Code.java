
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventStage3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionEventStage3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APPD"/>
 *     <enumeration value="CLDE"/>
 *     <enumeration value="FULL"/>
 *     <enumeration value="LAPS"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="PWAL"/>
 *     <enumeration value="RESC"/>
 *     <enumeration value="SUAP"/>
 *     <enumeration value="UNAC"/>
 *     <enumeration value="WHOU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionEventStage3Code")
@XmlEnum
public enum CorporateActionEventStage3Code {


    /**
     * Approved at the relevant meeting, for example, dividend.
     * 
     */
    APPD,

    /**
     * Offer is closed for acceptance.
     * 
     */
    CLDE,

    /**
     * Cancellation and re-run of an original lottery or an original and supplemental lottery. A subsequent lottery will be performed under a new event.
     * 
     */
    FULL,

    /**
     * Event/offer conditions have not been met and the event/offer is terminated or lapsed.
     * 
     */
    LAPS,

    /**
     * Cancellation and re-run of a supplemental lottery only. A subsequent new supplemental lottery will be performed under the original event.
     * 
     */
    PART,

    /**
     * Open for acceptance until the next specified deadline in the announcement (if any).
     * 
     */
    PWAL,

    /**
     * A supplemental lottery is being cancelled by the issuer. No subsequent lottery will be performed.
     * 
     */
    RESC,

    /**
     * Subject to approval at the relevant meeting, for example, dividend.
     * 
     */
    SUAP,

    /**
     * The required level of acceptances specified in the terms of the offer has been achieved but there are still outstanding conditions to fulfil.
     * 
     */
    UNAC,

    /**
     * Wholly unconditional; all conditions specified in the offer document have been satisfied.
     * 
     */
    WHOU;

    public String value() {
        return name();
    }

    public static CorporateActionEventStage3Code fromValue(String v) {
        return valueOf(v);
    }

}
