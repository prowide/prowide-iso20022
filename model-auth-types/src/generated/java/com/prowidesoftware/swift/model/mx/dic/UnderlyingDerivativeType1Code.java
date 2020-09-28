
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingDerivativeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingDerivativeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CURR"/&gt;
 *     &lt;enumeration value="CIDX"/&gt;
 *     &lt;enumeration value="IIDX"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingDerivativeType1Code")
@XmlEnum
public enum UnderlyingDerivativeType1Code {


    /**
     * Identifies categories of currency instruments.
     * 
     */
    CURR,

    /**
     * Identifies categories of instruments that are index of currencies based.
     * 
     * 
     */
    CIDX,

    /**
     * Identifies categories of instruments that are index of interest rates based.
     * 
     */
    IIDX,

    /**
     * Identifies categories of instruments that are interest rates based.
     * 
     * 
     */
    INTR;

    public String value() {
        return name();
    }

    public static UnderlyingDerivativeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
