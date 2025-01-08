
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionRight1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionRight1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXER"/>
 *     <enumeration value="ASGN"/>
 *     <enumeration value="RENO"/>
 *     <enumeration value="EXPI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionRight1Code")
@XmlEnum
public enum OptionRight1Code {


    /**
     * Exercise option right.
     * 
     */
    EXER,

    /**
     * Option right assignment.
     * 
     */
    ASGN,

    /**
     * The option right is renounced.
     * 
     */
    RENO,

    /**
     * Option right expires.
     * 
     */
    EXPI;

    public String value() {
        return name();
    }

    public static OptionRight1Code fromValue(String v) {
        return valueOf(v);
    }

}
