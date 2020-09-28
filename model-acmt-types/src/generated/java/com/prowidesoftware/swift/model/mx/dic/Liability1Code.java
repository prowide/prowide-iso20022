
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Liability1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Liability1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *     &lt;enumeration value="BROK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Liability1Code")
@XmlEnum
public enum Liability1Code {


    /**
     * Investor is responsible.
     * 
     */
    INVE,

    /**
     * Broker is responsible.
     * 
     */
    BROK;

    public String value() {
        return name();
    }

    public static Liability1Code fromValue(String v) {
        return valueOf(v);
    }

}
