
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationCriteria1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReconciliationCriteria1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BRND"/>
 *     <enumeration value="PROF"/>
 *     <enumeration value="GRUP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReconciliationCriteria1Code")
@XmlEnum
public enum ReconciliationCriteria1Code {


    /**
     * The set is defined by transactions made with cards belonging  to the same brand.
     * 
     */
    BRND,

    /**
     * The set is defined by transactions made with cards sharing the same CardProductProfile.
     * 
     */
    PROF,

    /**
     * The set is defined by transactions processed by POIs identified with the same POIGroup.
     * 
     */
    GRUP;

    public String value() {
        return name();
    }

    public static ReconciliationCriteria1Code fromValue(String v) {
        return valueOf(v);
    }

}
