
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingFeeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClearingFeeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CBOE"/&gt;
 *     &lt;enumeration value="NONM"/&gt;
 *     &lt;enumeration value="EQCL"/&gt;
 *     &lt;enumeration value="FUAS"/&gt;
 *     &lt;enumeration value="JANF"/&gt;
 *     &lt;enumeration value="GICI"/&gt;
 *     &lt;enumeration value="LESF"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="YTR1"/&gt;
 *     &lt;enumeration value="YTR2"/&gt;
 *     &lt;enumeration value="YTR3"/&gt;
 *     &lt;enumeration value="YTR4"/&gt;
 *     &lt;enumeration value="YTR5"/&gt;
 *     &lt;enumeration value="NYTR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
