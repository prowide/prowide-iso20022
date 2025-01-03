
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionReversalReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionReversalReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DCBD"/>
 *     <enumeration value="IVAD"/>
 *     <enumeration value="IRED"/>
 *     <enumeration value="IPRI"/>
 *     <enumeration value="UPAY"/>
 *     <enumeration value="IETR"/>
 *     <enumeration value="FNRC"/>
 *     <enumeration value="POCS"/>
 *     <enumeration value="IPCU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionReversalReason1Code")
@XmlEnum
public enum CorporateActionReversalReason1Code {


    /**
     * Difference in day count basis.
     * 
     */
    DCBD,

    /**
     * Value date is incorrect.
     * 
     */
    IVAD,

    /**
     * Record date is incorrect.
     * 
     */
    IRED,

    /**
     * Price is incorrect.
     * 
     */
    IPRI,

    /**
     * Payment is not due.
     * 
     */
    UPAY,

    /**
     * Event level tax rate is incorrect.
     * 
     */
    IETR,

    /**
     * Funds have not been received.
     * 
     */
    FNRC,

    /**
     * Payment will occur outside of clearing system.
     * 
     */
    POCS,

    /**
     * Payment currency is incorrect.
     * 
     */
    IPCU;

    public String value() {
        return name();
    }

    public static CorporateActionReversalReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
