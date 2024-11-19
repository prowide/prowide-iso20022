
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountUsageType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountUsageType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INVE"/>
 *     <enumeration value="SETP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountUsageType1Code")
@XmlEnum
public enum AccountUsageType1Code {


    /**
     * Investor.
     * 
     */
    INVE,

    /**
     * Settlement participant.
     * 
     */
    SETP;

    public String value() {
        return name();
    }

    public static AccountUsageType1Code fromValue(String v) {
        return valueOf(v);
    }

}
