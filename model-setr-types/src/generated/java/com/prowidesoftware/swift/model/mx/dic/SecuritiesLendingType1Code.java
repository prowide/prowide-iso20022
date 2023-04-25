
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesLendingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesLendingType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NWRG"/>
 *     <enumeration value="RENW"/>
 *     <enumeration value="CABK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesLendingType1Code")
@XmlEnum
public enum SecuritiesLendingType1Code {


    /**
     * Securities lending contract is new and registered.
     * 
     */
    NWRG,

    /**
     * Securities lending contract is renewed.
     * 
     */
    RENW,

    /**
     * Securities lending contract is called back.
     * 
     */
    CABK;

    public String value() {
        return name();
    }

    public static SecuritiesLendingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
