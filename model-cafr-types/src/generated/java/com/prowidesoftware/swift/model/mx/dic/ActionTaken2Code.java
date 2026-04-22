
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionTaken2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActionTaken2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCP"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="WARN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActionTaken2Code")
@XmlEnum
public enum ActionTaken2Code {


    /**
     * Reported fraud was accepted
     * 
     */
    ACCP,

    /**
     * Reported fraud was rejected.
     * 
     */
    RJCT,

    /**
     * Reported fraud was accepted with warnings.
     * 
     */
    WARN;

    public String value() {
        return name();
    }

    public static ActionTaken2Code fromValue(String v) {
        return valueOf(v);
    }

}
