
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightCharges1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FreightCharges1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLCT"/&gt;
 *     &lt;enumeration value="PRPD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FreightCharges1Code")
@XmlEnum
public enum FreightCharges1Code {


    /**
     * Freight charges are to collect from consignee.
     * 
     */
    CLCT,

    /**
     * Freight charges are paid by shipper.
     * 
     */
    PRPD;

    public String value() {
        return name();
    }

    public static FreightCharges1Code fromValue(String v) {
        return valueOf(v);
    }

}
