
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralAccountType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralAccountType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MGIN"/>
 *     <enumeration value="DFLT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralAccountType3Code")
@XmlEnum
public enum CollateralAccountType3Code {


    /**
     * Specifies that the account is used to post collateral that covers the exposure resulting from trades executed for either the clearing member or its subsidiaries, or for the clearing member's customers.
     * 
     */
    MGIN,

    /**
     * Specifies that the account is used to post collateral that covers clearing member's default risk.
     * 
     */
    DFLT;

    public String value() {
        return name();
    }

    public static CollateralAccountType3Code fromValue(String v) {
        return valueOf(v);
    }

}
