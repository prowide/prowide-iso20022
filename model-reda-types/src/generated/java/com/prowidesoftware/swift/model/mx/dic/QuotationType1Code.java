
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuotationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTU"/&gt;
 *     &lt;enumeration value="PRCT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
