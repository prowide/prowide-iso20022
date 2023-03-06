
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResolutionStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResolutionStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="WDRA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResolutionStatus1Code")
@XmlEnum
public enum ResolutionStatus1Code {


    /**
     * Meeting resolution has to be voted for by the participants to a general meeting.
     * 
     */
    ACTV,

    /**
     * Meeting resolution has been withdrawn.
     * 
     */
    WDRA;

    public String value() {
        return name();
    }

    public static ResolutionStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
