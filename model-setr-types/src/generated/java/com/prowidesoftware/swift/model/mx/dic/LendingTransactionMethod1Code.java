
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LendingTransactionMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LendingTransactionMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ODTR"/>
 *     <enumeration value="EXTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LendingTransactionMethod1Code")
@XmlEnum
public enum LendingTransactionMethod1Code {


    /**
     * Contract applies to a specific security only.
     * 
     */
    ODTR,

    /**
     * Contract applies to a number of different securities within the same pool/fund.
     * 
     */
    EXTR;

    public String value() {
        return name();
    }

    public static LendingTransactionMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
