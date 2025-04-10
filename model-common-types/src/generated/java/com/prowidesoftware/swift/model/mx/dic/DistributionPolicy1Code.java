
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionPolicy1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DistributionPolicy1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DIST"/>
 *     <enumeration value="ACCU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DistributionPolicy1Code")
@XmlEnum
public enum DistributionPolicy1Code {


    /**
     * Income is distributed to the investors in the fund.
     * 
     */
    DIST,

    /**
     * Income is added to the capital of the fund.
     * 
     */
    ACCU;

    public String value() {
        return name();
    }

    public static DistributionPolicy1Code fromValue(String v) {
        return valueOf(v);
    }

}
