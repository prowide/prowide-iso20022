
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancelledStatusReason8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancelledStatusReason8Code")
@XmlEnum
public enum CancelledStatusReason8Code {


    /**
     * Transaction is cancelled by a party other than the instructing party, eg, a market infrastructure such as a stock exchange.
     * 
     */
    CANO;

    public String value() {
        return name();
    }

    public static CancelledStatusReason8Code fromValue(String v) {
        return valueOf(v);
    }

}
