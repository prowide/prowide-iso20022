
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicableRules1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicableRules1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NPRE"/&gt;
 *     &lt;enumeration value="YPRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApplicableRules1Code")
@XmlEnum
public enum ApplicableRules1Code {


    /**
     * Pre A Day rules do not apply.
     * 
     */
    NPRE,

    /**
     * Pre A Day rules applies.
     * 
     */
    YPRE;

    public String value() {
        return name();
    }

    public static ApplicableRules1Code fromValue(String v) {
        return valueOf(v);
    }

}
