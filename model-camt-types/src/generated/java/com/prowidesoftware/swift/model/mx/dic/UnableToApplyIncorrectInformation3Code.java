
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnableToApplyIncorrectInformation3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnableToApplyIncorrectInformation3Code"&gt;
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
 *     &lt;enumeration value="MM25"/&gt;
 *     &lt;enumeration value="MM26"/&gt;
 *     &lt;enumeration value="MM27"/&gt;
 *     &lt;enumeration value="MM28"/&gt;
 *     &lt;enumeration value="MM29"/&gt;
 *     &lt;enumeration value="MM30"/&gt;
 *     &lt;enumeration value="MM31"/&gt;
 *     &lt;enumeration value="MM32"/&gt;
 *     &lt;enumeration value="IN33"/&gt;
 *     &lt;enumeration value="MM34"/&gt;
 *     &lt;enumeration value="MM35"/&gt;
 *     &lt;enumeration value="IN36"/&gt;
 *     &lt;enumeration value="IN37"/&gt;
 *     &lt;enumeration value="IN38"/&gt;
 *     &lt;enumeration value="IN39"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnableToApplyIncorrectInformation3Code")
@XmlEnum
public enum UnableToApplyIncorrectInformation3Code {


    /**
     * Related transaction reference is incorrect.
     * 
     */
    @XmlEnumValue("IN01")
    IN_01("IN01"),

    /**
     * Payment type service level is incorrect (former IncorrectBankOperationCode).
     * 
     */
    @XmlEnumValue("IN02")
    IN_02("IN02"),

    /**
     * Payment type category purpose is incorrect (former IncorrectInstructionCode).
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
     * Interbank settlement date is incorrect (former IncorrectValueDate).
     * 
     */
    @XmlEnumValue("IN05")
    IN_05("IN05"),

    /**
     * Interbank settlement amount is incorrect (former IncorrectSettledAmount).
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
     * InstructedReimbursementAgent is incorrect (former IncorrectReceiverCorrespondent).
     * 
     */
    @XmlEnumValue("IN09")
    IN_09("IN09"),

    /**
     * ThirdReimbursementAgent is incorrect (former IncorrectThirdReimbursementInstitution).
     * 
     */
    @XmlEnumValue("IN10")
    IN_10("IN10"),

    /**
     * Payment type clearing channel is incorrect (former PaymentScheme).
     * 
     */
    @XmlEnumValue("IN11")
    IN_11("IN11"),

    /**
     * CreditorAgentAccount is incorrect (former IncorrectAccountOfBeneficiaryInstitution).
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
     * Creditor account is incorrect.
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
     * Transaction payment purpose is incorrect.
     * 
     */
    @XmlEnumValue("IN16")
    IN_16("IN16"),

    /**
     * ChargeBearer is incorrect (former IncorrectDetailsOfCharges).
     * 
     */
    @XmlEnumValue("IN17")
    IN_17("IN17"),

    /**
     * Instruction for next agent is incorrect (former IncorrectSenderToReceiverInformation).
     * 
     */
    @XmlEnumValue("IN18")
    IN_18("IN18"),

    /**
     * Instruction for creditor agent is incorrect (former IncorrectInstructionForFinalAgent).
     * 
     */
    @XmlEnumValue("IN19")
    IN_19("IN19"),

    /**
     * Name and account of creditor are not matching.
     * 
     */
    @XmlEnumValue("MM20")
    MM_20("MM20"),

    /**
     * Name and account of debtor are not matching.
     * 
     */
    @XmlEnumValue("MM21")
    MM_21("MM21"),

    /**
     * Name and account of creditor agent (former FinalAgent) are not matching.
     * 
     */
    @XmlEnumValue("MM22")
    MM_22("MM22"),

    /**
     * Payment is pending execution. For reasons of regulatory requirements we request further information on the account number or unique identification of the debtor.
     * 
     */
    @XmlEnumValue("MM25")
    MM_25("MM25"),

    /**
     * Payment is pending execution. For reasons of regulatory requirements we request further information on the name and/or address of the debtor.
     * 
     */
    @XmlEnumValue("MM26")
    MM_26("MM26"),

    /**
     * Payment has been executed. For reasons of regulatory requirements we request further information on the account number or unique identification of the debtor.
     * 
     */
    @XmlEnumValue("MM27")
    MM_27("MM27"),

    /**
     * Payment has been executed. For reasons of regulatory requirements we request further information on the name and/or address of the debtor.
     * 
     */
    @XmlEnumValue("MM28")
    MM_28("MM28"),

    /**
     * Payment is pending execution. For reasons of regulatory requirements we request further information on the account number or unique identification of the creditor.
     * 
     */
    @XmlEnumValue("MM29")
    MM_29("MM29"),

    /**
     * Payment is pending execution. For reasons of regulatory requirements we request further information on the name and/or address of the creditor.
     * 
     */
    @XmlEnumValue("MM30")
    MM_30("MM30"),

    /**
     * Payment has been executed. For reasons of regulatory requirements we request further information on the account number or unique identification of the creditor.
     * 
     */
    @XmlEnumValue("MM31")
    MM_31("MM31"),

    /**
     * Payment has been executed. For reasons of regulatory requirements we request further information on the name and/or address of the creditor.
     * 
     */
    @XmlEnumValue("MM32")
    MM_32("MM32"),

    /**
     * Amount in statement entry is incorrect.
     * 
     */
    @XmlEnumValue("IN33")
    IN_33("IN33"),

    /**
     * Insufficient charges details provided.
     * 
     */
    @XmlEnumValue("MM34")
    MM_34("MM34"),

    /**
     * Payment purpose needs to be further specified.
     * 
     */
    @XmlEnumValue("MM35")
    MM_35("MM35"),

    /**
     * SettlementAccount is incorrect.
     * 
     */
    @XmlEnumValue("IN36")
    IN_36("IN36"),

    /**
     * Instructing reimbursement agent is incorrect.
     * 
     */
    @XmlEnumValue("IN37")
    IN_37("IN37"),

    /**
     * Debtor's address is incorrect.
     * 
     */
    @XmlEnumValue("IN38")
    IN_38("IN38"),

    /**
     * Creditor's address is incorrect.
     * 
     */
    @XmlEnumValue("IN39")
    IN_39("IN39");
    private final String value;

    UnableToApplyIncorrectInformation3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnableToApplyIncorrectInformation3Code fromValue(String v) {
        for (UnableToApplyIncorrectInformation3Code c: UnableToApplyIncorrectInformation3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
