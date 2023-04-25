
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnableToApplyMissingInfo1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnableToApplyMissingInfo1Code">
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
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnableToApplyMissingInfo1Code")
@XmlEnum
public enum UnableToApplyMissingInfo1Code {


    /**
     * RemittanceInformation is missing.
     * 
     */
    @XmlEnumValue("MS01")
    MS_01("MS01"),

    /**
     * SenderToReceiverInformation is missing.
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
     * FirstAgent is missing.
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
     * Nostro_VostroAccount is missing.
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
     * ReimbursementAgent (53) is missing.
     * 
     */
    @XmlEnumValue("MS09")
    MS_09("MS09"),

    /**
     * ReimbursementAgent (54) is missing.
     * 
     */
    @XmlEnumValue("MS10")
    MS_10("MS10"),

    /**
     * ReimbursementAgent (55) is missing.
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
     * Indicates the payment instruction (MT103) is missing.
     * 
     */
    @XmlEnumValue("MS14")
    MS_14("MS14");
    private final String value;

    UnableToApplyMissingInfo1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnableToApplyMissingInfo1Code fromValue(String v) {
        for (UnableToApplyMissingInfo1Code c: UnableToApplyMissingInfo1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
