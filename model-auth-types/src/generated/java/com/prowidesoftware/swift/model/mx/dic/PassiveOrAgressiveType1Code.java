
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassiveOrAgressiveType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PassiveOrAgressiveType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGRE"/>
 *     <enumeration value="PASV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PassiveOrAgressiveType1Code")
@XmlEnum
public enum PassiveOrAgressiveType1Code {


    /**
     * Order initiated the trade and thus took liquidity.
     * 
     */
    AGRE,

    /**
     * Order was already resting on the order book and providing liquidity.
     * 
     */
    PASV;

    public String value() {
        return name();
    }

    public static PassiveOrAgressiveType1Code fromValue(String v) {
        return valueOf(v);
    }

}
