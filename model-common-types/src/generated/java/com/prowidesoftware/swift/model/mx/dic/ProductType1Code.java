
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGEN"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="CURR"/>
 *     <enumeration value="EQUI"/>
 *     <enumeration value="GOVE"/>
 *     <enumeration value="LOAN"/>
 *     <enumeration value="MOMA"/>
 *     <enumeration value="MORT"/>
 *     <enumeration value="MUNI"/>
 *     <enumeration value="FINA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductType1Code")
@XmlEnum
public enum ProductType1Code {


    /**
     * Identifies categories of instruments issued by federal agencies.
     * 
     */
    AGEN,

    /**
     * Identifies categories of instruments that are commodities.
     * 
     */
    COMM,

    /**
     * Identifies categories of instruments issued by corporates.
     * 
     */
    CORP,

    /**
     * Identifies categories of currency instruments.
     * 
     */
    CURR,

    /**
     * Identifies the nature or type of an equity.
     * 
     */
    EQUI,

    /**
     * Identifies categories of obligations issued by a government.
     * 
     */
    GOVE,

    /**
     * Identifies categories of loans.
     * 
     */
    LOAN,

    /**
     * Identifies categories of short-term debt securities maturing in less than one year.
     * 
     */
    MOMA,

    /**
     * Identifies categories of mortgage securities.
     * 
     */
    MORT,

    /**
     * Identifies categories of securities issued by states and local governments.
     * 
     */
    MUNI,

    /**
     * Identifies categories of financing instruments.
     * 
     */
    FINA;

    public String value() {
        return name();
    }

    public static ProductType1Code fromValue(String v) {
        return valueOf(v);
    }

}
