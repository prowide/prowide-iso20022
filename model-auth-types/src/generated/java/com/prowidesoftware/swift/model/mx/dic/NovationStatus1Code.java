
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NovationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NovationStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONO"/&gt;
 *     &lt;enumeration value="NOVA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NovationStatus1Code")
@XmlEnum
public enum NovationStatus1Code {


    /**
     * Transaction is not a novation.
     * 
     */
    NONO,

    /**
     * Transaction is a novation.
     * 
     */
    NOVA;

    public String value() {
        return name();
    }

    public static NovationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
