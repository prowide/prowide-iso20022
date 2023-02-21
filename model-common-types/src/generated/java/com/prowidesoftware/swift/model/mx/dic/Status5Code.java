
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="PDNG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status5Code")
@XmlEnum
public enum Status5Code {


    /**
     * Instruction has been rejected.
     * 
     */
    REJT,

    /**
     * Instruction has been accepted and is validated for further processing.
     * 
     */
    PACK,

    /**
     * Instruction is pending.
     * 
     */
    PDNG;

    public String value() {
        return name();
    }

    public static Status5Code fromValue(String v) {
        return valueOf(v);
    }

}
