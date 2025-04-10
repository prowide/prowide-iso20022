
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MatchingStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MACH"/>
 *     <enumeration value="NMAT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MatchingStatus1Code")
@XmlEnum
public enum MatchingStatus1Code {


    /**
     * Instruction has been matched.
     * 
     */
    MACH,

    /**
     * Instruction has not been matched.
     * 
     */
    NMAT;

    public String value() {
        return name();
    }

    public static MatchingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
