
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionDestination1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionDestination1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FILE"/&gt;
 *     &lt;enumeration value="MOBL"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PECR"/&gt;
 *     &lt;enumeration value="POFS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
