
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanOwner1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlanOwner1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCP"/&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="ISSR"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlanOwner1Code")
@XmlEnum
public enum PlanOwner1Code {


    /**
     * Plan owner is an acceptor.
     * 
     */
    ACCP,

    /**
     * Plan owner is an acquirer.
     * 
     */
    ACQR,

    /**
     * Plan owner is an issuer.
     * 
     */
    ISSR,

    /**
     * plan owner type is other national.
     * 
     */
    OTHN,

    /**
     * plan owner type is other private.
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static PlanOwner1Code fromValue(String v) {
        return valueOf(v);
    }

}
