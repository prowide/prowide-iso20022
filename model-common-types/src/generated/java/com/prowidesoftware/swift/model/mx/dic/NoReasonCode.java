
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoReasonCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NoReasonCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NORE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NoReasonCode")
@XmlEnum
public enum NoReasonCode {


    /**
     * No reason to report or no reason available to report.
     * 
     */
    NORE;

    public String value() {
        return name();
    }

    public static NoReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
