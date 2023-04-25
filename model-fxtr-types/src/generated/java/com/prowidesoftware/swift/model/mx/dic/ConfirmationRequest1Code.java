
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationRequest1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConfirmationRequest1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONF"/>
 *     <enumeration value="CNRR"/>
 *     <enumeration value="STAT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConfirmationRequest1Code")
@XmlEnum
public enum ConfirmationRequest1Code {


    /**
     * To confirm the trade.
     * 
     */
    CONF,

    /**
     * To reject the confirmation of the trade.
     * 
     */
    CNRR,

    /**
     * To inquire about the status of the trade confirmation.
     * 
     */
    STAT;

    public String value() {
        return name();
    }

    public static ConfirmationRequest1Code fromValue(String v) {
        return valueOf(v);
    }

}
