
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AGEN"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *     &lt;enumeration value="CURR"/&gt;
 *     &lt;enumeration value="EQUI"/&gt;
 *     &lt;enumeration value="GOVE"/&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="MOMA"/&gt;
 *     &lt;enumeration value="MORT"/&gt;
 *     &lt;enumeration value="MUNI"/&gt;
 *     &lt;enumeration value="FINA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
