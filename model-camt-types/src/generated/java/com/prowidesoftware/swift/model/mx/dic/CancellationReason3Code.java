
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationReason3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CUST"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="CURR"/>
 *     <enumeration value="UPAY"/>
 *     <enumeration value="MM23"/>
 *     <enumeration value="MM24"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationReason3Code")
@XmlEnum
public enum CancellationReason3Code {


    /**
     * Cancellation requested by the Debtor.
     * 
     */
    CUST("CUST"),

    /**
     * Payment is a duplicate of another payment.
     * 
     */
    DUPL("DUPL"),

    /**
     * Agent in the payment workflow is incorrect.
     * 
     */
    AGNT("AGNT"),

    /**
     * Currency of the payment is incorrect.
     * 
     */
    CURR("CURR"),

    /**
     * Payment is not justified.
     * 
     */
    UPAY("UPAY"),

    /**
     * Insufficient or incoherent details about the debtor with respect to regulatory requirements.
     * 
     */
    @XmlEnumValue("MM23")
    MM_23("MM23"),

    /**
     * Insufficient or incoherent details about the creditor with respect to regulatory requirements.
     * 
     */
    @XmlEnumValue("MM24")
    MM_24("MM24");
    private final String value;

    CancellationReason3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CancellationReason3Code fromValue(String v) {
        for (CancellationReason3Code c: CancellationReason3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
