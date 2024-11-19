
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceAdjustmentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ServiceAdjustmentType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMP"/>
 *     <enumeration value="NCMP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ServiceAdjustmentType1Code")
@XmlEnum
public enum ServiceAdjustmentType1Code {


    /**
     * Adjustment applies to a service which is balance compensable. Earnings credits based on average balances maintained in the account can be used to offset the service charge.
     * 
     */
    COMP,

    /**
     * Adjustment applies to a service which is not balance compensable. Balance based credits cannot be used to offset the service charge.
     * 
     */
    NCMP;

    public String value() {
        return name();
    }

    public static ServiceAdjustmentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
