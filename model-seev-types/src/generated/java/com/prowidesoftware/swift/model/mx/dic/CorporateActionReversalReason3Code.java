
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionReversalReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionReversalReason3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DCBD"/>
 *     <enumeration value="FNRC"/>
 *     <enumeration value="IRED"/>
 *     <enumeration value="IETR"/>
 *     <enumeration value="IPCU"/>
 *     <enumeration value="IPRI"/>
 *     <enumeration value="IVAD"/>
 *     <enumeration value="UPAY"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionReversalReason3Code")
@XmlEnum
public enum CorporateActionReversalReason3Code {


    /**
     * Difference in day count basis.
     * 
     */
    DCBD,

    /**
     * Funds have not been received.
     * 
     */
    FNRC,

    /**
     * Entitlement date is incorrect.
     * 
     */
    IRED,

    /**
     * Event level tax rate is incorrect.
     * 
     */
    IETR,

    /**
     * Payment currency is incorrect.
     * 
     */
    IPCU,

    /**
     * Price is incorrect.
     * 
     */
    IPRI,

    /**
     * Value date is incorrect.
     * 
     */
    IVAD,

    /**
     * Payment is not due.
     * 
     */
    UPAY,

    /**
     * Other
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static CorporateActionReversalReason3Code fromValue(String v) {
        return valueOf(v);
    }

}
