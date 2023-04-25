
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceCounterparty1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BalanceCounterparty1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BILA"/>
 *     <enumeration value="MULT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BalanceCounterparty1Code")
@XmlEnum
public enum BalanceCounterparty1Code {


    /**
     * Balance calculated regarding one member in the system.
     * 
     */
    BILA,

    /**
     * Balance calculated regarding all members in the system.
     * 
     */
    MULT;

    public String value() {
        return name();
    }

    public static BalanceCounterparty1Code fromValue(String v) {
        return valueOf(v);
    }

}
