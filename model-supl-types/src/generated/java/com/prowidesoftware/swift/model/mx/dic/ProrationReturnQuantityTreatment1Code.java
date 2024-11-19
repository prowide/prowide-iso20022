
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProrationReturnQuantityTreatment1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProrationReturnQuantityTreatment1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPT"/>
 *     <enumeration value="ADJT"/>
 *     <enumeration value="REJT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProrationReturnQuantityTreatment1Code")
@XmlEnum
public enum ProrationReturnQuantityTreatment1Code {


    /**
     * Prorated instructions which result in less than the minimum denominations will be accepted in full.
     * 
     */
    ACPT,

    /**
     * Prorated instructions which result in less than the minimum denominations will be adjusted up.
     * 
     */
    ADJT,

    /**
     * Prorated instructions which result in less than the minimum denominations will be rejected in full.
     * 
     */
    REJT;

    public String value() {
        return name();
    }

    public static ProrationReturnQuantityTreatment1Code fromValue(String v) {
        return valueOf(v);
    }

}
