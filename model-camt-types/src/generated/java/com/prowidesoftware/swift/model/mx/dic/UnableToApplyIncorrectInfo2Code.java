
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnableToApplyIncorrectInfo2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnableToApplyIncorrectInfo2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IN01"/>
 *     <enumeration value="IN02"/>
 *     <enumeration value="IN03"/>
 *     <enumeration value="IN04"/>
 *     <enumeration value="IN05"/>
 *     <enumeration value="IN06"/>
 *     <enumeration value="IN07"/>
 *     <enumeration value="IN08"/>
 *     <enumeration value="IN09"/>
 *     <enumeration value="IN10"/>
 *     <enumeration value="IN11"/>
 *     <enumeration value="IN12"/>
 *     <enumeration value="IN13"/>
 *     <enumeration value="IN14"/>
 *     <enumeration value="IN15"/>
 *     <enumeration value="IN16"/>
 *     <enumeration value="IN17"/>
 *     <enumeration value="IN18"/>
 *     <enumeration value="IN19"/>
 *     <enumeration value="MM20"/>
 *     <enumeration value="MM21"/>
 *     <enumeration value="MM22"/>
 *     <enumeration value="MM23"/>
 *     <enumeration value="MM24"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
