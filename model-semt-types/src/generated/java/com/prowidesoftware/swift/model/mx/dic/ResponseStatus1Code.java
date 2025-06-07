
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCP"/&gt;
 *     &lt;enumeration value="ACCT"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="SUBR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
