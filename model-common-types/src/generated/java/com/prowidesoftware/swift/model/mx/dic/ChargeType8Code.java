
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ChargeType8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SIGN"/>
 *     <enumeration value="STDE"/>
 *     <enumeration value="STOR"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="PICK"/>
 *     <enumeration value="DNGR"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="COLF"/>
 *     <enumeration value="CHOR"/>
 *     <enumeration value="CHDE"/>
 *     <enumeration value="AIRF"/>
 *     <enumeration value="TRPT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ChargeType8Code")
@XmlEnum
public enum ChargeType8Code {


    /**
     * Charge is for signature services.
     * 
     */
    SIGN,

    /**
     * Charge is for storage of goods at destination.
     * 
     */
    STDE,

    /**
     * Charge is for storage of goods at origin.
     * 
     */
    STOR,

    /**
     * Charge is for packaging of goods.
     * 
     */
    PACK,

    /**
     * Charge is for pick-up of goods.
     * 
     */
    PICK,

    /**
     * Charge is for dangerous goods.
     * 
     */
    DNGR,

    /**
     * Charge is for security.
     * 
     */
    SECU,

    /**
     * Charge is a premium for insurance.
     * 
     */
    INSU,

    /**
     * Charge is for the collection of the freight.
     * 
     */
    COLF,

    /**
     * Charge is for clearance and handling of goods at origin.
     * 
     */
    CHOR,

    /**
     * Charge is for clearance and handling of goods at destination.
     * 
     */
    CHDE,

    /**
     * Charge is an airway bill fee.
     * 
     */
    AIRF,

    /**
     * Charge is for transport.
     * 
     */
    TRPT;

    public String value() {
        return name();
    }

    public static ChargeType8Code fromValue(String v) {
        return valueOf(v);
    }

}
