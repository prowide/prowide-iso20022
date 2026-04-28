
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType11Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesBalanceType11Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AWAS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType11Code__1")
@XmlEnum
public enum SecuritiesBalanceType11Code1 {


    /**
     * Balance of financial instruments that are freely available with no specific additional status.
     * 
     */
    AWAS;

    public String value() {
        return name();
    }

    public static SecuritiesBalanceType11Code1 fromValue(String v) {
        return valueOf(v);
    }

}
