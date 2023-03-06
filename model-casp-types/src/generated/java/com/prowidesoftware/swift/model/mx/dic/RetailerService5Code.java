
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetailerService5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SMIP"/&gt;
 *     &lt;enumeration value="SMOP"/&gt;
 *     &lt;enumeration value="SMDP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetailerService5Code")
@XmlEnum
public enum RetailerService5Code {


    /**
     * The POI System responds to a login request.
     * 
     */
    SMIP,

    /**
     * The POI System responds to a logout request.
     * 
     */
    SMOP,

    /**
     * The POI System responds to a diagnosis request.
     * 
     */
    SMDP;

    public String value() {
        return name();
    }

    public static RetailerService5Code fromValue(String v) {
        return valueOf(v);
    }

}
