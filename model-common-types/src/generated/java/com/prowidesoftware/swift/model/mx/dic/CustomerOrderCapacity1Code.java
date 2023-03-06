
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerOrderCapacity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerOrderCapacity1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OWNE"/&gt;
 *     &lt;enumeration value="CLAR"/&gt;
 *     &lt;enumeration value="OTHM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerOrderCapacity1Code")
@XmlEnum
public enum CustomerOrderCapacity1Code {


    /**
     * Member trading for their own account.
     * 
     */
    OWNE,

    /**
     * Clearing firm trading for its proprietary account.
     * 
     */
    CLAR,

    /**
     * Member trading for another member.
     * 
     */
    OTHM;

    public String value() {
        return name();
    }

    public static CustomerOrderCapacity1Code fromValue(String v) {
        return valueOf(v);
    }

}
