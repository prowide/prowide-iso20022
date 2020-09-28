
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationalStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationalStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENAB"/&gt;
 *     &lt;enumeration value="SPEC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationalStatus1Code")
@XmlEnum
public enum OperationalStatus1Code {


    /**
     * Enabled.
     * 
     */
    ENAB,

    /**
     * Special circumstances.
     * 
     */
    SPEC;

    public String value() {
        return name();
    }

    public static OperationalStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
