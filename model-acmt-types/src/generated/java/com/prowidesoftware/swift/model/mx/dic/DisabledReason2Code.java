
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisabledReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DisabledReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLOS"/>
 *     <enumeration value="BKRP"/>
 *     <enumeration value="CMMT"/>
 *     <enumeration value="CNFS"/>
 *     <enumeration value="MORT"/>
 *     <enumeration value="PCOM"/>
 *     <enumeration value="PLDG"/>
 *     <enumeration value="TRPE"/>
 *     <enumeration value="SANC"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="REJT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
