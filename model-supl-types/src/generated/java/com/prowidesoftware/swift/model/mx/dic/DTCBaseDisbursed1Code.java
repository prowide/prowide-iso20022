
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCBaseDisbursed1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCBaseDisbursed1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BASE"/&gt;
 *     &lt;enumeration value="DISB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DTCBaseDisbursed1Code")
@XmlEnum
public enum DTCBaseDisbursed1Code {


    /**
     * Based on base security.
     * 
     */
    BASE,

    /**
     * Based on disbursed security.
     * 
     */
    DISB;

    public String value() {
        return name();
    }

    public static DTCBaseDisbursed1Code fromValue(String v) {
        return valueOf(v);
    }

}
