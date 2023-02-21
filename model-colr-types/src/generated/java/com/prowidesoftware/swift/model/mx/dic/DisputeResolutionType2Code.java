
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeResolutionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeResolutionType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECO"/&gt;
 *     &lt;enumeration value="REEX"/&gt;
 *     &lt;enumeration value="RETH"/&gt;
 *     &lt;enumeration value="RMTA"/&gt;
 *     &lt;enumeration value="RERO"/&gt;
 *     &lt;enumeration value="REVF"/&gt;
 *     &lt;enumeration value="RNIA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisputeResolutionType2Code")
@XmlEnum
public enum DisputeResolutionType2Code {


    /**
     * Indicates that the disputed collateral amount should be confirmed through reconciliation of the collateral.
     * 
     */
    RECO,

    /**
     * Indicates that the disputed collateral amount should be confirmed through reconciliation of the exposure.
     * 
     */
    REEX,

    /**
     * Indicates that the disputed collateral amount should be confirmed through reconciliation of the threshold.
     * 
     */
    RETH,

    /**
     * Indicates that the disputed collateral amount should be confirmed through reconciliation of the minimum transfer amount.
     * 
     */
    RMTA,

    /**
     * Indicates that the disputed collateral amount should be confirmed through reconciliation of the rounding.
     * 
     */
    RERO,

    /**
     * Indicates that the disputed collateral amount should be confirmed through reconciliation of the valuation frequency.
     * 
     */
    REVF,

    /**
     * Indicates that the disputed collateral amount should be confirmed through reconciliation of the independent amount.
     * 
     */
    RNIA;

    public String value() {
        return name();
    }

    public static DisputeResolutionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
