
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccountType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashAccountType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LEND"/&gt;
 *     &lt;enumeration value="COLL"/&gt;
 *     &lt;enumeration value="SETT"/&gt;
 *     &lt;enumeration value="MARR"/&gt;
 *     &lt;enumeration value="SEGT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashAccountType5Code")
@XmlEnum
public enum CashAccountType5Code {


    /**
     * Account is for the coverage of lending.
     * 
     */
    LEND,

    /**
     * Account is for collateral.
     * 
     */
    COLL,

    /**
     * Account is for financial settlements.
     * 
     */
    SETT,

    /**
     * Account is for margin returns.
     * 
     */
    MARR,

    /**
     * Account is an segregated account.
     * 
     */
    SEGT;

    public String value() {
        return name();
    }

    public static CashAccountType5Code fromValue(String v) {
        return valueOf(v);
    }

}
