
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationIndividualStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationIndividualStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RJCR"/>
 *     <enumeration value="ACCR"/>
 *     <enumeration value="PDCR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationIndividualStatus1Code")
@XmlEnum
public enum CancellationIndividualStatus1Code {


    /**
     * Cancellation request is rejected
     * 
     */
    RJCR,

    /**
     * Cancellation is accepted.
     * 
     */
    ACCR,

    /**
     * Cancellation request is pending.
     * 
     */
    PDCR;

    public String value() {
        return name();
    }

    public static CancellationIndividualStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
