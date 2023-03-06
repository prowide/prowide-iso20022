
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSCResult1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CSCResult1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CMCH"/&gt;
 *     &lt;enumeration value="CNMH"/&gt;
 *     &lt;enumeration value="CNMT"/&gt;
 *     &lt;enumeration value="CNMO"/&gt;
 *     &lt;enumeration value="CMSS"/&gt;
 *     &lt;enumeration value="CNUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CSCResult1Code")
@XmlEnum
public enum CSCResult1Code {


    /**
     * Card security code match.
     * 
     */
    CMCH,

    /**
     * No card security code match.
     * 
     */
    CNMH,

    /**
     * Card security code not processed for technical reason.
     * 
     */
    CNMT,

    /**
     * Card security code not processed for non-technical reason.
     * 
     */
    CNMO,

    /**
     * Card security code missing in request.
     * 
     */
    CMSS,

    /**
     * Card security code not used by issuer.
     * 
     */
    CNUS;

    public String value() {
        return name();
    }

    public static CSCResult1Code fromValue(String v) {
        return valueOf(v);
    }

}
