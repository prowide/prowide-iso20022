
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackerTransactionStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackerTransactionStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="G002"/&gt;
 *     &lt;enumeration value="G003"/&gt;
 *     &lt;enumeration value="G004"/&gt;
 *     &lt;enumeration value="G001"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackerTransactionStatusReason1Code")
@XmlEnum
public enum TrackerTransactionStatusReason1Code {


    /**
     * In a FIToFI Customer Credit Transfer: Credit to the creditor’s account may not be confirmed same day. Update will follow from the Status Originator.
     * In a Financial Institution Credit Transfer with cover: Debit/credit to nostro account may not be confirmed same day or Financial Institution Credit Transfer may not be transferred same day. Update will follow from the Status Originator.
     * 
     */
    @XmlEnumValue("G002")
    G_002("G002"),

    /**
     * In a FIToFI Customer Credit Transfer: Credit to creditor’s account is pending receipt of required documents. The Status Originator has requested creditor to provide additional documentation. Update will follow from the Status Originator.
     * In a Financial Institution Credit Transfer with cover: Status Originator has requested a previous Agent to provide additional information/correct information. Update will follow from the Status Originator.
     * 
     */
    @XmlEnumValue("G003")
    G_003("G003"),

    /**
     * In a FIToFI Customer Credit Transfer: Credit to the creditor’s account is pending, status Originator is waiting for funds provided via a cover. Update will follow from the Status Originator.
     * 
     */
    @XmlEnumValue("G004")
    G_004("G004"),

    /**
     * In an FI To FI Customer Credit Transfer: The Status Originator transferred the payment to the next Agent or to a Market Infrastructure. The payment transfer is not tracked. No further updates will follow from the Status Originator.
     * 
     * In a Financial Institution Credit Transfer with cover: The Status Originator performed the account booking and transferred the cover transaction to the next Reimbursement Agent or to a Market Infrastructure. The payment transfer is not tracked. No further updates will follow from the Status Originator.
     * 
     */
    @XmlEnumValue("G001")
    G_001("G001");
    private final String value;

    TrackerTransactionStatusReason1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackerTransactionStatusReason1Code fromValue(String v) {
        for (TrackerTransactionStatusReason1Code c: TrackerTransactionStatusReason1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
