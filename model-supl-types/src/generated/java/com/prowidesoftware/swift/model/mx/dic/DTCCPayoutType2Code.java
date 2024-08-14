
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCCPayoutType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCCPayoutType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SECU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCCPayoutType2Code")
@XmlEnum
public enum DTCCPayoutType2Code {


    /**
     * Payout consisting of securities.
     * 
     */
    SECU;

    public String value() {
        return name();
    }

    public static DTCCPayoutType2Code fromValue(String v) {
        return valueOf(v);
    }

}
