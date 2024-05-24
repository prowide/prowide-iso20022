
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentNeed2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentNeed2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NSPE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="ISLB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentNeed2Code")
@XmlEnum
public enum InvestmentNeed2Code {


    /**
     * No specific need.
     * 
     */
    NSPE,

    /**
     * Other specific need.
     * 
     */
    OTHR,

    /**
     * Investment need is for Islamic banking.
     * 
     */
    ISLB;

    public String value() {
        return name();
    }

    public static InvestmentNeed2Code fromValue(String v) {
        return valueOf(v);
    }

}
