
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingOrderType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StandingOrderType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="USTO"/>
 *     <enumeration value="PSTO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
