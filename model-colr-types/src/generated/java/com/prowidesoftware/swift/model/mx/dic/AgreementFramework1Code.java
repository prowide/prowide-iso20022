
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementFramework1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AgreementFramework1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FBAA"/>
 *     <enumeration value="BBAA"/>
 *     <enumeration value="DERV"/>
 *     <enumeration value="ISDA"/>
 *     <enumeration value="NONR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AgreementFramework1Code")
@XmlEnum
public enum AgreementFramework1Code {


    /**
     * French Banker's Association Agreement.
     * 
     */
    FBAA,

    /**
     * British Banker's Association Agreement.
     * 
     */
    BBAA,

    /**
     * German Rahmenvertrag Agreement.
     * 
     */
    DERV,

    /**
     * International Swaps and Derivatives Association Agreement.
     * 
     */
    ISDA,

    /**
     * No information about the master agreement is available.
     * 
     */
    NONR;

    public String value() {
        return name();
    }

    public static AgreementFramework1Code fromValue(String v) {
        return valueOf(v);
    }

}
