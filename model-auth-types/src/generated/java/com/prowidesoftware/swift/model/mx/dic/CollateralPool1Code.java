
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralPool1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralPool1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOPL"/>
 *     <enumeration value="POOL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralPool1Code")
@XmlEnum
public enum CollateralPool1Code {


    /**
     * Collateral is not of pool type.
     * 
     */
    NOPL,

    /**
     * Collateral is of pool type.
     * 
     */
    POOL;

    public String value() {
        return name();
    }

    public static CollateralPool1Code fromValue(String v) {
        return valueOf(v);
    }

}
