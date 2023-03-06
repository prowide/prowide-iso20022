
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason20Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason20Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="CASA"/&gt;
 *     &lt;enumeration value="CORR"/&gt;
 *     &lt;enumeration value="STAN"/&gt;
 *     &lt;enumeration value="NOHO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason20Code")
@XmlEnum
public enum RejectionReason20Code {


    /**
     * The validation of the advice/instruction/request failed.
     * 
     */
    FAIL,

    /**
     * Unable to identify cash account.
     * 
     */
    CASA,

    /**
     * Unable to identify correspondent bank.
     * 
     */
    CORR,

    /**
     * Invalid standing instruction type for the specified underlying security.
     * 
     */
    STAN,

    /**
     * No holding for the specified underlying security.
     * 
     */
    NOHO;

    public String value() {
        return name();
    }

    public static RejectionReason20Code fromValue(String v) {
        return valueOf(v);
    }

}
