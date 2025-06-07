
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelledStatusReason15Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANI"/&gt;
 *     &lt;enumeration value="CSUB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancelledStatusReason15Code")
@XmlEnum
public enum CancelledStatusReason15Code {


    /**
     * Transaction is cancelled by yourself.
     * 
     */
    CANI,

    /**
     * Instruction has been cancelled by the agent due to an event deadline extension.
     * 
     */
    CSUB;

    public String value() {
        return name();
    }

    public static CancelledStatusReason15Code fromValue(String v) {
        return valueOf(v);
    }

}
