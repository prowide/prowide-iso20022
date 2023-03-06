
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReversalReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReversalReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSC"/&gt;
 *     &lt;enumeration value="MALF"/&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="UNAB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
