
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionRejectReason7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionRejectReason7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AC01"/&gt;
 *     &lt;enumeration value="AC04"/&gt;
 *     &lt;enumeration value="AC06"/&gt;
 *     &lt;enumeration value="AG01"/&gt;
 *     &lt;enumeration value="AG02"/&gt;
 *     &lt;enumeration value="AM04"/&gt;
 *     &lt;enumeration value="AM05"/&gt;
 *     &lt;enumeration value="MD01"/&gt;
 *     &lt;enumeration value="MD02"/&gt;
 *     &lt;enumeration value="MD03"/&gt;
 *     &lt;enumeration value="RC01"/&gt;
 *     &lt;enumeration value="MD07"/&gt;
 *     &lt;enumeration value="MS02"/&gt;
 *     &lt;enumeration value="MS03"/&gt;
 *     &lt;enumeration value="TM01"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionRejectReason7Code")
@XmlEnum
public enum TransactionRejectReason7Code {


    /**
     * Format of the account number specified is not correct.
     * 
     */
    @XmlEnumValue("AC01")
    AC_01("AC01"),

    /**
     * Account number specified has been closed on the Receiver's books.
     * 
     */
    @XmlEnumValue("AC04")
    AC_04("AC04"),

    /**
     * Account specified is blocked, prohibiting posting of transactions against it.
     * 
     */
    @XmlEnumValue("AC06")
    AC_06("AC06"),

    /**
     * Transaction forbidden on this type of account (formerly NoAgreement).
     * 
     */
    @XmlEnumValue("AG01")
    AG_01("AG01"),

    /**
     * Bank Operation code specified in the message is not valid for receiver.
     * 
     */
    @XmlEnumValue("AG02")
    AG_02("AG02"),

    /**
     * Amount of funds available to cover specified message amount is insufficient.
     * 
     */
    @XmlEnumValue("AM04")
    AM_04("AM04"),

    /**
     * This message appears to have been duplicated.
     * 
     */
    @XmlEnumValue("AM05")
    AM_05("AM05"),

    /**
     * Mandate is cancelled or invalid.
     * 
     */
    @XmlEnumValue("MD01")
    MD_01("MD01"),

    /**
     * Mandate related information data required by the scheme is missing.
     * 
     */
    @XmlEnumValue("MD02")
    MD_02("MD02"),

    /**
     * File format incomplete or invalid.
     * 
     */
    @XmlEnumValue("MD03")
    MD_03("MD03"),

    /**
     * Bank identifier code specified in the message has an incorrect format (formerly IncorrectFormatForRoutingCode).
     * 
     */
    @XmlEnumValue("RC01")
    RC_01("RC01"),

    /**
     * End customer is deceased.
     * 
     */
    @XmlEnumValue("MD07")
    MD_07("MD07"),

    /**
     * Reason has not been specified by end customer.
     * 
     */
    @XmlEnumValue("MS02")
    MS_02("MS02"),

    /**
     * Reason has not been specified by agent.
     * 
     */
    @XmlEnumValue("MS03")
    MS_03("MS03"),

    /**
     * Associated message was received after agreed processing cut-off time.
     * 
     */
    @XmlEnumValue("TM01")
    TM_01("TM01");
    private final String value;

    TransactionRejectReason7Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionRejectReason7Code fromValue(String v) {
        for (TransactionRejectReason7Code c: TransactionRejectReason7Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
