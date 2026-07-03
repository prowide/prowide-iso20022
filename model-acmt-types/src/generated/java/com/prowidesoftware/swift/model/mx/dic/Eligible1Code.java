
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Eligible1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Eligible1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ELIG"/&gt;
 *     &lt;enumeration value="NELI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Eligible1Code")
@XmlEnum
public enum Eligible1Code {


    /**
     * Item is eligible.
     * 
     */
    ELIG,

    /**
     * Item is not eligible.
     * 
     */
    NELI;

    public String value() {
        return name();
    }

    public static Eligible1Code fromValue(String v) {
        return valueOf(v);
    }

}
