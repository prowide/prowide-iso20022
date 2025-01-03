
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackerPaymentRejectReturnReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TrackerPaymentRejectReturnReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FOCR"/>
 *     <enumeration value="BE01"/>
 *     <enumeration value="AC01"/>
 *     <enumeration value="RC08"/>
 *     <enumeration value="FF07"/>
 *     <enumeration value="RR03"/>
 *     <enumeration value="NOAS"/>
 *     <enumeration value="MS03"/>
 *     <enumeration value="RR05"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="AM06"/>
 *     <enumeration value="RC01"/>
 *     <enumeration value="AC06"/>
 *     <enumeration value="AC04"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="G004"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TrackerPaymentRejectReturnReason1Code")
@XmlEnum
public enum TrackerPaymentRejectReturnReason1Code {


    /**
     * Return following a cancellation request.
     * 
     */
    FOCR("FOCR"),

    /**
     * Identification of end customer is not consistent with associated account number. (formerly CreditorConsistency).
     * 
     */
    @XmlEnumValue("BE01")
    BE_01("BE01"),

    /**
     * Account number is invalid or missing
     * 
     */
    @XmlEnumValue("AC01")
    AC_01("AC01"),

    /**
     * Routing code not valid for local clearing.
     * 
     */
    @XmlEnumValue("RC08")
    RC_08("RC08"),

    /**
     * Purpose is missing or invalid.
     * 
     */
    @XmlEnumValue("FF07")
    FF_07("FF07"),

    /**
     * Specification of the creditor's name and/or address needed for regulatory requirements is insufficient or missing.
     * 
     */
    @XmlEnumValue("RR03")
    RR_03("RR03"),

    /**
     * Failed to contact beneficiary.
     * 
     */
    NOAS("NOAS"),

    /**
     * Reason has not been specified by agent.
     * 
     */
    @XmlEnumValue("MS03")
    MS_03("MS03"),

    /**
     * Regulatory or Central Bank Reporting information missing, incomplete or invalid.
     * 
     */
    @XmlEnumValue("RR05")
    RR_05("RR05"),

    /**
     * At request of creditor.
     * 
     */
    CUST("CUST"),

    /**
     * Below limit.
     * 
     */
    @XmlEnumValue("AM06")
    AM_06("AM06"),

    /**
     * Bank identifier code specified in the message has an incorrect format (formerly IncorrectFormatForRoutingCode).
     * 
     */
    @XmlEnumValue("RC01")
    RC_01("RC01"),

    /**
     * Account specified is blocked, prohibiting posting of transactions against it.
     * 
     */
    @XmlEnumValue("AC06")
    AC_06("AC06"),

    /**
     * Account number specified has been closed on the bank of account's books.
     * 
     */
    @XmlEnumValue("AC04")
    AC_04("AC04"),

    /**
     * Payment is a duplicate of another payment.
     * 
     */
    DUPL("DUPL"),

    /**
     * Credit to the creditor's account is pending as status Originator is waiting for funds provided via a cover.
     * 
     */
    @XmlEnumValue("G004")
    G_004("G004");
    private final String value;

    TrackerPaymentRejectReturnReason1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackerPaymentRejectReturnReason1Code fromValue(String v) {
        for (TrackerPaymentRejectReturnReason1Code c: TrackerPaymentRejectReturnReason1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
