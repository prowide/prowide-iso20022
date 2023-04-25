
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceTransferWindow1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BalanceTransferWindow1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DAYH"/>
 *     <enumeration value="EARL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BalanceTransferWindow1Code")
@XmlEnum
public enum BalanceTransferWindow1Code {


    /**
     * Indicates in business hours processing.
     * 
     */
    DAYH,

    /**
     * Indicates out of business hours processing.
     * 
     */
    EARL;

    public String value() {
        return name();
    }

    public static BalanceTransferWindow1Code fromValue(String v) {
        return valueOf(v);
    }

}
