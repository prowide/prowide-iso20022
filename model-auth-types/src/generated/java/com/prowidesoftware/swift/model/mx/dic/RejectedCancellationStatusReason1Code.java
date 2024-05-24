
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedCancellationStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectedCancellationStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REFE"/>
 *     <enumeration value="NRGM"/>
 *     <enumeration value="NSLA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectedCancellationStatusReason1Code")
@XmlEnum
public enum RejectedCancellationStatusReason1Code {


    /**
     * Request contains an invalid or unrecognised business reference.
     * 
     */
    REFE,

    /**
     * The cancellation request has been rejected since more than one instruction match to the cancellation criteria.
     * 
     */
    NRGM,

    /**
     * Instruction is not compliant with the service level agreement.
     * 
     */
    NSLA;

    public String value() {
        return name();
    }

    public static RejectedCancellationStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
