
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Provided1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Provided1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NPRO"/&gt;
 *     &lt;enumeration value="PROV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Provided1Code")
@XmlEnum
public enum Provided1Code {


    /**
     * Not provided.
     * 
     */
    NPRO,

    /**
     * Provided.
     * 
     */
    PROV;

    public String value() {
        return name();
    }

    public static Provided1Code fromValue(String v) {
        return valueOf(v);
    }

}
