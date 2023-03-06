
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationActivityType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReconciliationActivityType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQG"/&gt;
 *     &lt;enumeration value="CNSD"/&gt;
 *     &lt;enumeration value="ISSG"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
