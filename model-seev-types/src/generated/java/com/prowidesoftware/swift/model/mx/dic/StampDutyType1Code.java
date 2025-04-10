
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StampDutyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StampDutyType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SDRU"/>
 *     <enumeration value="SDRT"/>
 *     <enumeration value="SDRN"/>
 *     <enumeration value="SDRQ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StampDutyType1Code")
@XmlEnum
public enum StampDutyType1Code {


    /**
     * SDRT paid outside of CSD on corporate action.
     * 
     */
    SDRU,

    /**
     * SDRT paid on another transaction.
     * 
     */
    SDRT,

    /**
     * Stamp duty not applicable.
     * 
     */
    SDRN,

    /**
     * Exempt, for any other reason.
     * 
     */
    SDRQ;

    public String value() {
        return name();
    }

    public static StampDutyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
