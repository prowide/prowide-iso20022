
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationActivityType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReconciliationActivityType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACQG"/>
 *     <enumeration value="CNSD"/>
 *     <enumeration value="ISSG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReconciliationActivityType2Code")
@XmlEnum
public enum ReconciliationActivityType2Code {


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
    ISSG;

    public String value() {
        return name();
    }

    public static ReconciliationActivityType2Code fromValue(String v) {
        return valueOf(v);
    }

}
