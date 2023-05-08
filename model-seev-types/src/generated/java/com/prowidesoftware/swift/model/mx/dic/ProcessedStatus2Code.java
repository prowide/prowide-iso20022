
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessedStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProcessedStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RECE"/>
 *     <enumeration value="COMP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProcessedStatus2Code")
@XmlEnum
public enum ProcessedStatus2Code {


    /**
     * The instruction/request has been received.
     * 
     */
    RECE,

    /**
     * The request has been completed.
     * 
     */
    COMP;

    public String value() {
        return name();
    }

    public static ProcessedStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
