
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quantity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Quantity1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QALL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Quantity1Code")
@XmlEnum
public enum Quantity1Code {


    /**
     * Instruction applies to the entire eligible balance of underlying securities.
     * 
     */
    QALL;

    public String value() {
        return name();
    }

    public static Quantity1Code fromValue(String v) {
        return valueOf(v);
    }

}
