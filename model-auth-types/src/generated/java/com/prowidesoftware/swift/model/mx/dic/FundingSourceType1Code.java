
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundingSourceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundingSourceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SECL"/>
 *     <enumeration value="FREE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="BSHS"/>
 *     <enumeration value="CSHS"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="UBOR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundingSourceType1Code")
@XmlEnum
public enum FundingSourceType1Code {


    /**
     * Type of a funding source is cash collateral from securities lending. 
     * 
     */
    SECL,

    /**
     * Type of a funding source is free credits. 
     * 
     */
    FREE,

    /**
     * Other type of a funding source.
     * 
     */
    OTHR,

    /**
     * Type of a funding source is proceeds from broker short sales. 
     * 
     */
    BSHS,

    /**
     * Type of a funding source is proceeds from customer short sales. 
     * 
     */
    CSHS,

    /**
     * Type of a funding source is repo or buy sell back.
     * 
     */
    REPO,

    /**
     * Type of a funding source is unsecured borrowing. 
     * 
     */
    UBOR;

    public String value() {
        return name();
    }

    public static FundingSourceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
