
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DocumentType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MSIN"/>
 *     <enumeration value="CNFA"/>
 *     <enumeration value="DNFA"/>
 *     <enumeration value="CINV"/>
 *     <enumeration value="CREN"/>
 *     <enumeration value="DEBN"/>
 *     <enumeration value="HIRI"/>
 *     <enumeration value="SBIN"/>
 *     <enumeration value="RADM"/>
 *     <enumeration value="RPIN"/>
 *     <enumeration value="CMCN"/>
 *     <enumeration value="FXDR"/>
 *     <enumeration value="SOAC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DocumentType1Code")
@XmlEnum
public enum DocumentType1Code {


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
     * Document is an agreement between the parties, stipulating the terms and conditions of the delivery of goods or services.
     * 
     */
    CMCN,

    /**
     * Document is a pre-agreed or pre-arranged foreign exchange transaction to which the payment transaction refers.
     * 
     */
    FXDR,

    /**
     * Document is a statement of the transactions posted to the debtor's account at the supplier.
     * 
     */
    SOAC;

    public String value() {
        return name();
    }

    public static DocumentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
