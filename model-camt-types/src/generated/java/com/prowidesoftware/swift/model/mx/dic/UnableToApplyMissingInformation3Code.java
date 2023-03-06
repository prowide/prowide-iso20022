
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnableToApplyMissingInformation3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnableToApplyMissingInformation3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MS01"/&gt;
 *     &lt;enumeration value="MS02"/&gt;
 *     &lt;enumeration value="MS03"/&gt;
 *     &lt;enumeration value="MS04"/&gt;
 *     &lt;enumeration value="MS05"/&gt;
 *     &lt;enumeration value="MS06"/&gt;
 *     &lt;enumeration value="MS07"/&gt;
 *     &lt;enumeration value="MS08"/&gt;
 *     &lt;enumeration value="MS09"/&gt;
 *     &lt;enumeration value="MS10"/&gt;
 *     &lt;enumeration value="MS11"/&gt;
 *     &lt;enumeration value="MS12"/&gt;
 *     &lt;enumeration value="MS13"/&gt;
 *     &lt;enumeration value="MS14"/&gt;
 *     &lt;enumeration value="MS15"/&gt;
 *     &lt;enumeration value="MS16"/&gt;
 *     &lt;enumeration value="MS17"/&gt;
 *     &lt;enumeration value="NARR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnableToApplyMissingInformation3Code")
@XmlEnum
public enum UnableToApplyMissingInformation3Code {


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
    MS_17("MS17"),

    /**
     * See narrative field for additional information.
     * 
     */
    NARR("NARR");
    private final String value;

    UnableToApplyMissingInformation3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnableToApplyMissingInformation3Code fromValue(String v) {
        for (UnableToApplyMissingInformation3Code c: UnableToApplyMissingInformation3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
