
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementItemAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AgreementItemAction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEAC"/>
 *     <enumeration value="HOLD"/>
 *     <enumeration value="MDFY"/>
 *     <enumeration value="REAC"/>
 *     <enumeration value="OPEN"/>
 *     <enumeration value="SYNC"/>
 *     <enumeration value="VRFY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AgreementItemAction1Code")
@XmlEnum
public enum AgreementItemAction1Code {


    /**
     * Deactivate agreement item.
     * 
     */
    DEAC,

    /**
     * Hold the agreement item.
     * 
     */
    HOLD,

    /**
     * Modify agreement item information.
     * 
     */
    MDFY,

    /**
     * Reactivate agreement item.
     * 
     */
    REAC,

    /**
     * Register item as new agreement.
     * 
     */
    OPEN,

    /**
     * Send status with full agreement information details.
     * 
     */
    SYNC,

    /**
     * Verify agreement item information.
     * 
     */
    VRFY;

    public String value() {
        return name();
    }

    public static AgreementItemAction1Code fromValue(String v) {
        return valueOf(v);
    }

}
