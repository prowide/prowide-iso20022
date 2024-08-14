
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionReversalReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionReversalReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DCBD"/>
 *     <enumeration value="FNRC"/>
 *     <enumeration value="IRED"/>
 *     <enumeration value="IETR"/>
 *     <enumeration value="IPCU"/>
 *     <enumeration value="IPRI"/>
 *     <enumeration value="IVAD"/>
 *     <enumeration value="POCS"/>
 *     <enumeration value="UPAY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionReversalReason2Code")
@XmlEnum
public enum CorporateActionReversalReason2Code {


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
     * Payment will occur outside of clearing system.
     * 
     */
    POCS,

    /**
     * Payment is not due.
     * 
     */
    UPAY;

    public String value() {
        return name();
    }

    public static CorporateActionReversalReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
