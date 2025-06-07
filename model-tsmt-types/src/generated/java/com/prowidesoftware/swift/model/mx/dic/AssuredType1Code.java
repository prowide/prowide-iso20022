
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssuredType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssuredType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUYE"/&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *     &lt;enumeration value="BUBA"/&gt;
 *     &lt;enumeration value="SEBA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssuredType1Code")
@XmlEnum
public enum AssuredType1Code {


    /**
     * The buyer should be the assured.
     * 
     */
    BUYE,

    /**
     * The seller should be the assured.
     * 
     */
    SELL,

    /**
     * The buyer's bank should be the assured.
     * 
     */
    BUBA,

    /**
     * The seller's bank should be the assured.
     * 
     */
    SEBA;

    public String value() {
        return name();
    }

    public static AssuredType1Code fromValue(String v) {
        return valueOf(v);
    }

}
