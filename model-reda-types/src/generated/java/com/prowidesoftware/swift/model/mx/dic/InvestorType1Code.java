
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestorType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RETL"/&gt;
 *     &lt;enumeration value="PROF"/&gt;
 *     &lt;enumeration value="STAF"/&gt;
 *     &lt;enumeration value="PPER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
