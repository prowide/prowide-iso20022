
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Insurance1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Insurance1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LIFE"/&gt;
 *     &lt;enumeration value="PDIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Insurance1Code")
@XmlEnum
public enum Insurance1Code {


    /**
     * Life insurance.
     * 
     */
    LIFE,

    /**
     * Permanent disability insurance.
     * 
     */
    PDIS;

    public String value() {
        return name();
    }

    public static Insurance1Code fromValue(String v) {
        return valueOf(v);
    }

}
