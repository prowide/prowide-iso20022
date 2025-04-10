
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReversalReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReversalReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CUSC"/>
 *     <enumeration value="MALF"/>
 *     <enumeration value="MERC"/>
 *     <enumeration value="UNAB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReversalReason1Code")
@XmlEnum
public enum ReversalReason1Code {


    /**
     * Customer cancels the transaction.
     * 
     */
    CUSC,

    /**
     * Reversal after a suspection of malfunction of the POI system.
     * 
     */
    MALF,

    /**
     * Merchant or Cashier cancels the transaction.
     * 
     */
    MERC,

    /**
     * POI System unable to complete transaction.
     * 
     */
    UNAB;

    public String value() {
        return name();
    }

    public static ReversalReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
