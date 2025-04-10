
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScenarioType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ScenarioType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HIST"/>
 *     <enumeration value="HYPT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ScenarioType1Code")
@XmlEnum
public enum ScenarioType1Code {


    /**
     * Scenario that replays an event that occurred in the past, including antithetic historical scenarios.
     * 
     */
    HIST,

    /**
     * Scenario that is defined by a hypothetical or theoretical event that may happen in the future.
     * 
     */
    HYPT;

    public String value() {
        return name();
    }

    public static ScenarioType1Code fromValue(String v) {
        return valueOf(v);
    }

}
