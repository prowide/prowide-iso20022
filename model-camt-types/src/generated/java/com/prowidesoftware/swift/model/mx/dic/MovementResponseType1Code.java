
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementResponseType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MovementResponseType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FULL"/>
 *     <enumeration value="STTS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MovementResponseType1Code")
@XmlEnum
public enum MovementResponseType1Code {


    /**
     * Response will include full details on the movements reported.
     * 
     */
    FULL,

    /**
     * Response will include limited details including the status on the movements reported.
     * 
     */
    STTS;

    public String value() {
        return name();
    }

    public static MovementResponseType1Code fromValue(String v) {
        return valueOf(v);
    }

}
