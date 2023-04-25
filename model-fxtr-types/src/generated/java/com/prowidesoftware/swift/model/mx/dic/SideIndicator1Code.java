
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SideIndicator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SideIndicator1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CCPL"/>
 *     <enumeration value="CLNT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SideIndicator1Code")
@XmlEnum
public enum SideIndicator1Code {


    /**
     * Clearing broker identification is for the Central Counterparty (CCP) leg.
     * 
     */
    CCPL,

    /**
     * Clearing broker identification is for the client leg.
     * 
     */
    CLNT;

    public String value() {
        return name();
    }

    public static SideIndicator1Code fromValue(String v) {
        return valueOf(v);
    }

}
