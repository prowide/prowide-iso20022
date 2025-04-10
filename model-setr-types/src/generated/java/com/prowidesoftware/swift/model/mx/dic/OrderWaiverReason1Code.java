
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderWaiverReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderWaiverReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="FEND"/&gt;
 *     &lt;enumeration value="BMIN"/&gt;
 *     &lt;enumeration value="CUTO"/&gt;
 *     &lt;enumeration value="COMW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
