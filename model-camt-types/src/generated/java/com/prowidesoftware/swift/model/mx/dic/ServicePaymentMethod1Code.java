
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicePaymentMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ServicePaymentMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BCMP"/>
 *     <enumeration value="FLAT"/>
 *     <enumeration value="PVCH"/>
 *     <enumeration value="INVS"/>
 *     <enumeration value="WVED"/>
 *     <enumeration value="FREE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ServicePaymentMethod1Code")
@XmlEnum
public enum ServicePaymentMethod1Code {


    /**
     * Allows the bank to offset a service charge with interest earned on the deposit account balance. The actual charges arising from balance compensable services are always calculated and charged at month end. Used in the USA.
     * 
     */
    BCMP,

    /**
     * Charge is not balance compensable and is due. In the absence of balance compensable charges in Europe, this would be the most commonly used code for services that are billed at month end.
     * 
     */
    FLAT,

    /**
     * Charge was previously assessed and is not part of the amount due as of this statement. This code is used for charges that were debited as the chargeable event took place.
     * 
     */
    PVCH,

    /**
     * Charge was previously invoiced and is not part of the amount due as of this statement. This code is used for charges that were invoiced as the chargeable event took place.
     * 
     */
    INVS,

    /**
     * Charge is waived and not due. The waived amount must be placed in original charge amount.
     * 
     */
    WVED,

    /**
     * Service is free, no charge, to the customer.
     * 
     */
    FREE;

    public String value() {
        return name();
    }

    public static ServicePaymentMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
