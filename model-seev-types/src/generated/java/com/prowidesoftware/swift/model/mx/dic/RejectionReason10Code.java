
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAIL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason10Code")
@XmlEnum
public enum RejectionReason10Code {


    /**
     * The validation of the advice/instruction/request failed.
     * 
     */
    FAIL;

    public String value() {
        return name();
    }

    public static RejectionReason10Code fromValue(String v) {
        return valueOf(v);
    }

}
