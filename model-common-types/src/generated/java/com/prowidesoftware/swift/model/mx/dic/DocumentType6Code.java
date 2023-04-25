
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DocumentType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MSIN"/>
 *     <enumeration value="CNFA"/>
 *     <enumeration value="DNFA"/>
 *     <enumeration value="CINV"/>
 *     <enumeration value="CREN"/>
 *     <enumeration value="DEBN"/>
 *     <enumeration value="HIRI"/>
 *     <enumeration value="SBIN"/>
 *     <enumeration value="CMCN"/>
 *     <enumeration value="SOAC"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="BOLD"/>
 *     <enumeration value="VCHR"/>
 *     <enumeration value="AROI"/>
 *     <enumeration value="TSUT"/>
 *     <enumeration value="PUOR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DocumentType6Code")
@XmlEnum
public enum DocumentType6Code {


    /**
     * Document is an invoice claiming payment for the supply of metered services, for example gas or electricity supplied to a fixed meter.
     * 
     */
    MSIN,

    /**
     * Document is a credit note for the final amount settled for a commercial transaction.
     * 
     */
    CNFA,

    /**
     * Document is a debit note for the final amount settled for a commercial transaction.
     * 
     */
    DNFA,

    /**
     * Document is an invoice.
     * 
     */
    CINV,

    /**
     * Document is a credit note.
     * 
     */
    CREN,

    /**
     * Document is a debit note.
     * 
     */
    DEBN,

    /**
     * Document is an invoice for the hiring of human resources or renting goods or equipment.
     * 
     */
    HIRI,

    /**
     * Document is an invoice issued by the debtor.
     * 
     */
    SBIN,

    /**
     * Document is an agreement between the parties, stipulating the terms and conditions of the delivery of goods or services.
     * 
     */
    CMCN,

    /**
     * Document is a statement of the transactions posted to the debtor's account at the supplier.
     * 
     */
    SOAC,

    /**
     * Document is a dispatch advice.
     * 
     */
    DISP,

    /**
     * Document is a shipping notice.
     * 
     */
    BOLD,

    /**
     * Document is an electronic payment document.
     * 
     */
    VCHR,

    /**
     * Document is a payment that applies to a specific source document.
     * 
     */
    AROI,

    /**
     * Document is a transaction identifier as assigned by the Trade Services Utility.
     * 
     */
    TSUT,

    /**
     * Document is a purchase order.
     * 
     */
    PUOR;

    public String value() {
        return name();
    }

    public static DocumentType6Code fromValue(String v) {
        return valueOf(v);
    }

}
