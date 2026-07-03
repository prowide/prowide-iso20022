
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TR34Command1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TR34Command1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BIND"/&gt;
 *     &lt;enumeration value="HILR"/&gt;
 *     &lt;enumeration value="HILU"/&gt;
 *     &lt;enumeration value="RBND"/&gt;
 *     &lt;enumeration value="UBND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TR34Command1Code")
@XmlEnum
public enum TR34Command1Code {


    /**
     * TR34 bind operation.
     * 
     */
    BIND,

    /**
     * TR34 Higher Level rebind operation.
     * 
     */
    HILR,

    /**
     * TR34 Higher Level unbind operation.
     * 
     */
    HILU,

    /**
     * TR34 rebind operation.
     * 
     */
    RBND,

    /**
     * TR34 unbind operation.
     * 
     */
    UBND;

    public String value() {
        return name();
    }

    public static TR34Command1Code fromValue(String v) {
        return valueOf(v);
    }

}
