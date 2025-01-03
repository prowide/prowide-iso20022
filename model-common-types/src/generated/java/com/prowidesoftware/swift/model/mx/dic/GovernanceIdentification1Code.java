
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GovernanceIdentification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GovernanceIdentification1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ISPR"/>
 *     <enumeration value="NONE"/>
 *     <enumeration value="UCPR"/>
 *     <enumeration value="URDG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GovernanceIdentification1Code")
@XmlEnum
public enum GovernanceIdentification1Code {


    /**
     * The version of the International Standby Practices (ISP) that is in effect on the date of issue of the undertaking.
     * 
     */
    ISPR,

    /**
     * No applicable rule set defined.
     * 
     */
    NONE,

    /**
     * The version of the Uniform Customs and Practice for Documentary Credits (UCP) as published by the International Chamber of Commerce (ICC) that is in effect on the date of issue of the undertaking.
     * 
     */
    UCPR,

    /**
     * The version of the ICC Uniform Rules For Demand Guarantees (URDG) as published by the International Chamber of Commerce (ICC) that is in effect on the date of issue of the undertaking.
     * 
     */
    URDG;

    public String value() {
        return name();
    }

    public static GovernanceIdentification1Code fromValue(String v) {
        return valueOf(v);
    }

}
