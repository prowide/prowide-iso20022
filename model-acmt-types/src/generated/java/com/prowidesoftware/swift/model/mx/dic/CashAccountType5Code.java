
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccountType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CashAccountType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LEND"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="SETT"/>
 *     <enumeration value="MARR"/>
 *     <enumeration value="SEGT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
