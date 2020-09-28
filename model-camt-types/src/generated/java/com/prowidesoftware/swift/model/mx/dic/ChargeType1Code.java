
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BRKF"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeType1Code")
@XmlEnum
public enum ChargeType1Code {


    /**
     * Fee paid to a broker for services provided.
     * 
     */
    BRKF,

    /**
     * Fee paid for services provided.
     * 
     */
    COMM;

    public String value() {
        return name();
    }

    public static ChargeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
