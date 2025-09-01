
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCPMemberType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CCPMemberType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACMB"/&gt;
 *     &lt;enumeration value="CCPX"/&gt;
 *     &lt;enumeration value="DCMB"/&gt;
 *     &lt;enumeration value="FCMC"/&gt;
 *     &lt;enumeration value="GCMB"/&gt;
 *     &lt;enumeration value="SCMB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
