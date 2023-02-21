
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason19Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingReason19Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NSEC"/&gt;
 *     &lt;enumeration value="NPAY"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="VLDA"/&gt;
 *     &lt;enumeration value="MCER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PendingReason19Code")
@XmlEnum
public enum PendingReason19Code {


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
    VLDA,

    /**
     * Awaiting receipt of adequate certification.
     * 
     */
    MCER;

    public String value() {
        return name();
    }

    public static PendingReason19Code fromValue(String v) {
        return valueOf(v);
    }

}
