
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Exact4AlphaNumericText_T2S_01.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Exact4AlphaNumericText_T2S_01">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <pattern value="[a-zA-Z0-9]{4}"/>
 *     <enumeration value="BLCK"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="COSP"/>
 *     <enumeration value="EARM"/>
 *     <enumeration value="RESE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Exact4AlphaNumericText_T2S_01")
@XmlEnum
public enum Exact4AlphaNumericTextT2S01 {


    /**
     * Blocked security
     * 
     */
    BLCK,

    /**
     * Collateralized
     * 
     */
    COLL,

    /**
     * CoSD blocking of securities
     * 
     */
    COSP,

    /**
     * Earmarked security
     * 
     */
    EARM,

    /**
     * Reserved security
     * 
     */
    RESE;

    public String value() {
        return name();
    }

    public static Exact4AlphaNumericTextT2S01 fromValue(String v) {
        return valueOf(v);
    }

}
