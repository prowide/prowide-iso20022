
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason29Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingReason29Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NPAY"/&gt;
 *     &lt;enumeration value="NSEC"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
