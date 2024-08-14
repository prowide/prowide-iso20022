
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReversalCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReversalCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RVCD"/>
 *     <enumeration value="RVDB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
