
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason18Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason18Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAIL"/>
 *     <enumeration value="INHO"/>
 *     <enumeration value="LATT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason18Code")
@XmlEnum
public enum RejectionReason18Code {


    /**
     * The validation of the advice/instruction/request failed.
     * 
     */
    FAIL,

    /**
     * Insufficient balance.
     * 
     */
    INHO,

    /**
     * Instruction/Request arrives too late.
     * 
     */
    LATT;

    public String value() {
        return name();
    }

    public static RejectionReason18Code fromValue(String v) {
        return valueOf(v);
    }

}
