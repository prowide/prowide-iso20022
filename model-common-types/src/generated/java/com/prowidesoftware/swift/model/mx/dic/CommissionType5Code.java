
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CommissionType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FEND"/>
 *     <enumeration value="BEND"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CommissionType5Code")
@XmlEnum
public enum CommissionType5Code {


    /**
     * Type of service for which the commission is asked or paid.
     * 
     */
    FEND,

    /**
     * Commission for redeeming an investment, when an investor redeems an investment fund within a certain period of time.
     * 
     */
    BEND,

    /**
     * Commission is another type of transaction.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static CommissionType5Code fromValue(String v) {
        return valueOf(v);
    }

}
