
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectionMovementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ElectionMovementType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REST"/>
 *     <enumeration value="DRCT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ElectionMovementType1Code")
@XmlEnum
public enum ElectionMovementType1Code {


    /**
     * Election results in a change of balance type that transfers control of the securities rather than the securities themselves.
     * 
     */
    REST,

    /**
     * Direct movement of resource, that is, cash or security that is directly credited to the paying agent account.
     * 
     */
    DRCT;

    public String value() {
        return name();
    }

    public static ElectionMovementType1Code fromValue(String v) {
        return valueOf(v);
    }

}
