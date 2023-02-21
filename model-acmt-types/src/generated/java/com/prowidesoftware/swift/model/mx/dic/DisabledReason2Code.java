
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisabledReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisabledReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLOS"/&gt;
 *     &lt;enumeration value="BKRP"/&gt;
 *     &lt;enumeration value="CMMT"/&gt;
 *     &lt;enumeration value="CNFS"/&gt;
 *     &lt;enumeration value="MORT"/&gt;
 *     &lt;enumeration value="PCOM"/&gt;
 *     &lt;enumeration value="PLDG"/&gt;
 *     &lt;enumeration value="TRPE"/&gt;
 *     &lt;enumeration value="SANC"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisabledReason2Code")
@XmlEnum
public enum DisabledReason2Code {


    /**
     * Account closing is in process.
     * 
     */
    CLOS,

    /**
     * Bankruptcy.
     * 
     */
    BKRP,

    /**
     * Commitment.
     * 
     */
    CMMT,

    /**
     * Confiscation.
     * 
     */
    CNFS,

    /**
     * Reserved in contemplation of death.
     * 
     */
    MORT,

    /**
     * Pending compliance verification.
     * 
     */
    PCOM,

    /**
     * Pledged.
     * 
     */
    PLDG,

    /**
     * Reregistration.
     * 
     */
    TRPE,

    /**
     * Sanctions are in place.
     * 
     */
    SANC,

    /**
     * Transfer.
     * 
     */
    TRAN,

    /**
     * Account was pending opening but is now rejected.
     * 
     */
    REJT;

    public String value() {
        return name();
    }

    public static DisabledReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
