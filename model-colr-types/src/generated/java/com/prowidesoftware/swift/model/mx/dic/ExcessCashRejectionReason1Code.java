
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcessCashRejectionReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExcessCashRejectionReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SHRT"/>
 *     <enumeration value="LCKD"/>
 *     <enumeration value="NESI"/>
 *     <enumeration value="MAXE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExcessCashRejectionReason1Code")
@XmlEnum
public enum ExcessCashRejectionReason1Code {


    /**
     * Amount resulted in shortage.
     * 
     */
    SHRT,

    /**
     * Request received after settlement locked.
     * 
     */
    LCKD,

    /**
     * Attempted to remove a non-existent Excess Cash Standing Instruction.
     * 
     */
    NESI,

    /**
     * Maximum allowed excess cash exceeded.
     * 
     */
    MAXE;

    public String value() {
        return name();
    }

    public static ExcessCashRejectionReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
