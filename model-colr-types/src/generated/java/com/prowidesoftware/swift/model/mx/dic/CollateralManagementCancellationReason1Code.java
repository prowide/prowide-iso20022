
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralManagementCancellationReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralManagementCancellationReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRER"/>
 *     <enumeration value="PNSU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralManagementCancellationReason1Code")
@XmlEnum
public enum CollateralManagementCancellationReason1Code {


    /**
     * Cancellation due to message being sent in error.
     * 
     */
    PRER,

    /**
     * Cancellation due to a change in exposure or collateral or independent amount or margin terms. For collateral proposal submitting new/different collateral.
     * 
     */
    PNSU;

    public String value() {
        return name();
    }

    public static CollateralManagementCancellationReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
