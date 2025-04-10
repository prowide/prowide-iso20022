
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionCancellationReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionCancellationReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WITH"/>
 *     <enumeration value="PROC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionCancellationReason1Code")
@XmlEnum
public enum CorporateActionCancellationReason1Code {


    /**
     * Cancellation due to the corporate action event being cancelled by the issuer.
     * 
     */
    WITH,

    /**
     * Cancellation due to a processing error.
     * 
     */
    PROC;

    public String value() {
        return name();
    }

    public static CorporateActionCancellationReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
