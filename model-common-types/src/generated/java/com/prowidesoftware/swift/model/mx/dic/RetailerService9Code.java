
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetailerService9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DDYP"/&gt;
 *     &lt;enumeration value="DINP"/&gt;
 *     &lt;enumeration value="DPRP"/&gt;
 *     &lt;enumeration value="DSOP"/&gt;
 *     &lt;enumeration value="DSIP"/&gt;
 *     &lt;enumeration value="DCIP"/&gt;
 *     &lt;enumeration value="DCAP"/&gt;
 *     &lt;enumeration value="DCPP"/&gt;
 *     &lt;enumeration value="DCOP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetailerService9Code")
@XmlEnum
public enum RetailerService9Code {


    /**
     * One system responds to the other system for a display request.
     * 
     */
    DDYP,

    /**
     * One system responds to the other System for a input request.
     * 
     */
    DINP,

    /**
     * One system responds to the other System for a print request.
     * 
     */
    DPRP,

    /**
     * One system responds to the other System for a play sound request.
     * 
     */
    DSOP,

    /**
     * One system responds to the other System for secure data input.
     * 
     */
    DSIP,

    /**
     * The POI system responds to the Sale System for a card reader initialisation.
     * 
     */
    DCIP,

    /**
     * The POI system responds to the Sale System for a card reader Application Protocol Data Unit sending.
     * 
     */
    DCAP,

    /**
     * The POI system responds to the Sale System for a card reader power off.
     * 
     */
    DCPP,

    /**
     * The POI system responds to the Sale System after a message transmission.
     * 
     */
    DCOP;

    public String value() {
        return name();
    }

    public static RetailerService9Code fromValue(String v) {
        return valueOf(v);
    }

}
