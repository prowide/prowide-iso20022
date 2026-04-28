
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyStatus1Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PenaltyStatus1Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="REMO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PenaltyStatus1Code__1")
@XmlEnum
public enum PenaltyStatus1Code1 {


    /**
     * Penalty is active for the party.
     * 
     */
    ACTV,

    /**
     * Removal of a cash penalty where settlement cannot be performed for reasons that are independent from any of the CSD participants or the CSD.
     * 
     */
    REMO;

    public String value() {
        return name();
    }

    public static PenaltyStatus1Code1 fromValue(String v) {
        return valueOf(v);
    }

}
