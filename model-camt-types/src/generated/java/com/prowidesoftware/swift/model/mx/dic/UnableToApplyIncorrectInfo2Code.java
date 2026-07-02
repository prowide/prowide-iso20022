
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnableToApplyIncorrectInfo2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnableToApplyIncorrectInfo2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IN01"/&gt;
 *     &lt;enumeration value="IN02"/&gt;
 *     &lt;enumeration value="IN03"/&gt;
 *     &lt;enumeration value="IN04"/&gt;
 *     &lt;enumeration value="IN05"/&gt;
 *     &lt;enumeration value="IN06"/&gt;
 *     &lt;enumeration value="IN07"/&gt;
 *     &lt;enumeration value="IN08"/&gt;
 *     &lt;enumeration value="IN09"/&gt;
 *     &lt;enumeration value="IN10"/&gt;
 *     &lt;enumeration value="IN11"/&gt;
 *     &lt;enumeration value="IN12"/&gt;
 *     &lt;enumeration value="IN13"/&gt;
 *     &lt;enumeration value="IN14"/&gt;
 *     &lt;enumeration value="IN15"/&gt;
 *     &lt;enumeration value="IN16"/&gt;
 *     &lt;enumeration value="IN17"/&gt;
 *     &lt;enumeration value="IN18"/&gt;
 *     &lt;enumeration value="IN19"/&gt;
 *     &lt;enumeration value="MM20"/&gt;
 *     &lt;enumeration value="MM21"/&gt;
 *     &lt;enumeration value="MM22"/&gt;
 *     &lt;enumeration value="MM23"/&gt;
 *     &lt;enumeration value="MM24"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnableToApplyIncorrectInfo2Code")
@XmlEnum
public enum UnableToApplyIncorrectInfo2Code {


    /**
     * RelatedReference is incorrect.
     * 
     */
    @XmlEnumValue("IN01")
    IN_01("IN01"),

    /**
     * BankOperationCode is incorrect.
     * 
     */
    @XmlEnumValue("IN02")
    IN_02("IN02"),

    /**
     * InstructionCode is incorrect.
     * 
     */
    @XmlEnumValue("IN03")
    IN_03("IN03"),

    /**
     * RequestedExecutionDate is incorrect.
     * 
     */
    @XmlEnumValue("IN04")
    IN_04("IN04"),

    /**
     * ValueDate is incorrect.
     * 
     */
    @XmlEnumValue("IN05")
    IN_05("IN05"),

    /**
     * InterbankSettledAmount is incorrect.
     * 
     */
    @XmlEnumValue("IN06")
    IN_06("IN06"),

    /**
     * Debtor is incorrect.
     * 
     */
    @XmlEnumValue("IN07")
    IN_07("IN07"),

    /**
     * DebtorAccount is incorrect.
     * 
     */
    @XmlEnumValue("IN08")
    IN_08("IN08"),

    /**
     * ReceiverCorrespondent is incorrect.
     * 
     */
    @XmlEnumValue("IN09")
    IN_09("IN09"),

    /**
     * ThirdReimbursementInstitution is incorrect.
     * 
     */
    @XmlEnumValue("IN10")
    IN_10("IN10"),

    /**
     * PaymentScheme is incorrect.
     * 
     */
    @XmlEnumValue("IN11")
    IN_11("IN11"),

    /**
     * AccountOfBeneficiaryInstitution is incorrect.
     * 
     */
    @XmlEnumValue("IN12")
    IN_12("IN12"),

    /**
     * Creditor is incorrect.
     * 
     */
    @XmlEnumValue("IN13")
    IN_13("IN13"),

    /**
     * CreditorAccount is incorrect.
     * 
     */
    @XmlEnumValue("IN14")
    IN_14("IN14"),

    /**
     * RemittanceInformation is incorrect.
     * 
     */
    @XmlEnumValue("IN15")
    IN_15("IN15"),

    /**
     * PaymentPurpose is incorrect.
     * 
     */
    @XmlEnumValue("IN16")
    IN_16("IN16"),

    /**
     * DetailsOfCharges is incorrect.
     * 
     */
    @XmlEnumValue("IN17")
    IN_17("IN17"),

    /**
     * SenderToReceiverInformation is incorrect.
     * 
     */
    @XmlEnumValue("IN18")
    IN_18("IN18"),

    /**
     * InstructionForFinalAgent is incorrect.
     * 
     */
    @XmlEnumValue("IN19")
    IN_19("IN19"),

    /**
     * Name and Account of Creditor mismatched.
     * 
     */
    @XmlEnumValue("MM20")
    MM_20("MM20"),

    /**
     * Name and Account of Debtor mismatched.
     * 
     */
    @XmlEnumValue("MM21")
    MM_21("MM21"),

    /**
     * Name and Account of FinalAgent mismatched.
     * 
     */
    @XmlEnumValue("MM22")
    MM_22("MM22"),

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

    UnableToApplyIncorrectInfo2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnableToApplyIncorrectInfo2Code fromValue(String v) {
        for (UnableToApplyIncorrectInfo2Code c: UnableToApplyIncorrectInfo2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
