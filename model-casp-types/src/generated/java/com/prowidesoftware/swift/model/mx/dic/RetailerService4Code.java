
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetailerService4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SMIQ"/&gt;
 *     &lt;enumeration value="SMOQ"/&gt;
 *     &lt;enumeration value="SMDQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetailerService4Code")
@XmlEnum
public enum RetailerService4Code {


    /**
     * The Sale System requests a login to the POI System.
     * 
     */
    SMIQ,

    /**
     * The Sale System requests a logout to the POI System.
     * 
     */
    SMOQ,

    /**
     * The Sale System requests a session diagnosis to the POI System.
     * 
     */
    SMDQ;

    public String value() {
        return name();
    }

    public static RetailerService4Code fromValue(String v) {
        return valueOf(v);
    }

}
