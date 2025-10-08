
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartialSettlement1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartialSettlement1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAIN"/&gt;
 *     &lt;enumeration value="PARC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartialSettlement1Code")
@XmlEnum
public enum PartialSettlement1Code {


    /**
     * Confirmation is for partial settlement. Part of the transaction remains unsettled.
     * 
     */
    PAIN,

    /**
     * Confirmation is for the remaining part of an instruction that was previously partially confirmed.
     * 
     */
    PARC;

    public String value() {
        return name();
    }

    public static PartialSettlement1Code fromValue(String v) {
        return valueOf(v);
    }

}
