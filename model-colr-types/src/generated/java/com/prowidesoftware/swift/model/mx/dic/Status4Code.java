
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Status4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REJT"/>
 *     <enumeration value="PACK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
