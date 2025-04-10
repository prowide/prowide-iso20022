
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnableToApplyIncorrectInformation4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnableToApplyIncorrectInformation4Code">
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
 *     <enumeration value="MM25"/>
 *     <enumeration value="MM26"/>
 *     <enumeration value="MM27"/>
 *     <enumeration value="MM28"/>
 *     <enumeration value="MM29"/>
 *     <enumeration value="MM30"/>
 *     <enumeration value="MM31"/>
 *     <enumeration value="MM32"/>
 *     <enumeration value="IN33"/>
 *     <enumeration value="MM34"/>
 *     <enumeration value="MM35"/>
 *     <enumeration value="IN36"/>
 *     <enumeration value="IN37"/>
 *     <enumeration value="IN38"/>
 *     <enumeration value="IN39"/>
 *     <enumeration value="NARR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnableToApplyIncorrectInformation4Code")
@XmlEnum
public enum UnableToApplyIncorrectInformation4Code {


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
    IN_39("IN39"),

    /**
     * See narrative field for additional information.
     * 
     */
    NARR("NARR");
    private final String value;

    UnableToApplyIncorrectInformation4Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnableToApplyIncorrectInformation4Code fromValue(String v) {
        for (UnableToApplyIncorrectInformation4Code c: UnableToApplyIncorrectInformation4Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
