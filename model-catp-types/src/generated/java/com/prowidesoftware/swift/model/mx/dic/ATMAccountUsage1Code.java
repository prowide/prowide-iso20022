
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMAccountUsage1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMAccountUsage1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOTH"/>
 *     <enumeration value="DSTN"/>
 *     <enumeration value="SRCE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMAccountUsage1Code")
@XmlEnum
public enum ATMAccountUsage1Code {


    /**
     * Can be both the source and the destination account.
     * 
     */
    BOTH,

    /**
     * Destination account.
     * 
     */
    DSTN,

    /**
     * Source account.
     * 
     */
    SRCE;

    public String value() {
        return name();
    }

    public static ATMAccountUsage1Code fromValue(String v) {
        return valueOf(v);
    }

}
