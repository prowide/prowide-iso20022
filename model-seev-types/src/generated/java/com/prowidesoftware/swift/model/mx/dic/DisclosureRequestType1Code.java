
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisclosureRequestType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DisclosureRequestType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NEWM"/>
 *     <enumeration value="REPL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DisclosureRequestType1Code")
@XmlEnum
public enum DisclosureRequestType1Code {


    /**
     * New disclosure request.
     * 
     */
    NEWM,

    /**
     * Disclosure request replacing a previously sent request.
     * 
     */
    REPL;

    public String value() {
        return name();
    }

    public static DisclosureRequestType1Code fromValue(String v) {
        return valueOf(v);
    }

}
