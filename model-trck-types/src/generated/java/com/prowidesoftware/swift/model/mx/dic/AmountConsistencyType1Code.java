
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountConsistencyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AmountConsistencyType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONS"/>
 *     <enumeration value="ICNS"/>
 *     <enumeration value="ICGA"/>
 *     <enumeration value="ICFA"/>
 *     <enumeration value="IISA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AmountConsistencyType1Code")
@XmlEnum
public enum AmountConsistencyType1Code {


    /**
     * Amount information matches the reference data record.
     * 
     */
    CONS,

    /**
     * Amount information does not match the reference data record.
     * 
     */
    ICNS,

    /**
     * Charges amount information does not match the reference data record.
     * 
     */
    ICGA,

    /**
     * Amount information confirmed to the creditor does not match the reference data record.
     * 
     */
    ICFA,

    /**
     * Interbank settlement amount information does not match the reference data record.
     * 
     */
    IISA;

    public String value() {
        return name();
    }

    public static AmountConsistencyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
