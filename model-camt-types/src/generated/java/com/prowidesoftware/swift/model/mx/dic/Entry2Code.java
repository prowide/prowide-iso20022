
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entry2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Entry2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRIA"/&gt;
 *     &lt;enumeration value="OFFI"/&gt;
 *     &lt;enumeration value="REQU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Entry2Code")
@XmlEnum
public enum Entry2Code {


    /**
     * Trial pay-in schedule.
     * 
     */
    TRIA,

    /**
     * Official pay-in schedule.
     * 
     */
    OFFI,

    /**
     * Pay-in schedule on request.
     * 
     */
    REQU;

    public String value() {
        return name();
    }

    public static Entry2Code fromValue(String v) {
        return valueOf(v);
    }

}
