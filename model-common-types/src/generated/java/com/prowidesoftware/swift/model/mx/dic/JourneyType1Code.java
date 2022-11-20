
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JourneyType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COAC"/&gt;
 *     &lt;enumeration value="EARL"/&gt;
 *     &lt;enumeration value="FLGT"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="ONTM"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="VESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
