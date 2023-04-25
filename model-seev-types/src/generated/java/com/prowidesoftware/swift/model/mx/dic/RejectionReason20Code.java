
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason20Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason20Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAIL"/>
 *     <enumeration value="CASA"/>
 *     <enumeration value="CORR"/>
 *     <enumeration value="STAN"/>
 *     <enumeration value="NOHO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
