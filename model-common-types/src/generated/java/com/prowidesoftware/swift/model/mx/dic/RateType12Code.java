
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateType12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="NILP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateType12Code")
@XmlEnum
public enum RateType12Code {


    /**
     * Rate has not been established.
     * 
     */
    OPEN,

    /**
     * Rate is unknown by the sender or has not been established.
     * 
     */
    UKWN,

    /**
     * Rate will not be paid.
     * 
     */
    NILP;

    public String value() {
        return name();
    }

    public static RateType12Code fromValue(String v) {
        return valueOf(v);
    }

}
