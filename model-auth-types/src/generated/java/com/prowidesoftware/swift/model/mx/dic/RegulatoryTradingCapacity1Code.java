
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulatoryTradingCapacity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RegulatoryTradingCapacity1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MTCH"/>
 *     <enumeration value="DEAL"/>
 *     <enumeration value="AOTC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RegulatoryTradingCapacity1Code")
@XmlEnum
public enum RegulatoryTradingCapacity1Code {


    /**
     * Transaction was carried out as a matched principal trading.
     * 
     */
    MTCH,

    /**
     * Transaction was carried out as a deal under own account.
     * 
     */
    DEAL,

    /**
     * Transaction was carried out as an agent.
     * 
     */
    AOTC;

    public String value() {
        return name();
    }

    public static RegulatoryTradingCapacity1Code fromValue(String v) {
        return valueOf(v);
    }

}
