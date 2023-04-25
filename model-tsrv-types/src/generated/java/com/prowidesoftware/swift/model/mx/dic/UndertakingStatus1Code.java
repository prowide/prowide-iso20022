
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UndertakingStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTC"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="RCVD"/>
 *     <enumeration value="REJT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UndertakingStatus1Code")
@XmlEnum
public enum UndertakingStatus1Code {


    /**
     * Accepted in accordance with technical validation.
     * 
     */
    ACTC,

    /**
     * Pending further processing.
     * 
     */
    PEND,

    /**
     * Received.
     * 
     */
    RCVD,

    /**
     * Rejected.
     * 
     */
    REJT;

    public String value() {
        return name();
    }

    public static UndertakingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
