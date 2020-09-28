
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason18Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason18Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="INHO"/&gt;
 *     &lt;enumeration value="LATT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
