
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemporaryServicesCharge1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TemporaryServicesCharge1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WKND"/&gt;
 *     &lt;enumeration value="REGL"/&gt;
 *     &lt;enumeration value="OVRT"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="ONCL"/&gt;
 *     &lt;enumeration value="NITE"/&gt;
 *     &lt;enumeration value="HOLI"/&gt;
 *     &lt;enumeration value="HAZD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TemporaryServicesCharge1Code")
@XmlEnum
public enum TemporaryServicesCharge1Code {


    /**
     * Weekend
     * 
     */
    WKND,

    /**
     * Regular
     * 
     */
    REGL,

    /**
     * Overtime
     * 
     */
    OVRT,

    /**
     * Other Private
     * 
     */
    OTHP,

    /**
     * Other National
     * 
     */
    OTHN,

    /**
     * On call
     * 
     */
    ONCL,

    /**
     * Night
     * 
     */
    NITE,

    /**
     * Holiday
     * 
     */
    HOLI,

    /**
     * Hazard
     * 
     */
    HAZD;

    public String value() {
        return name();
    }

    public static TemporaryServicesCharge1Code fromValue(String v) {
        return valueOf(v);
    }

}
