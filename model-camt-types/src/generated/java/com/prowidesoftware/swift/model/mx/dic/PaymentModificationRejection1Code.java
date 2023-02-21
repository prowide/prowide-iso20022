
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentModificationRejection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentModificationRejection1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UM01"/&gt;
 *     &lt;enumeration value="UM02"/&gt;
 *     &lt;enumeration value="UM03"/&gt;
 *     &lt;enumeration value="UM04"/&gt;
 *     &lt;enumeration value="UM05"/&gt;
 *     &lt;enumeration value="UM06"/&gt;
 *     &lt;enumeration value="UM07"/&gt;
 *     &lt;enumeration value="UM08"/&gt;
 *     &lt;enumeration value="UM09"/&gt;
 *     &lt;enumeration value="UM10"/&gt;
 *     &lt;enumeration value="UM11"/&gt;
 *     &lt;enumeration value="UM12"/&gt;
 *     &lt;enumeration value="UM13"/&gt;
 *     &lt;enumeration value="UM14"/&gt;
 *     &lt;enumeration value="UM15"/&gt;
 *     &lt;enumeration value="UM16"/&gt;
 *     &lt;enumeration value="UM17"/&gt;
 *     &lt;enumeration value="UM18"/&gt;
 *     &lt;enumeration value="UM19"/&gt;
 *     &lt;enumeration value="UM20"/&gt;
 *     &lt;enumeration value="UM21"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentModificationRejection1Code")
@XmlEnum
public enum PaymentModificationRejection1Code {


    /**
     * RelatedReference cannot be modified.
     * 
     */
    @XmlEnumValue("UM01")
    UM_01("UM01"),

    /**
     * BankOperationCode cannot be modified.
     * 
     */
    @XmlEnumValue("UM02")
    UM_02("UM02"),

    /**
     * InstructionCode cannot be modified.
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
     * ValueDate cannot be modified.
     * 
     */
    @XmlEnumValue("UM05")
    UM_05("UM05"),

    /**
     * InterbankSettlementAccount cannot be modified.
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
     * ReceiverCorrespondent cannot be modified.
     * 
     */
    @XmlEnumValue("UM09")
    UM_09("UM09"),

    /**
     * ThirdReimbursementInstitution cannot be modified.
     * 
     */
    @XmlEnumValue("UM10")
    UM_10("UM10"),

    /**
     * PaymentScheme cannot be modified.
     * 
     */
    @XmlEnumValue("UM11")
    UM_11("UM11"),

    /**
     * AccountOfBeneficiaryInstitution cannot be modified.
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
     * CreditorAccount cannot be modified.
     * 
     */
    @XmlEnumValue("UM14")
    UM_14("UM14"),

    /**
     * RemittanceInformation cannot be modified.
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
     * DetailsOfCharges cannot be modified.
     * 
     */
    @XmlEnumValue("UM17")
    UM_17("UM17"),

    /**
     * SenderToReceiver cannot be modified.
     * 
     */
    @XmlEnumValue("UM18")
    UM_18("UM18"),

    /**
     * InstructionForFinalAgent cannot be modified.
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
    UM_21("UM21");
    private final String value;

    PaymentModificationRejection1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentModificationRejection1Code fromValue(String v) {
        for (PaymentModificationRejection1Code c: PaymentModificationRejection1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
