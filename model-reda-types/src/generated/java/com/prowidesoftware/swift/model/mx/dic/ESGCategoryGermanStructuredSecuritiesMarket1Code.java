
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESGCategoryGermanStructuredSecuritiesMarket1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ESGCategoryGermanStructuredSecuritiesMarket1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEUT"/&gt;
 *     &lt;enumeration value="IMPS"/&gt;
 *     &lt;enumeration value="ESGS"/&gt;
 *     &lt;enumeration value="BASS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ESGCategoryGermanStructuredSecuritiesMarket1Code")
@XmlEnum
public enum ESGCategoryGermanStructuredSecuritiesMarket1Code {


    /**
     * Netural or has no impact.
     * 
     */
    NEUT,

    /**
     * Impact-related bond according to recognised market standards (for example, Green/Social Bond Principles, EU Green Bond Standards).
     * 
     */
    IMPS,

    /**
     * Product manufacturer attains at least with one rating agency the status of a sustainable company.
     * 
     */
    ESGS,

    /**
     * Product manufacturer follows environmental, social and corporate governance (ESG) product and transparency standard.
     * 
     */
    BASS;

    public String value() {
        return name();
    }

    public static ESGCategoryGermanStructuredSecuritiesMarket1Code fromValue(String v) {
        return valueOf(v);
    }

}
