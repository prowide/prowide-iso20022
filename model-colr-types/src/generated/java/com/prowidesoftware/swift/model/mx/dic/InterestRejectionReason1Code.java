
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRejectionReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestRejectionReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VADA"/&gt;
 *     &lt;enumeration value="DIAM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterestRejectionReason1Code")
@XmlEnum
public enum InterestRejectionReason1Code {


    /**
     * Indicates whether the interest request is rejected due a value date difference.
     * 
     */
    VADA,

    /**
     * Indicates whether the interest request is rejected due an interest amount difference.
     * 
     */
    DIAM;

    public String value() {
        return name();
    }

    public static InterestRejectionReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
