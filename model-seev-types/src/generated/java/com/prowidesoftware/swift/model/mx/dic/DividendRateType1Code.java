
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DividendRateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DividendRateType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TXBL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DividendRateType1Code")
@XmlEnum
public enum DividendRateType1Code {


    /**
     * Rate relating to the underlying security for which tax is charged.
     * 
     */
    TXBL;

    public String value() {
        return name();
    }

    public static DividendRateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
