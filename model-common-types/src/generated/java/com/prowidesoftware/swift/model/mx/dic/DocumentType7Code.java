
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DocumentType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="JNRL"/>
 *     <enumeration value="CRCP"/>
 *     <enumeration value="HRCP"/>
 *     <enumeration value="SRCP"/>
 *     <enumeration value="RPIN"/>
 *     <enumeration value="VCHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DocumentType7Code")
@XmlEnum
public enum DocumentType7Code {


    /**
     * When the POI or the Sale System wants to store a message on the journal printer or electronic journal of the Sale Terminal (it is sometimes a Sale Logging/Journal Printer).
     * 
     */
    JNRL,

    /**
     * When the Sale System requires	the POI system to print the Customer receipt.
     * 
     */
    CRCP,

    /**
     * When the Sale system print the Cashier copy of the Payment receipt.
     * 
     */
    HRCP,

    /**
     * When the Sale System requires the POI system to print the Sale receipt.
     * 
     */
    SRCP,

    /**
     * Document is a linked payment instruction to which the current payment instruction is related, for example, in a cover scenario.
     * 
     */
    RPIN,

    /**
     * Document is an electronic payment document.
     * 
     */
    VCHR;

    public String value() {
        return name();
    }

    public static DocumentType7Code fromValue(String v) {
        return valueOf(v);
    }

}
