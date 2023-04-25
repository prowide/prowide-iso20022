
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCPMemberType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CCPMemberType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACMB"/>
 *     <enumeration value="CCPX"/>
 *     <enumeration value="DCMB"/>
 *     <enumeration value="FCMC"/>
 *     <enumeration value="GCMB"/>
 *     <enumeration value="SCMB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CCPMemberType1Code")
@XmlEnum
public enum CCPMemberType1Code {


    /**
     * Agent Clearing Member.
     * 
     * 
     */
    ACMB,

    /**
     * Clearing House.
     * 
     */
    CCPX,

    /**
     * Direct Clearing Member.
     * 
     * 
     */
    DCMB,

    /**
     * Futures Commission Merchant.
     * 
     * 
     * 
     */
    FCMC,

    /**
     * General Clearing Member.
     * 
     * 
     */
    GCMB,

    /**
     * Sponsored Clearing Member.
     *  
     * 
     */
    SCMB;

    public String value() {
        return name();
    }

    public static CCPMemberType1Code fromValue(String v) {
        return valueOf(v);
    }

}
