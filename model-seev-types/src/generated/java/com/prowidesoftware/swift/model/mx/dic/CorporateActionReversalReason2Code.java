
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionReversalReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionReversalReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DCBD"/&gt;
 *     &lt;enumeration value="FNRC"/&gt;
 *     &lt;enumeration value="IRED"/&gt;
 *     &lt;enumeration value="IETR"/&gt;
 *     &lt;enumeration value="IPCU"/&gt;
 *     &lt;enumeration value="IPRI"/&gt;
 *     &lt;enumeration value="IVAD"/&gt;
 *     &lt;enumeration value="POCS"/&gt;
 *     &lt;enumeration value="UPAY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
