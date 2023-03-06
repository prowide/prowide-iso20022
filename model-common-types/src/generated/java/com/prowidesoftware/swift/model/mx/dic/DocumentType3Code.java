
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RADM"/&gt;
 *     &lt;enumeration value="RPIN"/&gt;
 *     &lt;enumeration value="FXDR"/&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="PUOR"/&gt;
 *     &lt;enumeration value="SCOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentType3Code")
@XmlEnum
public enum DocumentType3Code {


    /**
     * Document is a remittance advice sent separately from the current transaction.
     * 
     */
    RADM,

    /**
     * Document is a linked payment instruction to which the current payment instruction is related, for example, in a cover scenario.
     * 
     */
    RPIN,

    /**
     * Document is a pre-agreed or pre-arranged foreign exchange transaction to which the payment transaction refers.
     * 
     */
    FXDR,

    /**
     * Document is a dispatch advice.
     * 
     */
    DISP,

    /**
     * Document is a purchase order.
     * 
     */
    PUOR,

    /**
     * Document is a structured communication reference provided by the creditor to identify the referred transaction.
     * 
     */
    SCOR;

    public String value() {
        return name();
    }

    public static DocumentType3Code fromValue(String v) {
        return valueOf(v);
    }

}
