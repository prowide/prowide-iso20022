
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionRight1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionRight1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXER"/&gt;
 *     &lt;enumeration value="ASGN"/&gt;
 *     &lt;enumeration value="RENO"/&gt;
 *     &lt;enumeration value="EXPI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
