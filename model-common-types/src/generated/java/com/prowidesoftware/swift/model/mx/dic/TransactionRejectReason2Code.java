
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionRejectReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionRejectReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AC01"/>
 *     <enumeration value="AC04"/>
 *     <enumeration value="AC06"/>
 *     <enumeration value="AM01"/>
 *     <enumeration value="AM02"/>
 *     <enumeration value="AM03"/>
 *     <enumeration value="AM04"/>
 *     <enumeration value="AM05"/>
 *     <enumeration value="AM06"/>
 *     <enumeration value="AM07"/>
 *     <enumeration value="BE01"/>
 *     <enumeration value="BE04"/>
 *     <enumeration value="BE05"/>
 *     <enumeration value="AG01"/>
 *     <enumeration value="AG02"/>
 *     <enumeration value="DT01"/>
 *     <enumeration value="RF01"/>
 *     <enumeration value="RC01"/>
 *     <enumeration value="TM01"/>
 *     <enumeration value="ED01"/>
 *     <enumeration value="ED03"/>
 *     <enumeration value="MS03"/>
 *     <enumeration value="MS02"/>
 *     <enumeration value="BE06"/>
 *     <enumeration value="BE07"/>
 *     <enumeration value="AM09"/>
 *     <enumeration value="AM10"/>
 *     <enumeration value="MD01"/>
 *     <enumeration value="MD02"/>
 *     <enumeration value="MD03"/>
 *     <enumeration value="MD04"/>
 *     <enumeration value="MD06"/>
 *     <enumeration value="MD07"/>
 *     <enumeration value="ED05"/>
 *     <enumeration value="NARR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionRejectReason2Code")
@XmlEnum
public enum TransactionRejectReason2Code {


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
     * Specified message amount is equal to zero.
     * 
     */
    @XmlEnumValue("AM01")
    AM_01("AM01"),

    /**
     * Specified transaction/message amount is greater than allowed maximum.
     * 
     */
    @XmlEnumValue("AM02")
    AM_02("AM02"),

    /**
     * Specified message amount is in an non processable currency outside of existing agreement.
     * 
     */
    @XmlEnumValue("AM03")
    AM_03("AM03"),

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
     * Specified transaction amount is less than agreed minimum.
     * 
     */
    @XmlEnumValue("AM06")
    AM_06("AM06"),

    /**
     * Amount specified in message has been blocked by regulatory authorities.
     * 
     */
    @XmlEnumValue("AM07")
    AM_07("AM07"),

    /**
     * Identification of end customer is not consistent with associated account number. (formerly CreditorConsistency).
     * 
     */
    @XmlEnumValue("BE01")
    BE_01("BE01"),

    /**
     * Specification of creditor's address, which is required for payment, is missing/not correct (formerly IncorrectCreditorAddress).
     * 
     */
    @XmlEnumValue("BE04")
    BE_04("BE04"),

    /**
     * Party who initiated the message is not recognised by the end customer.
     * 
     */
    @XmlEnumValue("BE05")
    BE_05("BE05"),

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
     * Invalid date (eg, wrong settlement date).
     * 
     */
    @XmlEnumValue("DT01")
    DT_01("DT01"),

    /**
     * Transaction reference is not unique within the message.
     * 
     */
    @XmlEnumValue("RF01")
    RF_01("RF01"),

    /**
     * Bank identifier code specified in the message has an incorrect format (formerly IncorrectFormatForRoutingCode).
     * 
     */
    @XmlEnumValue("RC01")
    RC_01("RC01"),

    /**
     * Associated message was received after agreed processing cut-off time.
     * 
     */
    @XmlEnumValue("TM01")
    TM_01("TM01"),

    /**
     * Correspondent bank not possible.
     * 
     */
    @XmlEnumValue("ED01")
    ED_01("ED01"),

    /**
     * Balance of payments complementary info is requested.
     * 
     */
    @XmlEnumValue("ED03")
    ED_03("ED03"),

    /**
     * Reason has not been specified by agent.
     * 
     */
    @XmlEnumValue("MS03")
    MS_03("MS03"),

    /**
     * Reason has not been specified by end customer.
     * 
     */
    @XmlEnumValue("MS02")
    MS_02("MS02"),

    /**
     * End customer specified is not known at associated Sort/National Bank Code or does no longer exist in the books.
     * 
     */
    @XmlEnumValue("BE06")
    BE_06("BE06"),

    /**
     * Specification of debtor's address, which is required for payment, is missing/not correct.
     * 
     */
    @XmlEnumValue("BE07")
    BE_07("BE07"),

    /**
     * Amount received is not the amount agreed or expected.
     * 
     */
    @XmlEnumValue("AM09")
    AM_09("AM09"),

    /**
     * Sum of instructed amounts does not equal the control sum.
     * 
     */
    @XmlEnumValue("AM10")
    AM_10("AM10"),

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
     * File format incorrect in terms of grouping indicator.
     * 
     */
    @XmlEnumValue("MD04")
    MD_04("MD04"),

    /**
     * Return of funds requested by end customer.
     * 
     */
    @XmlEnumValue("MD06")
    MD_06("MD06"),

    /**
     * End customer is deceased.
     * 
     */
    @XmlEnumValue("MD07")
    MD_07("MD07"),

    /**
     * Settlement of the transaction has failed.
     * 
     */
    @XmlEnumValue("ED05")
    ED_05("ED05"),

    /**
     * Reason is provided as narrative information in the additional reason information.
     * 
     */
    NARR("NARR");
    private final String value;

    TransactionRejectReason2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionRejectReason2Code fromValue(String v) {
        for (TransactionRejectReason2Code c: TransactionRejectReason2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
