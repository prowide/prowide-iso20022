
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassiveOrAgressiveType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassiveOrAgressiveType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AGRE"/&gt;
 *     &lt;enumeration value="PASV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
