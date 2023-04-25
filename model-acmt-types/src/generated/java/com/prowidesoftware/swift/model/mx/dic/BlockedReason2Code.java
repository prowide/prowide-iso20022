
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlockedReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BlockedReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BKRP"/>
 *     <enumeration value="CMMT"/>
 *     <enumeration value="CNFS"/>
 *     <enumeration value="MORT"/>
 *     <enumeration value="PCOM"/>
 *     <enumeration value="PLDG"/>
 *     <enumeration value="TRPE"/>
 *     <enumeration value="SANC"/>
 *     <enumeration value="TRAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BlockedReason2Code")
@XmlEnum
public enum BlockedReason2Code {


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
    TRAN;

    public String value() {
        return name();
    }

    public static BlockedReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
