
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConsentType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CTRM"/>
 *     <enumeration value="DUPY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConsentType1Code")
@XmlEnum
public enum ConsentType1Code {


    /**
     * Change in the terms and conditions of the bond.
     * 
     */
    CTRM,

    /**
     * Change in the due and payable conditions.
     * 
     */
    DUPY;

    public String value() {
        return name();
    }

    public static ConsentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
