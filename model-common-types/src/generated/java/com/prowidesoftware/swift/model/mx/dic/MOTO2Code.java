
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOTO2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MOTO2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAOR"/&gt;
 *     &lt;enumeration value="MOTO"/&gt;
 *     &lt;enumeration value="TPOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MOTO2Code")
@XmlEnum
public enum MOTO2Code {


    /**
     * Mail order.
     * 
     */
    MAOR,

    /**
     * Mail order or telephone order.
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

    public static MOTO2Code fromValue(String v) {
        return valueOf(v);
    }

}
