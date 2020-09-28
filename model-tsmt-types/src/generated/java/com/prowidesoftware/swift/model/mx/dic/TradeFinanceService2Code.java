
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeFinanceService2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeFinanceService2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LEV1"/&gt;
 *     &lt;enumeration value="LEV2"/&gt;
 *     &lt;enumeration value="LEV3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
