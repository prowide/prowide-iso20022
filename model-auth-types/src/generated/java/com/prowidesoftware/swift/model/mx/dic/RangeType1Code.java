
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RangeType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="D2T7"/>
 *     <enumeration value="D829"/>
 *     <enumeration value="LS1D"/>
 *     <enumeration value="A30D"/>
 *     <enumeration value="YMS2"/>
 *     <enumeration value="YMN3"/>
 *     <enumeration value="LT3M"/>
 *     <enumeration value="LT1M"/>
 *     <enumeration value="LT1Y"/>
 *     <enumeration value="LT2Y"/>
 *     <enumeration value="LT3Y"/>
 *     <enumeration value="LT5Y"/>
 *     <enumeration value="CYTD"/>
 *     <enumeration value="YMS1"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
