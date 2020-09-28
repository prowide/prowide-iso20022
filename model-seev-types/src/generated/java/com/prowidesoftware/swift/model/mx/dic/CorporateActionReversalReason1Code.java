
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionReversalReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionReversalReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DCBD"/&gt;
 *     &lt;enumeration value="IVAD"/&gt;
 *     &lt;enumeration value="IRED"/&gt;
 *     &lt;enumeration value="IPRI"/&gt;
 *     &lt;enumeration value="UPAY"/&gt;
 *     &lt;enumeration value="IETR"/&gt;
 *     &lt;enumeration value="FNRC"/&gt;
 *     &lt;enumeration value="POCS"/&gt;
 *     &lt;enumeration value="IPCU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
