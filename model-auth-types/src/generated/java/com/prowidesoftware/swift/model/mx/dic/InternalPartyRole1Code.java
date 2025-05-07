
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternalPartyRole1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InternalPartyRole1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InternalPartyRole1Code")
@XmlEnum
public enum InternalPartyRole1Code {


    /**
     * Party acting as an internal agent.
     * 
     */
    INTC;

    public String value() {
        return name();
    }

    public static InternalPartyRole1Code fromValue(String v) {
        return valueOf(v);
    }

}
