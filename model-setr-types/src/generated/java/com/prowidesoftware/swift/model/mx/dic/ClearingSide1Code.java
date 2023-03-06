
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingSide1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClearingSide1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUYI"/&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *     &lt;enumeration value="LEND"/&gt;
 *     &lt;enumeration value="BORW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClearingSide1Code")
@XmlEnum
public enum ClearingSide1Code {


    /**
     * Clearing member is on the buying side.
     * 
     */
    BUYI,

    /**
     * Clearing member is on the selling side.
     * 
     */
    SELL,

    /**
     * Clearing member is on the lending side.
     * 
     */
    LEND,

    /**
     * Clearing member is on the borrowing side.
     * 
     */
    BORW;

    public String value() {
        return name();
    }

    public static ClearingSide1Code fromValue(String v) {
        return valueOf(v);
    }

}
