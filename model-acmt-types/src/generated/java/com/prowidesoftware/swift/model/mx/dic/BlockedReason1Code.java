
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlockedReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BlockedReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BKRP"/>
 *     <enumeration value="CMMT"/>
 *     <enumeration value="CNFS"/>
 *     <enumeration value="MORT"/>
 *     <enumeration value="PLDG"/>
 *     <enumeration value="TRPE"/>
 *     <enumeration value="TRAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BlockedReason1Code")
@XmlEnum
public enum BlockedReason1Code {


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
     * Transfer.
     * 
     */
    TRAN;

    public String value() {
        return name();
    }

    public static BlockedReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
