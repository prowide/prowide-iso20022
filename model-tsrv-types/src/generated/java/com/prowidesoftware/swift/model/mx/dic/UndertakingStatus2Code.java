
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UndertakingStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCP"/>
 *     <enumeration value="REJT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UndertakingStatus2Code")
@XmlEnum
public enum UndertakingStatus2Code {


    /**
     * Accepted.
     * 
     */
    ACCP,

    /**
     * Rejected.
     * 
     */
    REJT;

    public String value() {
        return name();
    }

    public static UndertakingStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
