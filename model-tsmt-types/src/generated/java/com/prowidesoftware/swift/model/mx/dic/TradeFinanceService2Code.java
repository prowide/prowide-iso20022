
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeFinanceService2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeFinanceService2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LEV1"/>
 *     <enumeration value="LEV2"/>
 *     <enumeration value="LEV3"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeFinanceService2Code")
@XmlEnum
public enum TradeFinanceService2Code {


    /**
     * Code for level 1 services.
     * 
     */
    @XmlEnumValue("LEV1")
    LEV_1("LEV1"),

    /**
     * Code for level 2 services.
     * 
     */
    @XmlEnumValue("LEV2")
    LEV_2("LEV2"),

    /**
     * Code for level 3 services.
     * 
     */
    @XmlEnumValue("LEV3")
    LEV_3("LEV3");
    private final String value;

    TradeFinanceService2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TradeFinanceService2Code fromValue(String v) {
        for (TradeFinanceService2Code c: TradeFinanceService2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
