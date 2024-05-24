
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PensionSchemeType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PensionSchemeType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AAVC"/>
 *     <enumeration value="DBEN"/>
 *     <enumeration value="EXPP"/>
 *     <enumeration value="FAVC"/>
 *     <enumeration value="GPPS"/>
 *     <enumeration value="SIPG"/>
 *     <enumeration value="STKG"/>
 *     <enumeration value="IPST"/>
 *     <enumeration value="STKI"/>
 *     <enumeration value="OTPM"/>
 *     <enumeration value="OCDC"/>
 *     <enumeration value="PPNS"/>
 *     <enumeration value="EPKA"/>
 *     <enumeration value="ITPO"/>
 *     <enumeration value="REAN"/>
 *     <enumeration value="SC32"/>
 *     <enumeration value="S32A"/>
 *     <enumeration value="SIPP"/>
 *     <enumeration value="SSAS"/>
 *     <enumeration value="NWRP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PensionSchemeType3Code")
@XmlEnum
public enum PensionSchemeType3Code {


    /**
     * Pension plan is an additional voluntary contribution plan.
     * 
     */
    AAVC("AAVC"),

    /**
     * Pension plan is a defined benefit plan.
     * 
     */
    DBEN("DBEN"),

    /**
     * Pension plan is an executive pension plan.
     * 
     */
    EXPP("EXPP"),

    /**
     * Pension plan is a free standing additional voluntary contribution plan.
     * 
     */
    FAVC("FAVC"),

    /**
     * Pension is a group personal pension.
     * 
     */
    GPPS("GPPS"),

    /**
     * Pension plan is a group self-invested pension plan.
     * 
     */
    SIPG("SIPG"),

    /**
     * Pension plan is a group stakeholder pension plan.
     * 
     */
    STKG("STKG"),

    /**
     * Pension is an individual pension savings plan with a tax benefit. This is known as an Individual Pension Schema (IPS) in some markets.
     * 
     */
    IPST("IPST"),

    /**
     * Pension plan is an individual stakeholder pension.
     * 
     */
    STKI("STKI"),

    /**
     * Pension is a mandatory occupational pension. This is known as an Obligatory Occupation Pension (OTP) in some markets.
     * 
     */
    OTPM("OTPM"),

    /**
     * Pension plan is an occupational defined contribution plan.
     * 
     */
    OCDC("OCDC"),

    /**
     * Pension is a personal pension plan.
     * 
     */
    PPNS("PPNS"),

    /**
     * Pension is a personal pension account. This is known as Employee Pension Kapital (EPK) in some markets.
     * 
     */
    EPKA("EPKA"),

    /**
     * Pension is a private occupational pension. This is known as an industrial and trade supplementary pension (ITP) in some markets.
     * 
     */
    ITPO("ITPO"),

    /**
     * Pension plan is a retirement annuity.
     * 
     */
    REAN("REAN"),

    /**
     * Pension type covered by section 32.
     * 
     */
    @XmlEnumValue("SC32")
    SC_32("SC32"),

    /**
     * Pension type covered by section 32A.
     * 
     */
    @XmlEnumValue("S32A")
    S_32_A("S32A"),

    /**
     * Pension is a self-invested personal pension plan.
     * 
     */
    SIPP("SIPP"),

    /**
     * Pension is a small self-administered pension scheme.
     * 
     */
    SSAS("SSAS"),

    /**
     * Indicates that the party does not operate the pension wrapper.
     * 
     */
    NWRP("NWRP");
    private final String value;

    PensionSchemeType3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PensionSchemeType3Code fromValue(String v) {
        for (PensionSchemeType3Code c: PensionSchemeType3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
