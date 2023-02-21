
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status4Code")
@XmlEnum
public enum Status4Code {


    /**
     * Instruction has been rejected.
     * 
     */
    REJT,

    /**
     * Instruction has been accepted and is validated for further processing.
     * 
     */
    PACK;

    public String value() {
        return name();
    }

    public static Status4Code fromValue(String v) {
        return valueOf(v);
    }

}
