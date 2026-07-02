
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventStage2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionEventStage2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PWAL"/&gt;
 *     &lt;enumeration value="SUAP"/&gt;
 *     &lt;enumeration value="APPD"/&gt;
 *     &lt;enumeration value="UNAC"/&gt;
 *     &lt;enumeration value="WHOU"/&gt;
 *     &lt;enumeration value="CLDE"/&gt;
 *     &lt;enumeration value="LAPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionEventStage2Code")
@XmlEnum
public enum CorporateActionEventStage2Code {


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
     * Approved at the relevant meeting, eg, dividend.
     * 
     */
    APPD,

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
     * The offer is closed for acceptance.
     * 
     */
    CLDE,

    /**
     * The event/offer conditions have not been met and the event/offer is terminated or lapsed.
     * 
     */
    LAPS;

    public String value() {
        return name();
    }

    public static CorporateActionEventStage2Code fromValue(String v) {
        return valueOf(v);
    }

}
