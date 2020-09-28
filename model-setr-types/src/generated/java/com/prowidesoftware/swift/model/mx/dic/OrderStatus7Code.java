
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="STNP"/&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus7Code")
@XmlEnum
public enum OrderStatus7Code {


    /**
     * Order is accepted and is ready for execution (execution is the moment when pricing is applied).
     * 
     */
    PACK,

    /**
     * Order has been sent to the next party, eg, the next intermediary.
     * 
     */
    STNP,

    /**
     * Order has been received, ie, technical validation of the message is ok, and the message is now at the receiving side.
     * 
     */
    RECE;

    public String value() {
        return name();
    }

    public static OrderStatus7Code fromValue(String v) {
        return valueOf(v);
    }

}
