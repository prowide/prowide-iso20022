
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanOwner2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PlanOwner2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCP"/>
 *     <enumeration value="ACQR"/>
 *     <enumeration value="ISSR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PlanOwner2Code")
@XmlEnum
public enum PlanOwner2Code {


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
    ISSR;

    public String value() {
        return name();
    }

    public static PlanOwner2Code fromValue(String v) {
        return valueOf(v);
    }

}
