
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionDestination1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActionDestination1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FILE"/>
 *     <enumeration value="MOBL"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PECR"/>
 *     <enumeration value="POFS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActionDestination1Code")
@XmlEnum
public enum ActionDestination1Code {


    /**
     * Data file
     * 
     */
    FILE,

    /**
     * Mobile telephone
     * 
     */
    MOBL,

    /**
     * Other type of destination for action defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of destination for action defined at private level.
     * 
     */
    OTHP,

    /**
     * Personal computer.
     * 
     */
    PECR,

    /**
     * Point of sale terminal.
     * 
     */
    POFS;

    public String value() {
        return name();
    }

    public static ActionDestination1Code fromValue(String v) {
        return valueOf(v);
    }

}
