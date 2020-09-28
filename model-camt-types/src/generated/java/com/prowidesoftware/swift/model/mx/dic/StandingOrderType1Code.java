
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingOrderType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandingOrderType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="USTO"/&gt;
 *     &lt;enumeration value="PSTO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandingOrderType1Code")
@XmlEnum
public enum StandingOrderType1Code {


    /**
     * Liquidity transfer standing order type, that has been customised or defined to the specific need of the user.
     * 
     */
    USTO,

    /**
     * Liquidity transfer standing order type, as predefined in the system.
     * 
     */
    PSTO;

    public String value() {
        return name();
    }

    public static StandingOrderType1Code fromValue(String v) {
        return valueOf(v);
    }

}
