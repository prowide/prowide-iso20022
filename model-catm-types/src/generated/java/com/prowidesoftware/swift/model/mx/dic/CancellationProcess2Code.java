
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationProcess2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationProcess2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADVC"/>
 *     <enumeration value="NALW"/>
 *     <enumeration value="REQU"/>
 *     <enumeration value="APPL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationProcess2Code")
@XmlEnum
public enum CancellationProcess2Code {


    /**
     * Card payment transaction may be cancelled by an advice only before closure of the reconciliation period or before the capture by batch.
     * 
     */
    ADVC,

    /**
     * Card payment transaction cannot be cancelled by the acquirer.
     * 
     */
    NALW,

    /**
     * Card payment transaction may also be cancelled after the closure of the reconciliation period or after the capture by batch. In this case a cancellation request exchange is required.
     * 
     */
    REQU,

    /**
     * Cancellation of the Card payment transaction is defined by the payment application.
     * 
     */
    APPL;

    public String value() {
        return name();
    }

    public static CancellationProcess2Code fromValue(String v) {
        return valueOf(v);
    }

}
