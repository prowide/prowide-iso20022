
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancingStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancingStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CA01"/>
 *     <enumeration value="CA02"/>
 *     <enumeration value="AC01"/>
 *     <enumeration value="AC04"/>
 *     <enumeration value="AC06"/>
 *     <enumeration value="BE08"/>
 *     <enumeration value="BE09"/>
 *     <enumeration value="BE10"/>
 *     <enumeration value="BE11"/>
 *     <enumeration value="DT02"/>
 *     <enumeration value="ID01"/>
 *     <enumeration value="ID02"/>
 *     <enumeration value="ID03"/>
 *     <enumeration value="MI01"/>
 *     <enumeration value="NA01"/>
 *     <enumeration value="CA03"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinancingStatusReason1Code")
@XmlEnum
public enum FinancingStatusReason1Code {


    /**
     * Cancellation request message was received after the end of the financing process previously activated.
     * 
     */
    @XmlEnumValue("CA01")
    CA_01("CA01"),

    /**
     * Cancellation request does not match with an invoice financing request received previously.
     * 
     */
    @XmlEnumValue("CA02")
    CA_02("CA02"),

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
     * Party who sent the request message is not recognised by the first agent.
     * 
     */
    @XmlEnumValue("BE08")
    BE_08("BE08"),

    /**
     * Party who forwarded the request message is not recognised by the first agent.
     * 
     */
    @XmlEnumValue("BE09")
    BE_09("BE09"),

    /**
     * Financing Requestor is expected to send requests through a different Intermediary Agent.
     * 
     */
    @XmlEnumValue("BE10")
    BE_10("BE10"),

    /**
     * Party is not recognised by the first agent.
     * 
     */
    @XmlEnumValue("BE11")
    BE_11("BE11"),

    /**
     * PaymentDueDate is occurring before the request message creation date.
     * 
     */
    @XmlEnumValue("DT02")
    DT_02("DT02"),

    /**
     * Request message received appears to have been duplicated.
     * 
     */
    @XmlEnumValue("ID01")
    ID_01("ID01"),

    /**
     * Request message received appears to have a wrong identification.
     * 
     */
    @XmlEnumValue("ID02")
    ID_02("ID02"),

    /**
     * Document number is invalid.
     * 
     */
    @XmlEnumValue("ID03")
    ID_03("ID03"),

    /**
     * Information bilateral agreed as mandatory is missing.
     * 
     */
    @XmlEnumValue("MI01")
    MI_01("MI01"),

    /**
     * Reason is provided as narrative information in the additional reason information.
     * 
     */
    @XmlEnumValue("NA01")
    NA_01("NA01"),

    /**
     * Cancellation request was correctly received but the financing process has already been initiated.
     * 
     */
    @XmlEnumValue("CA03")
    CA_03("CA03");
    private final String value;

    FinancingStatusReason1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FinancingStatusReason1Code fromValue(String v) {
        for (FinancingStatusReason1Code c: FinancingStatusReason1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
