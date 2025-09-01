
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessingType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="CVHD"/&gt;
 *     &lt;enumeration value="RSVT"/&gt;
 *     &lt;enumeration value="BLCK"/&gt;
 *     &lt;enumeration value="EARM"/&gt;
 *     &lt;enumeration value="EFAC"/&gt;
 *     &lt;enumeration value="DLVR"/&gt;
 *     &lt;enumeration value="COLD"/&gt;
 *     &lt;enumeration value="CSDB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessingType1Code")
@XmlEnum
public enum ProcessingType1Code {


    /**
     * Restriction is the rejection during the settlement instruction validation.
     * 
     */
    RJCT,

    /**
     * Restriction is setting the CSD validation automatically to hold when accepting a settlement instruction.
     * 
     */
    CVHD,

    /**
     * Restriction is the creation of a reservation of a cash balance or a securities position for a specific purpose.
     * 
     */
    RSVT,

    /**
     * Restriction is the blocking of a party, securities account, security or cash account from settlement, blocking of securities position or cash balance for a specific purpose.
     * 
     */
    BLCK,

    /**
     * Restriction of linked to the balance type that defines and manages position types for securities positions.
     * 
     */
    EARM,

    /**
     * Restriction of linked to the balance type that defines and manages position types for securities positions for auto-collateralisation.
     * 
     */
    EFAC,

    /**
     * No restriction has been defined.
     * 
     */
    DLVR,

    /**
     * Restriction is linked to a sub-pledged collateral transaction.
     * 
     */
    COLD,

    /**
     * Restriction does not support any partial execution.
     * 
     */
    CSDB;

    public String value() {
        return name();
    }

    public static ProcessingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
