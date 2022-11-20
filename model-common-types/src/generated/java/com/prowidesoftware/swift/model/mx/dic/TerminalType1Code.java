
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminalType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATMT"/&gt;
 *     &lt;enumeration value="MPOS"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="POST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TerminalType1Code")
@XmlEnum
public enum TerminalType1Code {


    /**
     * Automated Teller Machine
     * 
     */
    ATMT,

    /**
     * Mobile or tablet used as a Point of Sale terminal
     * 
     */
    MPOS,

    /**
     * Other type defined at national level
     * 
     */
    OTHN,

    /**
     * Other private type of terminal.
     * 
     */
    OTHP,

    /**
     * Point of Sale terminal.
     * 
     */
    POST;

    public String value() {
        return name();
    }

    public static TerminalType1Code fromValue(String v) {
        return valueOf(v);
    }

}
