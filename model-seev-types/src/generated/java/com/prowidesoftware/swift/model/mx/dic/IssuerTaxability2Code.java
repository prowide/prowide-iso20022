
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuerTaxability2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IssuerTaxability2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TXBL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IssuerTaxability2Code")
@XmlEnum
public enum IssuerTaxability2Code {


    /**
     * The relevant proceeds are taxable.
     * 
     */
    TXBL;

    public String value() {
        return name();
    }

    public static IssuerTaxability2Code fromValue(String v) {
        return valueOf(v);
    }

}
