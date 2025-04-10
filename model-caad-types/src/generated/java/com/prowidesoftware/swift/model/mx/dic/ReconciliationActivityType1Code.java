
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationActivityType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReconciliationActivityType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACQG"/>
 *     <enumeration value="CNSD"/>
 *     <enumeration value="ISSG"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReconciliationActivityType1Code")
@XmlEnum
public enum ReconciliationActivityType1Code {


    /**
     * Acquiring activity.
     * 
     */
    ACQG,

    /**
     * All types of activity.
     * 
     */
    CNSD,

    /**
     * Issuing activity
     * 
     */
    ISSG,

    /**
     * Other reconciliation activity type defined at national level
     * 
     */
    OTHN,

    /**
     * Other reconciliation activity type defined at private level 
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static ReconciliationActivityType1Code fromValue(String v) {
        return valueOf(v);
    }

}
