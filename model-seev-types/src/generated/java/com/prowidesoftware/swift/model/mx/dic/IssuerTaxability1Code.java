
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuerTaxability1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IssuerTaxability1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TXBL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IssuerTaxability1Code")
@XmlEnum
public enum IssuerTaxability1Code {


    /**
     * The cash proceeds are taxable.
     * 
     */
    TXBL;

    public String value() {
        return name();
    }

    public static IssuerTaxability1Code fromValue(String v) {
        return valueOf(v);
    }

}
