
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallIn1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallIn1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CFAV"/&gt;
 *     &lt;enumeration value="CFST"/&gt;
 *     &lt;enumeration value="CFCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallIn1Code")
@XmlEnum
public enum CallIn1Code {


    /**
     * Pay-in call is for account value.
     * 
     */
    CFAV,

    /**
     * Pay-in call is for settlement.
     * 
     */
    CFST,

    /**
     * Pay-in call is for currency close.
     * 
     */
    CFCC;

    public String value() {
        return name();
    }

    public static CallIn1Code fromValue(String v) {
        return valueOf(v);
    }

}
