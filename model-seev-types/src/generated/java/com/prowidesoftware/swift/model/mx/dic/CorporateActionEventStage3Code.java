
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventStage3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionEventStage3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPD"/&gt;
 *     &lt;enumeration value="CLDE"/&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="LAPS"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="PWAL"/&gt;
 *     &lt;enumeration value="RESC"/&gt;
 *     &lt;enumeration value="SUAP"/&gt;
 *     &lt;enumeration value="UNAC"/&gt;
 *     &lt;enumeration value="WHOU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
