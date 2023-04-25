
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectionMovementType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ElectionMovementType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DRCT"/>
 *     <enumeration value="SEQD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ElectionMovementType2Code")
@XmlEnum
public enum ElectionMovementType2Code {


    /**
     * Direct movement of resource, that is, cash or security that is directly credited to the paying agent account.
     * 
     */
    DRCT,

    /**
     * Election results in a change of balance type that transfers control of the securities rather than the securities themselves.
     * 
     */
    SEQD;

    public String value() {
        return name();
    }

    public static ElectionMovementType2Code fromValue(String v) {
        return valueOf(v);
    }

}
