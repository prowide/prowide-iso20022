
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason29Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason29Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NPAY"/>
 *     <enumeration value="NSEC"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="AUTH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason29Code")
@XmlEnum
public enum PendingReason29Code {


    /**
     * Payment has not been made by issuer.
     * 
     */
    NPAY,

    /**
     * Financial instruments have not been delivered by the issuer.
     * 
     */
    NSEC,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Instruction/event is pending because the reclaim is sent to the tax authorities.
     * 
     */
    AUTH;

    public String value() {
        return name();
    }

    public static PendingReason29Code fromValue(String v) {
        return valueOf(v);
    }

}
