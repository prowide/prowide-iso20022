
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResolutionSubStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResolutionSubStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMDR"/&gt;
 *     &lt;enumeration value="NEWR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResolutionSubStatus1Code")
@XmlEnum
public enum ResolutionSubStatus1Code {


    /**
     * Resolution voted at the meeting was amended.
     * 
     */
    AMDR,

    /**
     * Resolution voted at the meeting is new. 
     * 
     */
    NEWR;

    public String value() {
        return name();
    }

    public static ResolutionSubStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
