
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BalanceStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PDNG"/>
 *     <enumeration value="STLD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BalanceStatus1Code")
@XmlEnum
public enum BalanceStatus1Code {


    /**
     * Balance corresponding to the pending transactions.
     * 
     */
    PDNG,

    /**
     * Final status of a transaction when the associated transfer of cash has been successfully processed.
     * 
     */
    STLD;

    public String value() {
        return name();
    }

    public static BalanceStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
