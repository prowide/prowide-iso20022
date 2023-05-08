
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDate6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementDate6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TFIV"/>
 *     <enumeration value="TFOR"/>
 *     <enumeration value="TONE"/>
 *     <enumeration value="TTRE"/>
 *     <enumeration value="TTWO"/>
 *     <enumeration value="SAMD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementDate6Code")
@XmlEnum
public enum SettlementDate6Code {


    /**
     * Settlement takes place on the trade date plus five business days.
     * 
     */
    TFIV,

    /**
     * Settlement takes place on the trade date plus four business days.
     * 
     */
    TFOR,

    /**
     * Settlement takes place on the trade date plus one business day.
     * 
     */
    TONE,

    /**
     * Settlement takes place on the trade date plus three business days.
     * 
     */
    TTRE,

    /**
     * Settlement takes place on the trade date plus two business days.
     * 
     */
    TTWO,

    /**
     * Event occurs on the same day or at time T.
     * 
     */
    SAMD;

    public String value() {
        return name();
    }

    public static SettlementDate6Code fromValue(String v) {
        return valueOf(v);
    }

}
