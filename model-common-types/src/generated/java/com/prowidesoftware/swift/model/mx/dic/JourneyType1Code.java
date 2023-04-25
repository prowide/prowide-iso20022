
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="JourneyType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COAC"/>
 *     <enumeration value="EARL"/>
 *     <enumeration value="FLGT"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="ONTM"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="VESS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "JourneyType1Code")
@XmlEnum
public enum JourneyType1Code {


    /**
     * Coach number
     * 
     */
    COAC,

    /**
     * Early arrival or departure
     * 
     */
    EARL,

    /**
     * Flight number.
     * 
     */
    FLGT,

    /**
     * Late arrival or departure.
     * 
     */
    LATE,

    /**
     * On-time arrival or departure
     * 
     */
    ONTM,

    /**
     * Other type of journey.
     * 
     */
    OTHR,

    /**
     * Train number.
     * 
     */
    TRAN,

    /**
     * Vessel number
     * 
     */
    VESS;

    public String value() {
        return name();
    }

    public static JourneyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
