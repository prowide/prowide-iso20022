
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="COSE"/&gt;
 *     &lt;enumeration value="STNP"/&gt;
 *     &lt;enumeration value="CPNP"/&gt;
 *     &lt;enumeration value="SETT"/&gt;
 *     &lt;enumeration value="CSNE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus5Code")
@XmlEnum
public enum OrderStatus5Code {


    /**
     * Order has been received, ie, technical validation of the message is ok, and the message is now at the receiving side.
     * 
     */
    RECE,

    /**
     * Order is accepted and is ready for execution (execution is the moment when pricing is applied).
     * 
     */
    PACK,

    /**
     * Order is already executed and confirmation has been sent.
     * 
     */
    COSE,

    /**
     * Order has been sent to the next party, eg, the next intermediary.
     * 
     */
    STNP,

    /**
     * Communication problems with the next party.
     * 
     */
    CPNP,

    /**
     * Order is settled. The cash is credited or debited.
     * 
     */
    SETT,

    /**
     * Order is accepted and is ready for execution (execution is the moment when pricing is applied). Cash is settled, but the order is not executed.
     * 
     */
    CSNE;

    public String value() {
        return name();
    }

    public static OrderStatus5Code fromValue(String v) {
        return valueOf(v);
    }

}
