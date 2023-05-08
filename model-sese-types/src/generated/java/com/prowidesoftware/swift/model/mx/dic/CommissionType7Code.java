
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CommissionType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FEND"/>
 *     <enumeration value="BEND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CommissionType7Code")
@XmlEnum
public enum CommissionType7Code {


    /**
     * Commission for subscribing to an investment, paid at the time of the subscription.
     * 
     */
    FEND,

    /**
     * Commission for redeeming an investment, when an investor redeems an investment fund within a certain period of time.
     * 
     */
    BEND;

    public String value() {
        return name();
    }

    public static CommissionType7Code fromValue(String v) {
        return valueOf(v);
    }

}
