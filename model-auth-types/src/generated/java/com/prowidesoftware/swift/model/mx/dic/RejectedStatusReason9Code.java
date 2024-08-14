
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedStatusReason9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectedStatusReason9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DSEC"/>
 *     <enumeration value="IDNA"/>
 *     <enumeration value="ORRF"/>
 *     <enumeration value="NSLA"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="DTRD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectedStatusReason9Code")
@XmlEnum
public enum RejectedStatusReason9Code {


    /**
     * Identification of the security is not recognised or is invalid.
     * 
     */
    DSEC,

    /**
     * Identification of the security and the security name are not the same.
     * 
     */
    IDNA,

    /**
     * Order reference is a duplicate of a previously received order.
     * 
     */
    ORRF,

    /**
     * Instruction is not compliant with the service level agreement.
     * 
     */
    NSLA,

    /**
     * Financial instrument quantity is invalid.
     * 
     */
    DQUA,

    /**
     * Unrecognised or invalid Settlement Amount Currency.
     * 
     */
    NCRR,

    /**
     * Unrecognised or invalid Place of Trade.
     * 
     */
    PLCE,

    /**
     * Unrecognised or invalid trade date or requested trade date or future trade date.
     * 
     */
    DTRD;

    public String value() {
        return name();
    }

    public static RejectedStatusReason9Code fromValue(String v) {
        return valueOf(v);
    }

}
