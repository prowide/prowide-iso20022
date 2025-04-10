
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoutingType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALLO"/&gt;
 *     &lt;enumeration value="BLOC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoutingType1Code")
@XmlEnum
public enum RoutingType1Code {


    /**
     * Indicates that routing is allowed.
     * 
     */
    ALLO,

    /**
     * Indicates that routing is blocked.
     * 
     */
    BLOC;

    public String value() {
        return name();
    }

    public static RoutingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
