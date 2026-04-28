
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuspendedStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SuspendedStatusReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIC"/&gt;
 *     &lt;enumeration value="FLOW"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SuspendedStatusReason2Code")
@XmlEnum
public enum SuspendedStatusReason2Code {


    /**
     * There is a suspension of pricing. The order will stay on the books until the next pricing.
     * 
     */
    PRIC,

    /**
     * There is a fund overflow.
     * 
     */
    FLOW,

    /**
     * Another reason for the status suspended.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static SuspendedStatusReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
