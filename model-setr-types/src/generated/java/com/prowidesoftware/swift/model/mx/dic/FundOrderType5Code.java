
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOrderType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundOrderType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NSPN"/>
 *     <enumeration value="NCPN"/>
 *     <enumeration value="SWSP"/>
 *     <enumeration value="CWSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundOrderType5Code")
@XmlEnum
public enum FundOrderType5Code {


    /**
     * That part of an investment fund order attributed to a normal staff portion.
     * 
     */
    NSPN,

    /**
     * That part of an investment fund order attributed to a normal client portion.
     * 
     */
    NCPN,

    /**
     * That part of an investment fund order attributed to a staff member with a savings plan.
     * 
     */
    SWSP,

    /**
     * That part of an investment fund order attributed to a client with a savings plan.
     * 
     */
    CWSP;

    public String value() {
        return name();
    }

    public static FundOrderType5Code fromValue(String v) {
        return valueOf(v);
    }

}
