
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResolutionStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResolutionStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="WDRA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
