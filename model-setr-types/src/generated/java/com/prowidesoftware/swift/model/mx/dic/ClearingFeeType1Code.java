
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingFeeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ClearingFeeType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CBOE"/>
 *     <enumeration value="NONM"/>
 *     <enumeration value="EQCL"/>
 *     <enumeration value="FUAS"/>
 *     <enumeration value="JANF"/>
 *     <enumeration value="GICI"/>
 *     <enumeration value="LESF"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="YTR1"/>
 *     <enumeration value="YTR2"/>
 *     <enumeration value="YTR3"/>
 *     <enumeration value="YTR4"/>
 *     <enumeration value="YTR5"/>
 *     <enumeration value="NYTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClearingFeeType1Code")
@XmlEnum
public enum ClearingFeeType1Code {


    /**
     * Member of the Chicago Board Of Exchange.
     * 
     */
    CBOE("CBOE"),

    /**
     * Non-member and customer.
     * 
     */
    NONM("NONM"),

    /**
     * Equity member and clearing member.
     * 
     */
    EQCL("EQCL"),

    /**
     * Full and associate member trading for own account and as floor brokers.
     * 
     */
    FUAS("FUAS"),

    /**
     *  106.J and 106.H Firms.
     * 
     */
    JANF("JANF"),

    /**
     * GIM, IDEM and COM Membership Interest Holders.
     * 
     */
    GICI("GICI"),

    /**
     * Lessee and 106.F Employees.
     * 
     */
    LESF("LESF"),

    /**
     * Miscellaneous type of clearing membership.
     * 
     */
    OTHR("OTHR"),

    /**
     * First year delegate trading for his own account.
     * 
     */
    @XmlEnumValue("YTR1")
    YTR_1("YTR1"),

    /**
     * Second year delegate trading for his own account.
     * 
     */
    @XmlEnumValue("YTR2")
    YTR_2("YTR2"),

    /**
     * Third year delegate trading for his own account.
     * 
     */
    @XmlEnumValue("YTR3")
    YTR_3("YTR3"),

    /**
     * Fourth year delegate trading for his own account.
     * 
     */
    @XmlEnumValue("YTR4")
    YTR_4("YTR4"),

    /**
     * Fifth year delegate trading for his own account.
     * 
     */
    @XmlEnumValue("YTR5")
    YTR_5("YTR5"),

    /**
     * Sixth year and beyond delegate trading for his own account.
     * 
     */
    NYTR("NYTR");
    private final String value;

    ClearingFeeType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClearingFeeType1Code fromValue(String v) {
        for (ClearingFeeType1Code c: ClearingFeeType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
