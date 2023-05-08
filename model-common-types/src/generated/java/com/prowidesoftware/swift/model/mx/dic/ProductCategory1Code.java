
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCategory1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductCategory1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HRTR"/>
 *     <enumeration value="QOTA"/>
 *     <enumeration value="PRGP"/>
 *     <enumeration value="LOBU"/>
 *     <enumeration value="GNDR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductCategory1Code")
@XmlEnum
public enum ProductCategory1Code {


    /**
     * Classification of goods as developed by the Customs Cooperation council.
     * 
     */
    HRTR,

    /**
     * Product identifier used by the retail industry.
     * 
     */
    QOTA,

    /**
     * Product Group Code.
     * 
     */
    PRGP,

    /**
     * Line of business code.
     * 
     */
    LOBU,

    /**
     * Code for gender.
     * 
     */
    GNDR;

    public String value() {
        return name();
    }

    public static ProductCategory1Code fromValue(String v) {
        return valueOf(v);
    }

}
