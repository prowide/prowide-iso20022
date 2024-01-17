
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConsolidationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GENL"/>
 *     <enumeration value="PART"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConsolidationType1Code")
@XmlEnum
public enum ConsolidationType1Code {


    /**
     * Consolidation is general.
     * 
     */
    GENL,

    /**
     * Consolidation is at the level of the participant.
     * 
     */
    PART;

    public String value() {
        return name();
    }

    public static ConsolidationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
