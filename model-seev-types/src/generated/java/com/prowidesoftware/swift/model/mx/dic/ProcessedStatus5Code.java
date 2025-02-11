
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessedStatus5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProcessedStatus5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RECE"/>
 *     <enumeration value="PACK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProcessedStatus5Code")
@XmlEnum
public enum ProcessedStatus5Code {


    /**
     * The instruction/request has been received.
     * 
     */
    RECE,

    /**
     * The request is accepted.
     * 
     */
    PACK;

    public String value() {
        return name();
    }

    public static ProcessedStatus5Code fromValue(String v) {
        return valueOf(v);
    }

}
