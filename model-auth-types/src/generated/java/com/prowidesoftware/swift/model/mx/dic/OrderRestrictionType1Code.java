
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderRestrictionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderRestrictionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SESR"/&gt;
 *     &lt;enumeration value="VFAR"/&gt;
 *     &lt;enumeration value="VFCR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderRestrictionType1Code")
@XmlEnum
public enum OrderRestrictionType1Code {


    /**
     * Order qualifying for the closing price crossing session. 
     * 
     */
    SESR,

    /**
     * Order being only active and can only be executed at auction phases (which can be pre-defined by the member or, participant of the trading venue who submitted the order, e.g. opening and/closing auctions and/or intraday auction).
     * 
     */
    VFAR,

    /**
     * Order being only active during continuous trading. 
     * 
     */
    VFCR;

    public String value() {
        return name();
    }

    public static OrderRestrictionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
