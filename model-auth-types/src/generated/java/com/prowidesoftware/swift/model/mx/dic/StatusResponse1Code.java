
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusResponse1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusResponse1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NRES"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusResponse1Code")
@XmlEnum
public enum StatusResponse1Code {


    /**
     * Response not provided yet.
     * 
     */
    NRES,

    /**
     * Response is partially provided.
     * 
     */
    PART,

    /**
     * Response is complete.
     * 
     */
    COMP;

    public String value() {
        return name();
    }

    public static StatusResponse1Code fromValue(String v) {
        return valueOf(v);
    }

}
