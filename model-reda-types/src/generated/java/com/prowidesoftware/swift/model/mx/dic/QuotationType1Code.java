
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="QuotationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTU"/>
 *     <enumeration value="PRCT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "QuotationType1Code")
@XmlEnum
public enum QuotationType1Code {


    /**
     * Quotation expressed as a currency and amount.
     * 
     */
    ACTU,

    /**
     * Quotation is expressed as percentage.
     * 
     */
    PRCT;

    public String value() {
        return name();
    }

    public static QuotationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
