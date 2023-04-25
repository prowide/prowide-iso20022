
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnableToApplyMissingInformation2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnableToApplyMissingInformation2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MS01"/>
 *     <enumeration value="MS02"/>
 *     <enumeration value="MS03"/>
 *     <enumeration value="MS04"/>
 *     <enumeration value="MS05"/>
 *     <enumeration value="MS06"/>
 *     <enumeration value="MS07"/>
 *     <enumeration value="MS08"/>
 *     <enumeration value="MS09"/>
 *     <enumeration value="MS10"/>
 *     <enumeration value="MS11"/>
 *     <enumeration value="MS12"/>
 *     <enumeration value="MS13"/>
 *     <enumeration value="MS14"/>
 *     <enumeration value="MS15"/>
 *     <enumeration value="MS16"/>
 *     <enumeration value="MS17"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnableToApplyMissingInformation2Code")
@XmlEnum
public enum UnableToApplyMissingInformation2Code {


    /**
     * RemittanceInformation is missing.
     * 
     */
    @XmlEnumValue("MS01")
    MS_01("MS01"),

    /**
     * Instruction for next agent is missing (former MissingSenderToReceiverInformation split into debtor, credit and next agent information).
     * 
     */
    @XmlEnumValue("MS02")
    MS_02("MS02"),

    /**
     * Debtor is missing.
     * 
     */
    @XmlEnumValue("MS03")
    MS_03("MS03"),

    /**
     * DebtorAccount is missing.
     * 
     */
    @XmlEnumValue("MS04")
    MS_04("MS04"),

    /**
     * DebtorAgent is missing (former MissingFirstAgent for credit transfers).
     * 
     */
    @XmlEnumValue("MS05")
    MS_05("MS05"),

    /**
     * Amount is missing.
     * 
     */
    @XmlEnumValue("MS06")
    MS_06("MS06"),

    /**
     * SettlementAccount is missing. (former MissingNostroVostroAccount).
     * 
     */
    @XmlEnumValue("MS07")
    MS_07("MS07"),

    /**
     * Intermediary is missing.
     * 
     */
    @XmlEnumValue("MS08")
    MS_08("MS08"),

    /**
     * InstructingReimbursementAgent is missing (former MissingReimbursementAgent1).
     * 
     */
    @XmlEnumValue("MS09")
    MS_09("MS09"),

    /**
     * InstructedReimbursementAgent is missing (former MissingReimbursementAgent2).
     * 
     */
    @XmlEnumValue("MS10")
    MS_10("MS10"),

    /**
     * Third reimbursement agent is missing (former MissingReimbursementAgent).
     * 
     */
    @XmlEnumValue("MS11")
    MS_11("MS11"),

    /**
     * Creditor is missing.
     * 
     */
    @XmlEnumValue("MS12")
    MS_12("MS12"),

    /**
     * CreditorAccount is missing.
     * 
     */
    @XmlEnumValue("MS13")
    MS_13("MS13"),

    /**
     * Indicates the payment instruction is missing.
     * 
     */
    @XmlEnumValue("MS14")
    MS_14("MS14"),

    /**
     * Creditor agent is missing (former MissingFirstAgent for direct debits).
     * 
     */
    @XmlEnumValue("MS15")
    MS_15("MS15"),

    /**
     * Instruction for creditor agent is missing (former MissingSenderToReceiverInformation split into debtor, credit and next agent information).
     * 
     */
    @XmlEnumValue("MS16")
    MS_16("MS16"),

    /**
     * Instruction for debtor agent is missing (former MissingSenderToReceiverInformation split into debtor, credit and next agent information).
     * 
     */
    @XmlEnumValue("MS17")
    MS_17("MS17");
    private final String value;

    UnableToApplyMissingInformation2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnableToApplyMissingInformation2Code fromValue(String v) {
        for (UnableToApplyMissingInformation2Code c: UnableToApplyMissingInformation2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
