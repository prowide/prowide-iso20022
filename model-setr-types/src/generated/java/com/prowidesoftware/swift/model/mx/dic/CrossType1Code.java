
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CrossType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALON"/&gt;
 *     &lt;enumeration value="IMOC"/&gt;
 *     &lt;enumeration value="ONSI"/&gt;
 *     &lt;enumeration value="SAPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CrossType1Code")
@XmlEnum
public enum CrossType1Code {


    /**
     * Cross All or None - Cross trade that is executed completely or not. Both sides are treated in the same manner. This is equivalent to Fill or Kill type behavior, where the cross order meets the crossing criteria  within the market and is executed or it is rejected.
     * 
     */
    ALON,

    /**
     * Cross trade that is executed partially and the rest is canceled. One side is fully executed, the other side is partially executed with the remainder being canceled. This is equivalent to an Immediate or Cancel on the other side. Note: The CrossPrioritization field is used to indicate which side should fully execute in this scenario.
     * 
     */
    IMOC,

    /**
     * Cross trade that is partially executed with the unfilled portions remaining active. One side of the cross is fully executed (the side that was prioritised) but the unfilled portion remains active.
     * 
     */
    ONSI,

    /**
     * Cross trade is executed with existing orders with the same price. In the case other orders exist with the same price, the quantity of the Cross is executed against the existing orders and quotes, the remainder of the cross is executed against the other side of the cross.The two sides potentially have different quantities.
     * 
     */
    SAPR;

    public String value() {
        return name();
    }

    public static CrossType1Code fromValue(String v) {
        return valueOf(v);
    }

}
