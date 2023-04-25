
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NSEC"/>
 *     <enumeration value="NPAY"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="AUTH"/>
 *     <enumeration value="VLDA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason4Code")
@XmlEnum
public enum PendingReason4Code {


    /**
     * Financial instruments have not been delivered by the issuer.
     * 
     */
    NSEC,

    /**
     * Payment has not been made by issuer.
     * 
     */
    NPAY,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Tax reclaim has been sent to the tax authorities.
     * 
     */
    AUTH,

    /**
     * For tax reclaim, the event is pending, the tax reclaim is valid for the tax authorities.
     * 
     */
    VLDA;

    public String value() {
        return name();
    }

    public static PendingReason4Code fromValue(String v) {
        return valueOf(v);
    }

}
