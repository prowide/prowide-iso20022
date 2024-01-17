
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FloorLimitType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FloorLimitType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRED"/>
 *     <enumeration value="DEBT"/>
 *     <enumeration value="BOTH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FloorLimitType1Code")
@XmlEnum
public enum FloorLimitType1Code {


    /**
     * Floor limit applies to credit entries.
     * 
     */
    CRED,

    /**
     * Floor limit applies to debit entries.
     * 
     */
    DEBT,

    /**
     * Floor limit applies to both credit and debit entries.
     * 
     */
    BOTH;

    public String value() {
        return name();
    }

    public static FloorLimitType1Code fromValue(String v) {
        return valueOf(v);
    }

}
