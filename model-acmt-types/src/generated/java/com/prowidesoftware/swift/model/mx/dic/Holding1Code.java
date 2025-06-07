
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Holding1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Holding1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *     &lt;enumeration value="NPRH"/&gt;
 *     &lt;enumeration value="PRTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Holding1Code")
@XmlEnum
public enum Holding1Code {


    /**
     * Certificate.
     * 
     */
    CERT,

    /**
     * Non partial holding.
     * 
     */
    NPRH,

    /**
     * Partial holding.
     * 
     */
    PRTH;

    public String value() {
        return name();
    }

    public static Holding1Code fromValue(String v) {
        return valueOf(v);
    }

}
