
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingAccountType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ClearingAccountType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOSA"/>
 *     <enumeration value="ISEG"/>
 *     <enumeration value="HOUS"/>
 *     <enumeration value="GOSA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClearingAccountType3Code")
@XmlEnum
public enum ClearingAccountType3Code {


    /**
     * Specifies that the client positions and assets within the associated position and collateral accounts of the clearing account are operationally and legally commingled while initial margin requirements are calculated on a net basis across all related margining or position accounts.
     * 
     */
    NOSA,

    /**
     * Specifies that customer positions and assets within the associated position and collateral accounts of the clearing account are operationally and legally segregated.
     * 
     */
    ISEG,

    /**
     * Specifies that the account is used to register trades executed for either the clearing member or its subsidiaries.
     * 
     */
    HOUS,

    /**
     * Specifies that client position and assets within the associated position and collateral accounts of the clearing account are operationally and legally commingled, however initial margin requirements are calculated on a gross basis for each related margining account.
     * 
     */
    GOSA;

    public String value() {
        return name();
    }

    public static ClearingAccountType3Code fromValue(String v) {
        return valueOf(v);
    }

}
