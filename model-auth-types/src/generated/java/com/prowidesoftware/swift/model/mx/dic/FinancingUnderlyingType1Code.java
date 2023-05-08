
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancingUnderlyingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancingUnderlyingType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CMBS"/>
 *     <enumeration value="CSML"/>
 *     <enumeration value="CCRB"/>
 *     <enumeration value="LESG"/>
 *     <enumeration value="LTCS"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="RMBS"/>
 *     <enumeration value="TDRB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinancingUnderlyingType1Code")
@XmlEnum
public enum FinancingUnderlyingType1Code {


    /**
     * Relates to sub structured type of the financial instrument is a commercial mortgage.
     * 
     */
    CMBS,

    /**
     * Relates to consumer loans.
     * 
     */
    CSML,

    /**
     * Relates to credit card receivables.
     * 
     */
    CCRB,

    /**
     * Relates to leasing.
     * 
     */
    LESG,

    /**
     * Relates to loans to corporates or small or medium-sized enterprises.
     * 
     */
    LTCS,

    /**
     * Other financial instrument type.
     * 
     */
    OTHR,

    /**
     * Relates to sub structured type of the financial instrument is a residential mortgage.
     * 
     */
    RMBS,

    /**
     * Relates to trade receivables.
     * 
     */
    TDRB;

    public String value() {
        return name();
    }

    public static FinancingUnderlyingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
