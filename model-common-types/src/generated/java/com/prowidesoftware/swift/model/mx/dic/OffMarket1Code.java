
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffMarket1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OffMarket1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="XOFF"/>
 *     <enumeration value="XXXX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OffMarket1Code")
@XmlEnum
public enum OffMarket1Code {


    /**
     * Trade was executed off-market.
     * 
     */
    XOFF,

    /**
     * Trade was executed off-exchange because the instrument is not admitted to trade on an exchange.
     * 
     */
    XXXX;

    public String value() {
        return name();
    }

    public static OffMarket1Code fromValue(String v) {
        return valueOf(v);
    }

}
