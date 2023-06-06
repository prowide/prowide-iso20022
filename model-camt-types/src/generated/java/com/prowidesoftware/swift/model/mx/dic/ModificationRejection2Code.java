
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationRejection2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ModificationRejection2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UM01"/>
 *     <enumeration value="UM02"/>
 *     <enumeration value="UM03"/>
 *     <enumeration value="UM04"/>
 *     <enumeration value="UM05"/>
 *     <enumeration value="UM06"/>
 *     <enumeration value="UM07"/>
 *     <enumeration value="UM08"/>
 *     <enumeration value="UM09"/>
 *     <enumeration value="UM10"/>
 *     <enumeration value="UM11"/>
 *     <enumeration value="UM12"/>
 *     <enumeration value="UM13"/>
 *     <enumeration value="UM14"/>
 *     <enumeration value="UM15"/>
 *     <enumeration value="UM16"/>
 *     <enumeration value="UM17"/>
 *     <enumeration value="UM18"/>
 *     <enumeration value="UM19"/>
 *     <enumeration value="UM20"/>
 *     <enumeration value="UM21"/>
 *     <enumeration value="UM22"/>
 *     <enumeration value="UM23"/>
 *     <enumeration value="UM24"/>
 *     <enumeration value="UM25"/>
 *     <enumeration value="UM26"/>
 *     <enumeration value="UM27"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ModificationRejection2Code")
@XmlEnum
public enum ModificationRejection2Code {


    /**
     * Related transaction reference cannot be modified.
     * 
     */
    @XmlEnumValue("UM01")
    UM_01("UM01"),

    /**
     * Service level element of payment type cannot be modified(former UnableToModifyBankOperationCode).
     * 
     */
    @XmlEnumValue("UM02")
    UM_02("UM02"),

    /**
     * Category purpose element of payment type cannot be modified (former UnableToModifyInstructionCode).
     * 
     */
    @XmlEnumValue("UM03")
    UM_03("UM03"),

    /**
     * RequestedExecutionDate cannot be modified.
     * 
     */
    @XmlEnumValue("UM04")
    UM_04("UM04"),

    /**
     * InterbankSettlementDate cannot be modified (former UnableToModifyValueDate).
     * 
     */
    @XmlEnumValue("UM05")
    UM_05("UM05"),

    /**
     * SettlementAccount cannot be modified (former UnableToModifyInterbankSettlementAccount).
     * 
     */
    @XmlEnumValue("UM06")
    UM_06("UM06"),

    /**
     * Debtor cannot be modified.
     * 
     */
    @XmlEnumValue("UM07")
    UM_07("UM07"),

    /**
     * DebtorAccount cannot be modified.
     * 
     */
    @XmlEnumValue("UM08")
    UM_08("UM08"),

    /**
     * InstructedReimbursementAgent cannot be modified (former UnableToModifyReceiverCorrespondent).
     * 
     */
    @XmlEnumValue("UM09")
    UM_09("UM09"),

    /**
     * ThirdReimbursementAgent cannot be modified (former UnableToModifyThirdReimbursementInstitution).
     * 
     */
    @XmlEnumValue("UM10")
    UM_10("UM10"),

    /**
     * Clearing Channel element of payment type cannot be modified (former UnableToModifyPaymentScheme).
     * 
     */
    @XmlEnumValue("UM11")
    UM_11("UM11"),

    /**
     * Creditor agent account cannot be modified (former UnableToModifyAccountOfBeneficiaryInstitution).
     * 
     */
    @XmlEnumValue("UM12")
    UM_12("UM12"),

    /**
     * Creditor cannot be modified.
     * 
     */
    @XmlEnumValue("UM13")
    UM_13("UM13"),

    /**
     * Creditor account cannot be modified.
     * 
     */
    @XmlEnumValue("UM14")
    UM_14("UM14"),

    /**
     * Remittance information cannot be modified.
     * 
     */
    @XmlEnumValue("UM15")
    UM_15("UM15"),

    /**
     * PaymentPurpose cannot be modified.
     * 
     */
    @XmlEnumValue("UM16")
    UM_16("UM16"),

    /**
     * Charge bearer cannot be modified (former UnableToModifyDetailsOfCharges).
     * 
     */
    @XmlEnumValue("UM17")
    UM_17("UM17"),

    /**
     * Instruction for next agent cannot be modified (former UnableToModifySenderToReceiver).
     * 
     */
    @XmlEnumValue("UM18")
    UM_18("UM18"),

    /**
     * Instruction for creditor agent cannot be modified. (former UnableToModifyInstructionForFinalAgent).
     * 
     */
    @XmlEnumValue("UM19")
    UM_19("UM19"),

    /**
     * Used to inform of cancellation and request a new payment instruction. This should only be used if an agent does not want to modify a pending payment.
     * 
     */
    @XmlEnumValue("UM20")
    UM_20("UM20"),

    /**
     * Modification is not possible and the cancellation is requested.
     * 
     */
    @XmlEnumValue("UM21")
    UM_21("UM21"),

    /**
     * Debtor agent account cannot be modified (applicable for direct debits).
     * 
     */
    @XmlEnumValue("UM22")
    UM_22("UM22"),

    /**
     * Interbank settlement amount cannot be modified.
     * 
     */
    @XmlEnumValue("UM23")
    UM_23("UM23"),

    /**
     * Instruction for debtor agent cannot be modified (applicable for direct debits).
     * 
     */
    @XmlEnumValue("UM24")
    UM_24("UM24"),

    /**
     * Requested collection date cannot be modified (applicable for direct debits).
     * 
     */
    @XmlEnumValue("UM25")
    UM_25("UM25"),

    /**
     * Payment type cannot be modified.
     * 
     */
    @XmlEnumValue("UM26")
    UM_26("UM26"),

    /**
     * Instructed or equivalent amount cannot be modified.
     * 
     */
    @XmlEnumValue("UM27")
    UM_27("UM27");
    private final String value;

    ModificationRejection2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModificationRejection2Code fromValue(String v) {
        for (ModificationRejection2Code c: ModificationRejection2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
