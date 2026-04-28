
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InformationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INST"/&gt;
 *     &lt;enumeration value="RELY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InformationType1Code")
@XmlEnum
public enum InformationType1Code {


    /**
     * Instructions used to ease automatic request processing.
     * 
     */
    INST,

    /**
     * Instructions used to ease automatic request relay.
     * 
     */
    RELY;

    public String value() {
        return name();
    }

    public static InformationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
