
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyType15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PGRP"/>
 *     <enumeration value="PSYS"/>
 *     <enumeration value="PSNG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyType15Code")
@XmlEnum
public enum PartyType15Code {


    /**
     * Configuration to apply to a subset of the whole POI system.
     * 
     */
    PGRP,

    /**
     * Configuration to apply to the whole POI system.
     * 
     */
    PSYS,

    /**
     * Configuration to apply to a single POI terminal.
     * 
     */
    PSNG;

    public String value() {
        return name();
    }

    public static PartyType15Code fromValue(String v) {
        return valueOf(v);
    }

}
