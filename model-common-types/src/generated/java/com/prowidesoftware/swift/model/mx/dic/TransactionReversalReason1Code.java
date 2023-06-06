
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionReversalReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionReversalReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AC04"/>
 *     <enumeration value="AM05"/>
 *     <enumeration value="AG02"/>
 *     <enumeration value="MD01"/>
 *     <enumeration value="MD05"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionReversalReason1Code")
@XmlEnum
public enum TransactionReversalReason1Code {


    /**
     * Account number specified has been closed on the Receiver's books.
     * 
     */
    @XmlEnumValue("AC04")
    AC_04("AC04"),

    /**
     * This message appears to have been duplicated.
     * 
     */
    @XmlEnumValue("AM05")
    AM_05("AM05"),

    /**
     * Bank Operation code specified in the message is not valid for receiver.
     * 
     */
    @XmlEnumValue("AG02")
    AG_02("AG02"),

    /**
     * Mandate is cancelled or invalid.
     * 
     */
    @XmlEnumValue("MD01")
    MD_01("MD01"),

    /**
     * Creditor or creditor's agent should not have collected the direct debit.
     * 
     */
    @XmlEnumValue("MD05")
    MD_05("MD05");
    private final String value;

    TransactionReversalReason1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionReversalReason1Code fromValue(String v) {
        for (TransactionReversalReason1Code c: TransactionReversalReason1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
