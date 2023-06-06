
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestorType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RETL"/>
 *     <enumeration value="PROF"/>
 *     <enumeration value="STAF"/>
 *     <enumeration value="PPER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestorType1Code")
@XmlEnum
public enum InvestorType1Code {


    /**
     * Investor is a retail investor.
     * 
     */
    RETL,

    /**
     * Investor is a professional or institutional investor.
     * 
     */
    PROF,

    /**
     * Investor is an employee.
     * 
     */
    STAF,

    /**
     * Investor is a physical person.
     * 
     */
    PPER;

    public String value() {
        return name();
    }

    public static InvestorType1Code fromValue(String v) {
        return valueOf(v);
    }

}
