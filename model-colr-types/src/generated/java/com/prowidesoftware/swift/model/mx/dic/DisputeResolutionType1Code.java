
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeResolutionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeResolutionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECO"/&gt;
 *     &lt;enumeration value="RMTA"/&gt;
 *     &lt;enumeration value="RERO"/&gt;
 *     &lt;enumeration value="REVF"/&gt;
 *     &lt;enumeration value="RESA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisputeResolutionType1Code")
@XmlEnum
public enum DisputeResolutionType1Code {


    /**
     * Indicates that the disputed collateral amount should be confirmed through reconciliation of the collateral.
     * 
     */
    RECO,

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
     * Indicates that the disputed collateral amount should be confirmed through reconciliation of the initial margin.
     * 
     */
    RESA;

    public String value() {
        return name();
    }

    public static DisputeResolutionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
