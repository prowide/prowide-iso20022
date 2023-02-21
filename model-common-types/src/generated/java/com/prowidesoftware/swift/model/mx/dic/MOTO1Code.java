
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOTO1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MOTO1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAOR"/&gt;
 *     &lt;enumeration value="MOTO"/&gt;
 *     &lt;enumeration value="TPOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MOTO1Code")
@XmlEnum
public enum MOTO1Code {


    /**
     * Mail order.
     * 
     */
    MAOR,

    /**
     * Mail order or telephone order.
     * 
     * 
     */
    MOTO,

    /**
     * Telephone order
     * 
     */
    TPOR;

    public String value() {
        return name();
    }

    public static MOTO1Code fromValue(String v) {
        return valueOf(v);
    }

}
