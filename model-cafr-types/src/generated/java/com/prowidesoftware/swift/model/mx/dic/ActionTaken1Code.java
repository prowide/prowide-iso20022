
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionTaken1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionTaken1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="WARN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionTaken1Code")
@XmlEnum
public enum ActionTaken1Code {


    /**
     * Reported fraud was accepted
     * 
     */
    ACCP,

    /**
     * Reported fraud led to actions defined at national level.
     * 
     */
    OTHN,

    /**
     * Reported fraud led to actions defined at private level.
     * 
     */
    OTHP,

    /**
     * Reported fraud was rejected.
     * 
     */
    RJCT,

    /**
     * Reported fraud was accepted with warnings.
     * 
     */
    WARN;

    public String value() {
        return name();
    }

    public static ActionTaken1Code fromValue(String v) {
        return valueOf(v);
    }

}
