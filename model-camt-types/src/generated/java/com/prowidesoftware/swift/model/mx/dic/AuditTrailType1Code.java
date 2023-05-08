
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuditTrailType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AuditTrailType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRTL"/>
 *     <enumeration value="LIMI"/>
 *     <enumeration value="RSVT"/>
 *     <enumeration value="TRXN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AuditTrailType1Code")
@XmlEnum
public enum AuditTrailType1Code {


    /**
     * Audit trails to be returned which are related to a credit line.
     * 
     */
    CRTL,

    /**
     * Audit trails to be returned which are related to a limit.
     * 
     */
    LIMI,

    /**
     * Audit trails to be returned which are related to a reservation.
     * 
     */
    RSVT,

    /**
     * Audit trails to be returned which are related to a transaction.
     * 
     */
    TRXN;

    public String value() {
        return name();
    }

    public static AuditTrailType1Code fromValue(String v) {
        return valueOf(v);
    }

}
