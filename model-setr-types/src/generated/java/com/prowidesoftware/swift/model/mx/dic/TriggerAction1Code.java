
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerAction1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTI"/&gt;
 *     &lt;enumeration value="MODI"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TriggerAction1Code")
@XmlEnum
public enum TriggerAction1Code {


    /**
     * Trigger action is activate.
     * 
     */
    ACTI,

    /**
     * Trigger action is modify.
     * 
     */
    MODI,

    /**
     * Trigger action is cancel.
     * 
     */
    CANC;

    public String value() {
        return name();
    }

    public static TriggerAction1Code fromValue(String v) {
        return valueOf(v);
    }

}
