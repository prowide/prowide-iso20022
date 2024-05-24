
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesTransactionType11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NSYN"/>
 *     <enumeration value="SYND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesTransactionType11Code")
@XmlEnum
public enum SecuritiesTransactionType11Code {


    /**
     * Relates to the issue of medium and short term paper (CP, CD, MTN, notes.) under a program and without syndication arrangement.
     * 
     */
    NSYN,

    /**
     * Relates to the issue of financial instruments through a syndicate of underwriters and a lead manager.
     * 
     */
    SYND;

    public String value() {
        return name();
    }

    public static SecuritiesTransactionType11Code fromValue(String v) {
        return valueOf(v);
    }

}
