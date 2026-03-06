
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementQueryType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementQueryType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INST"/>
 *     <enumeration value="STTS"/>
 *     <enumeration value="STPD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementQueryType1Code")
@XmlEnum
public enum SettlementQueryType1Code {


    /**
     * Queries settlement instructions based on criteria excluding statuses.
     * 
     */
    INST,

    /**
     * Queries settlement instructions based on criteria that includes statuses.
     * 
     */
    STTS,

    /**
     * Queries settlement instructions based on criteria that includes statuses during a period.
     * 
     */
    STPD;

    public String value() {
        return name();
    }

    public static SettlementQueryType1Code fromValue(String v) {
        return valueOf(v);
    }

}
