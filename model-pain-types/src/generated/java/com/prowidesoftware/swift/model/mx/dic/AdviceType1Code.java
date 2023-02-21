
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdviceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdviceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADWD"/&gt;
 *     &lt;enumeration value="ADND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdviceType1Code")
@XmlEnum
public enum AdviceType1Code {


    /**
     * Advice with transaction details is requested.
     * 
     */
    ADWD,

    /**
     * Advice without  transaction details is requested.
     * 
     */
    ADND;

    public String value() {
        return name();
    }

    public static AdviceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
