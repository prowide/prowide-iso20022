
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCAdjustmentPaymentType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCAdjustmentPaymentType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RRCD"/>
 *     <enumeration value="RRDR"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="MISC"/>
 *     <enumeration value="RRD1"/>
 *     <enumeration value="RRD2"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="STOK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCAdjustmentPaymentType5Code")
@XmlEnum
public enum DTCAdjustmentPaymentType5Code {


    /**
     * Custody reorganisation deposit related adjustment.
     * 
     */
    RRCD("RRCD"),

    /**
     * Dynamic rate change related adjustment.
     * 
     */
    RRDR("RRDR"),

    /**
     * FAIL (undelivered securities) transaction.
     * 
     */
    FAIL("FAIL"),

    /**
     * Miscellaneous (adjustment) transaction.
     * 
     */
    MISC("MISC"),

    /**
     * Participant deposited a security within 10 days after a corporate action event has occurred.
     * 
     */
    @XmlEnumValue("RRD1")
    RRD_1("RRD1"),

    /**
     * Participant deposited a security 10 days after a corporate action event has occurred.
     * 
     */
    @XmlEnumValue("RRD2")
    RRD_2("RRD2"),

    /**
     * REPO (repurchase agreement) transaction.
     * 
     */
    REPO("REPO"),

    /**
     * Stock loan transaction.
     * 
     */
    STOK("STOK");
    private final String value;

    DTCAdjustmentPaymentType5Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DTCAdjustmentPaymentType5Code fromValue(String v) {
        for (DTCAdjustmentPaymentType5Code c: DTCAdjustmentPaymentType5Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
