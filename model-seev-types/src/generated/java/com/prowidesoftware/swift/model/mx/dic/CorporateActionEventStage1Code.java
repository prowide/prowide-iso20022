
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventStage1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionEventStage1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPD"/&gt;
 *     &lt;enumeration value="CLDE"/&gt;
 *     &lt;enumeration value="PWAL"/&gt;
 *     &lt;enumeration value="SUAP"/&gt;
 *     &lt;enumeration value="UNAC"/&gt;
 *     &lt;enumeration value="WHOU"/&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="LAPS"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="RESC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionEventStage1Code")
@XmlEnum
public enum CorporateActionEventStage1Code {


    /**
     * Approved at the relevant meeting, eg, dividend.
     * 
     */
    APPD,

    /**
     * The offer is closed for acceptance.
     * 
     */
    CLDE,

    /**
     * Open for acceptance until the next specified deadline in the announcement (if any).
     * 
     */
    PWAL,

    /**
     * Subject to approval at the relevant meeting, eg, dividend.
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
    WHOU,

    /**
     * An original or supplemental lottery is being reversed.
     * 
     */
    FULL,

    /**
     * The event/offer conditions have not been met and the event/offer is terminated or lapsed.
     * 
     */
    LAPS,

    /**
     * Original call amount is reduced by the agent. The original announcement is cancelled and a new original lottery is issued.
     * 
     */
    PART,

    /**
     * Original and or supplemental lottery details have changed and the lottery is being cancelled.
     * 
     */
    RESC;

    public String value() {
        return name();
    }

    public static CorporateActionEventStage1Code fromValue(String v) {
        return valueOf(v);
    }

}
