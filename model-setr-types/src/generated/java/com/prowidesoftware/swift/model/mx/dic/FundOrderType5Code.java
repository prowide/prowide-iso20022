
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOrderType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundOrderType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NSPN"/&gt;
 *     &lt;enumeration value="NCPN"/&gt;
 *     &lt;enumeration value="SWSP"/&gt;
 *     &lt;enumeration value="CWSP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
