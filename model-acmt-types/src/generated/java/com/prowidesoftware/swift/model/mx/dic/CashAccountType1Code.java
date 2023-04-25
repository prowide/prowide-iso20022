
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CashAccountType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SACC"/>
 *     <enumeration value="CACC"/>
 *     <enumeration value="SVGS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CashAccountType1Code")
@XmlEnum
public enum CashAccountType1Code {


    /**
     * Account used to post debit and credit entries, as a result of transactions cleared and settled through a specific clearing and settlement system.
     * 
     */
    SACC,

    /**
     * Account used to post debits and credits when no specific account has been nominated.
     * 
     */
    CACC,

    /**
     * Account used for savings.
     * 
     */
    SVGS;

    public String value() {
        return name();
    }

    public static CashAccountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
