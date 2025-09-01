
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetMarket3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetMarket3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YSCO"/&gt;
 *     &lt;enumeration value="NSCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TargetMarket3Code")
@XmlEnum
public enum TargetMarket3Code {


    /**
     * Yes, is applicable.
     * 
     */
    YSCO,

    /**
     * No, is not applicable.
     * 
     */
    NSCO;

    public String value() {
        return name();
    }

    public static TargetMarket3Code fromValue(String v) {
        return valueOf(v);
    }

}
