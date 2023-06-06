
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingSide1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ClearingSide1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUYI"/>
 *     <enumeration value="SELL"/>
 *     <enumeration value="LEND"/>
 *     <enumeration value="BORW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
