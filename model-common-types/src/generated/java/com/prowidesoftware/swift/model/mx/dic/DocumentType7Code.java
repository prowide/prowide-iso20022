
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JNRL"/&gt;
 *     &lt;enumeration value="CRCP"/&gt;
 *     &lt;enumeration value="HRCP"/&gt;
 *     &lt;enumeration value="SRCP"/&gt;
 *     &lt;enumeration value="RPIN"/&gt;
 *     &lt;enumeration value="VCHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
