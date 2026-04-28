
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GovernanceIdentification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GovernanceIdentification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ISPR"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="UCPR"/&gt;
 *     &lt;enumeration value="URDG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
