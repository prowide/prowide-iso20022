
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationDistribution2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InformationDistribution2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ELEC"/>
 *     <enumeration value="NONE"/>
 *     <enumeration value="PAPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InformationDistribution2Code")
@XmlEnum
public enum InformationDistribution2Code {


    /**
     * Electronic distribution.
     * 
     */
    ELEC,

    /**
     * No distribution.
     * 
     */
    NONE,

    /**
     * Paper distribution.
     * 
     */
    PAPR;

    public String value() {
        return name();
    }

    public static InformationDistribution2Code fromValue(String v) {
        return valueOf(v);
    }

}
