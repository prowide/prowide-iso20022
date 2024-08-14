
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountUsageType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountUsageType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INVE"/>
 *     <enumeration value="ISSP"/>
 *     <enumeration value="SETP"/>
 *     <enumeration value="TRDP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountUsageType2Code")
@XmlEnum
public enum AccountUsageType2Code {


    /**
     * Investor.
     * 
     */
    INVE,

    /**
     * Issuing participant.
     * 
     */
    ISSP,

    /**
     * Settlement participant.
     * 
     */
    SETP,

    /**
     * Trading participant.
     * 
     */
    TRDP;

    public String value() {
        return name();
    }

    public static AccountUsageType2Code fromValue(String v) {
        return valueOf(v);
    }

}
