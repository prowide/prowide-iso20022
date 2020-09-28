
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlanStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="CLOS"/&gt;
 *     &lt;enumeration value="SUSP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlanStatus1Code")
@XmlEnum
public enum PlanStatus1Code {


    /**
     * Plan is active.
     * 
     */
    ACTV,

    /**
     * Plan is closed.
     * 
     */
    CLOS,

    /**
     * Plan is suspended.
     * 
     */
    SUSP;

    public String value() {
        return name();
    }

    public static PlanStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
