
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rank1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Rank1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIM"/&gt;
 *     &lt;enumeration value="SECO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Rank1Code")
@XmlEnum
public enum Rank1Code {


    /**
     * Element is the primary one.
     * 
     */
    PRIM,

    /**
     * Element is the primary one.
     * 
     */
    SECO;

    public String value() {
        return name();
    }

    public static Rank1Code fromValue(String v) {
        return valueOf(v);
    }

}
