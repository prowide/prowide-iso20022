
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderWaiverReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OrderWaiverReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LATE"/>
 *     <enumeration value="FEND"/>
 *     <enumeration value="BMIN"/>
 *     <enumeration value="CUTO"/>
 *     <enumeration value="COMW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OrderWaiverReason1Code")
@XmlEnum
public enum OrderWaiverReason1Code {


    /**
     * Dealing of the trade is outside the normal limit.
     * 
     */
    LATE,

    /**
     * Front end load charge differs from PPM.
     * 
     */
    FEND,

    /**
     * Amount of subscription is below the minimum initial investment amount.
     * 
     */
    BMIN,

    /**
     * Cut off date has been passed.
     * 
     */
    CUTO,

    /**
     * Standard commission is waived.
     * 
     */
    COMW;

    public String value() {
        return name();
    }

    public static OrderWaiverReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
