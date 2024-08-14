
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DepositType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FITE"/>
 *     <enumeration value="CALL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DepositType1Code")
@XmlEnum
public enum DepositType1Code {


    /**
     * Specifies that it is a fixed term deposit.
     * 
     */
    FITE,

    /**
     * Specifies that it is a call/notice deposit.
     * 
     */
    CALL;

    public String value() {
        return name();
    }

    public static DepositType1Code fromValue(String v) {
        return valueOf(v);
    }

}
