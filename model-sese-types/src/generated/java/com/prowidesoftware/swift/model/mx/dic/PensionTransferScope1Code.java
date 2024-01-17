
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PensionTransferScope1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PensionTransferScope1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRYS"/>
 *     <enumeration value="SDDT"/>
 *     <enumeration value="FULP"/>
 *     <enumeration value="UCRY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PensionTransferScope1Code")
@XmlEnum
public enum PensionTransferScope1Code {


    /**
     * Transfer is for the crystallised portion.
     * 
     */
    CRYS,

    /**
     * Transfer is for a specific drawdown tranche.
     * 
     */
    SDDT,

    /**
     * Transfer is for the full pension.
     * 
     */
    FULP,

    /**
     * Transfer is for the uncrystallised portion.
     * 
     */
    UCRY;

    public String value() {
        return name();
    }

    public static PensionTransferScope1Code fromValue(String v) {
        return valueOf(v);
    }

}
