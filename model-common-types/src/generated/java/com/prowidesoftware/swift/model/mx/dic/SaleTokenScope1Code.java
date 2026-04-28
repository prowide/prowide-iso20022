
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleTokenScope1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SaleTokenScope1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MULT"/&gt;
 *     &lt;enumeration value="SNGL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SaleTokenScope1Code")
@XmlEnum
public enum SaleTokenScope1Code {


    /**
     * The token is generated to recognise a customer for a longer period.
     * 
     */
    MULT,

    /**
     * The token is generated to recognise  a customer during the lifetime of a transaction.
     * 
     */
    SNGL;

    public String value() {
        return name();
    }

    public static SaleTokenScope1Code fromValue(String v) {
        return valueOf(v);
    }

}
