
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuerTaxability1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IssuerTaxability1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TXBL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
