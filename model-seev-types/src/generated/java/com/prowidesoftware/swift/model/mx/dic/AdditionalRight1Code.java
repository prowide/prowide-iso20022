
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalRight1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalRight1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WQPS"/&gt;
 *     &lt;enumeration value="RSPS"/&gt;
 *     &lt;enumeration value="AIPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdditionalRight1Code")
@XmlEnum
public enum AdditionalRight1Code {


    /**
     * Defines a written question proposal.
     * 
     */
    WQPS,

    /**
     * Defines a resolution proposal.
     * 
     */
    RSPS,

    /**
     * Defines a resolution proposal.
     * 
     */
    AIPS;

    public String value() {
        return name();
    }

    public static AdditionalRight1Code fromValue(String v) {
        return valueOf(v);
    }

}
