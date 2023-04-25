
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RetailerService9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DDYP"/>
 *     <enumeration value="DINP"/>
 *     <enumeration value="DPRP"/>
 *     <enumeration value="DSOP"/>
 *     <enumeration value="DSIP"/>
 *     <enumeration value="DCIP"/>
 *     <enumeration value="DCAP"/>
 *     <enumeration value="DCPP"/>
 *     <enumeration value="DCOP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
