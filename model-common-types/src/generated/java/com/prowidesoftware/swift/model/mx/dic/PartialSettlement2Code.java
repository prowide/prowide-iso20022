
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartialSettlement2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartialSettlement2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PAIN"/>
 *     <enumeration value="PARC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartialSettlement2Code")
@XmlEnum
public enum PartialSettlement2Code {


    /**
     * Confirmation is for partial settlement. Part of the transaction remains unsettled.
     * 
     */
    PAIN,

    /**
     * Confirmation is for partial settlement. No additional settlement will take place.
     * 
     */
    PARC;

    public String value() {
        return name();
    }

    public static PartialSettlement2Code fromValue(String v) {
        return valueOf(v);
    }

}
