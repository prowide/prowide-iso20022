
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlockedReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BlockedReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BKRP"/&gt;
 *     &lt;enumeration value="CMMT"/&gt;
 *     &lt;enumeration value="CNFS"/&gt;
 *     &lt;enumeration value="MORT"/&gt;
 *     &lt;enumeration value="PLDG"/&gt;
 *     &lt;enumeration value="TRPE"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
