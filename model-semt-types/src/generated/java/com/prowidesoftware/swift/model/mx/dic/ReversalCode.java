
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReversalCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReversalCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RVCD"/&gt;
 *     &lt;enumeration value="RVDB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReversalCode")
@XmlEnum
public enum ReversalCode {


    /**
     * Debit entry used to reverse a previously booked credit entry.
     * 
     */
    RVCD,

    /**
     * Credit entry used to reverse a previously booked debit entry.
     * 
     */
    RVDB;

    public String value() {
        return name();
    }

    public static ReversalCode fromValue(String v) {
        return valueOf(v);
    }

}
