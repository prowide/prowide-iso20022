
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RangeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="D2T7"/&gt;
 *     &lt;enumeration value="D829"/&gt;
 *     &lt;enumeration value="LS1D"/&gt;
 *     &lt;enumeration value="A30D"/&gt;
 *     &lt;enumeration value="YMS2"/&gt;
 *     &lt;enumeration value="YMN3"/&gt;
 *     &lt;enumeration value="LT3M"/&gt;
 *     &lt;enumeration value="LT1M"/&gt;
 *     &lt;enumeration value="LT1Y"/&gt;
 *     &lt;enumeration value="LT2Y"/&gt;
 *     &lt;enumeration value="LT3Y"/&gt;
 *     &lt;enumeration value="LT5Y"/&gt;
 *     &lt;enumeration value="CYTD"/&gt;
 *     &lt;enumeration value="YMS1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RangeType1Code")
@XmlEnum
public enum RangeType1Code {


    /**
     * Period starting from 2 days after the reporting end date and continuing up to 7 days.
     * 
     */
    @XmlEnumValue("D2T7")
    D_2_T_7("D2T7"),

    /**
     * Period starting from 8 days after the reporting end date and continuing up to 29 days.
     * 
     */
    @XmlEnumValue("D829")
    D_829("D829"),

    /**
     * Period starting from the reporting end date and continuing up to 1 day (including).
     * 
     */
    @XmlEnumValue("LS1D")
    LS_1_D("LS1D"),

    /**
     * Period starting from 30 days after the reporting end date.
     * 
     */
    @XmlEnumValue("A30D")
    A_30_D("A30D"),

    /**
     * Period, starting from the beginning of the n-2 calendar year and continuing up to the end of that year.
     * 
     */
    @XmlEnumValue("YMS2")
    YMS_2("YMS2"),

    /**
     * Period, starting from the beginning of the n-3 calendar year and continuing up to the end of that year.
     * 
     */
    @XmlEnumValue("YMN3")
    YMN_3("YMN3"),

    /**
     * Period starting from 3 months before the reporting end date and continuing up to the reporting end date.
     * 
     */
    @XmlEnumValue("LT3M")
    LT_3_M("LT3M"),

    /**
     * Period starting from 1 month before the reporting end date and continuing up to the reporting end date.
     * 
     */
    @XmlEnumValue("LT1M")
    LT_1_M("LT1M"),

    /**
     * Period starting from 1 year before the reporting end date and continuing up to the reporting end date.
     * 
     */
    @XmlEnumValue("LT1Y")
    LT_1_Y("LT1Y"),

    /**
     * Period starting from 2 years before the reporting end date and continuing up to the reporting end date.
     * 
     */
    @XmlEnumValue("LT2Y")
    LT_2_Y("LT2Y"),

    /**
     * Period starting from 3 years before the reporting end date and continuing up to the reporting end date.
     * 
     */
    @XmlEnumValue("LT3Y")
    LT_3_Y("LT3Y"),

    /**
     * Period starting from 5 years before the reporting end date and continuing up to the reporting end date.
     * 
     */
    @XmlEnumValue("LT5Y")
    LT_5_Y("LT5Y"),

    /**
     * Period, starting from the beginning of the current calendar year and continuing up to the reporting end date.
     * 
     */
    CYTD("CYTD"),

    /**
     * Period, starting from the beginning of the last calendar year and continuing up to the end of that year.
     * 
     */
    @XmlEnumValue("YMS1")
    YMS_1("YMS1");
    private final String value;

    RangeType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RangeType1Code fromValue(String v) {
        for (RangeType1Code c: RangeType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
