
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalBusinessProcess1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdditionalBusinessProcess1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACLA"/>
 *     <enumeration value="ATXF"/>
 *     <enumeration value="CNTR"/>
 *     <enumeration value="NAMC"/>
 *     <enumeration value="NPLE"/>
 *     <enumeration value="SCHM"/>
 *     <enumeration value="CONS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdditionalBusinessProcess1Code")
@XmlEnum
public enum AdditionalBusinessProcess1Code {


    /**
     * Will automatically give rise to market claims by the account servicer, for example, a Central Securities Depository (CSD).
     * 
     */
    ACLA,

    /**
     * As a result of the corporate action, all transactions in the underlying security will be cancelled by the system and replaced with transactions in the outturn resource(s).
     * 
     */
    ATXF,

    /**
     * As a result of the corporate action, all transactions in the underlying security will be cancelled by the system.
     * 
     */
    CNTR,

    /**
     * Event will not automatically give rise to market claims and transformations by the account servicer, for example, a Central Securities Depository (CSD).
     * 
     */
    NAMC,

    /**
     * Issuer only allows a single option to be selected per designated holding.
     * 
     */
    NPLE,

    /**
     * Component event of a scheme/plan of arrangement: a reorganisation of a company or a group of companies, and their capital.
     * 
     */
    SCHM,

    /**
     * Relates to a consent within a corporate action event other than a Consent event (: 22F:: CAEV//CONS).
     * 
     */
    CONS;

    public String value() {
        return name();
    }

    public static AdditionalBusinessProcess1Code fromValue(String v) {
        return valueOf(v);
    }

}
