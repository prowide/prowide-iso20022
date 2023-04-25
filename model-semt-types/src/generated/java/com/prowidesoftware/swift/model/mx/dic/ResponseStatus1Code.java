
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResponseStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCP"/>
 *     <enumeration value="ACCT"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="SUBR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResponseStatus1Code")
@XmlEnum
public enum ResponseStatus1Code {


    /**
     * Part of the collateral is accepted, a part rejected.
     * 
     */
    ACCP,

    /**
     * Claim, substitution, proposal is fully accepted.
     * 
     */
    ACCT,

    /**
     * Claim, substitution, proposal is fully rejected.
     * 
     */
    REJT,

    /**
     * Party A agrees with the return part of the substitution and accepts to wait for the proposal of the new collateral.
     * 
     */
    SUBR;

    public String value() {
        return name();
    }

    public static ResponseStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
