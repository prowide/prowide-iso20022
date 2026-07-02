
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCategory1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductCategory1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HRTR"/&gt;
 *     &lt;enumeration value="QOTA"/&gt;
 *     &lt;enumeration value="PRGP"/&gt;
 *     &lt;enumeration value="LOBU"/&gt;
 *     &lt;enumeration value="GNDR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
