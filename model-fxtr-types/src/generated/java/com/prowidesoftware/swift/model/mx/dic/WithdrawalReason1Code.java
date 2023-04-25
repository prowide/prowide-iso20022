
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WithdrawalReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="WithdrawalReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RJCT"/>
 *     <enumeration value="RSCD"/>
 *     <enumeration value="WTDN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WithdrawalReason1Code")
@XmlEnum
public enum WithdrawalReason1Code {


    /**
     * Alleged trade is rejected.
     * 
     */
    RJCT,

    /**
     * Alleged trade is rescinded.
     * 
     */
    RSCD,

    /**
     * Alleged trade is withdrawn due to an amendment.
     * 
     */
    WTDN;

    public String value() {
        return name();
    }

    public static WithdrawalReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
