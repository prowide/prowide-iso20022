
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundingMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RoundingMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DRDW"/>
 *     <enumeration value="DRUP"/>
 *     <enumeration value="NONE"/>
 *     <enumeration value="CLSR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RoundingMethod1Code")
@XmlEnum
public enum RoundingMethod1Code {


    /**
     * Rounds the amount down.
     * 
     */
    DRDW,

    /**
     * Rounds the amount up.
     * 
     */
    DRUP,

    /**
     * Do not round.
     * 
     */
    NONE,

    /**
     * Rounds the amount to the closer integral multiple specified.
     * 
     */
    CLSR;

    public String value() {
        return name();
    }

    public static RoundingMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
