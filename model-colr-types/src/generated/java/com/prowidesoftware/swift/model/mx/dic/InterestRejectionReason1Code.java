
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRejectionReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InterestRejectionReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VADA"/>
 *     <enumeration value="DIAM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
