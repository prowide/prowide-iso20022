
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestComputationMethod4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InterestComputationMethod4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A004"/>
 *     <enumeration value="A019"/>
 *     <enumeration value="A017"/>
 *     <enumeration value="A005"/>
 *     <enumeration value="A009"/>
 *     <enumeration value="A014"/>
 *     <enumeration value="A010"/>
 *     <enumeration value="A006"/>
 *     <enumeration value="A008"/>
 *     <enumeration value="A015"/>
 *     <enumeration value="A018"/>
 *     <enumeration value="A011"/>
 *     <enumeration value="A001"/>
 *     <enumeration value="A002"/>
 *     <enumeration value="A003"/>
 *     <enumeration value="A012"/>
 *     <enumeration value="A013"/>
 *     <enumeration value="A007"/>
 *     <enumeration value="A016"/>
 *     <enumeration value="NARR"/>
 *     <enumeration value="A020"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InterestComputationMethod4Code")
@XmlEnum
public enum InterestComputationMethod4Code {


    /**
     * Method whereby interest is calculated based on the actual number of accrued days in the interest period and a 360-day year.
     * 
     */
    @XmlEnumValue("A004")
    A_004("A004"),

    /**
     * Method whereby interest is calculated based on the actual number of accrued days in the interest period, excluding any leap day from the count, and a 360-day year.
     * 
     */
    @XmlEnumValue("A019")
    A_019("A019"),

    /**
     * Method whereby interest is calculated based on the actual number of accrued days in the interest period divided by 364.
     * Method equal to Act364 in the FixML model.
     * 
     */
    @XmlEnumValue("A017")
    A_017("A017"),

    /**
     * Method whereby interest is calculated based on the actual number of accrued days in the interest period and a 365-day year.
     * 
     */
    @XmlEnumValue("A005")
    A_005("A005"),

    /**
     * Method whereby interest is calculated based on the actual number of accrued days and a 365-day year (if the coupon payment date is NOT in a leap year) or a 366-day year (if the coupon payment date is in a leap year).
     * 
     */
    @XmlEnumValue("A009")
    A_009("A009"),

    /**
     * Method whereby interest is calculated based on the actual number of accrued days in the interest period, excluding any leap day from the count, and a 365-day year.
     * 
     */
    @XmlEnumValue("A014")
    A_014("A014"),

    /**
     * Method whereby interest is calculated based on the actual number of accrued days and a 366-day year (if 29 Feb falls in the coupon period) or a 365-day year (if 29 Feb does not fall in the coupon period). If a coupon period is longer than one year, it is split by repetitively separating full year subperiods counting backwards from the end of the coupon period (a year backwards from 28 Feb being 29 Feb, if it exists). The first of the subperiods starts on the start date of the accrued interest period and thus is possibly shorter than a year. Then the interest computation is operated separately on each subperiod and the intermediate results are summed up.
     * 
     */
    @XmlEnumValue("A010")
    A_010("A010"),

    /**
     * Method whereby interest is calculated based on the actual number of accrued days and the assumed number of days in a year, that is, the actual number of days in the coupon period multiplied by the number of interest payments in the year. If the coupon period is irregular (first or last coupon), it is extended or split into quasi-interest periods that have the length of a regular coupon period and the computation is operated separately on each quasi-interest period and the intermediate results are summed up.
     * 
     */
    @XmlEnumValue("A006")
    A_006("A006"),

    /**
     * Method whereby interest is calculated based on the actual number of accrued days of the interest period that fall (falling on a normal year, year) divided by 365, added to the actual number of days of the interest period that fall (falling on a leap year, year) divided by 366.
     * 
     */
    @XmlEnumValue("A008")
    A_008("A008"),

    /**
     * Method whereby interest is calculated based on the actual number of days in the coupon period divided by the actual number of days in the year. This method is a variation of the ActualActualICMA method with the exception that it assumes that the coupon always falls on the last day of the month. Method equal to ACT/ACT.ISMA in the FpML model and Act/Act (ICSMA Ultimo) in the FixML model.
     * 
     */
    @XmlEnumValue("A015")
    A_015("A015"),

    /**
     * Method whereby interest is calculated based on the actual number of business days in the interest period divided by 252. 
     * Usage: Brazilian Currency Swaps. 
     * Method equal to BUS/252 in the FpML model and BusTwoFiftyTwo in the FixML model.
     * 
     */
    @XmlEnumValue("A018")
    A_018("A018"),

    /**
     * Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February. This means that the 31st is assumed to be the 30th and 28 Feb (or 29 Feb for a leap year) is assumed to be the 28th (or 29th). It is the most commonly used 30/360 method for non-US straight and convertible bonds issued before 1 January 1999.
     * 
     */
    @XmlEnumValue("A011")
    A_011("A011"),

    /**
     * Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February, and provided that the interest period started on a 30th or a 31st. This means that a 31st is assumed to be a 30th if the period started on a 30th or a 31st and the 28 Feb (or 29 Feb for a leap year) is assumed to be the 28th (or 29th). This is the most commonly used 30/360 method for US straight and convertible bonds.
     * 
     */
    @XmlEnumValue("A001")
    A_001("A001"),

    /**
     * Method whereby interest is calculated based on a 30-day month in a way similar to the 30/360 (basic rule) and a 365-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February. This means that a 31st is assumed to be the 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be the 28th (or 29th).
     * 
     */
    @XmlEnumValue("A002")
    A_002("A002"),

    /**
     * Method whereby interest is calculated based on a 30-day month in a way similar to the 30/360 (basic rule) and the assumed number of days in a year in a way similar to the Actual/Actual (ICMA). Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February. This means that the 31st is assumed to be the 30th and 28 Feb (or 29 Feb for a leap year) is assumed to be the 28th (or 29th). The assumed number of days in a year is computed as the actual number of days in the coupon period multiplied by the number of interest payments in the year.
     * 
     */
    @XmlEnumValue("A003")
    A_003("A003"),

    /**
     * Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for the last day of February whose day of the month value shall be adapted to the value of the first day of the interest period if the latter is higher and if the period is one of a regular schedule. This means that the 31st is assumed to be the 30th and 28 Feb of a non-leap year is assumed to be equivalent to 29 Feb when the first day of the interest period is the 29th, or to 30 Feb when the first day of the interest period is the 30th or the 31st. The 29th day of February in a leap year is assumed to be equivalent to 30 Feb when the first day of the interest period is the 30th or the 31st. Similarly, if the coupon period starts on the last day of February, it is assumed to produce only one day of interest in February as if it was starting on 30 Feb when the end of the period is the 30th or the 31st, or two days of interest in February when the end of the period is the 29th, or three days of interest in February when it is 28 Feb of a non-leap year and the end of the period is before the 29th.
     * 
     */
    @XmlEnumValue("A012")
    A_012("A012"),

    /**
     * Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month. This means that the 31st is assumed to be the 30th and 28 Feb (or 29 Feb for a leap year) is assumed to be equivalent to 30 Feb. It is a variation of the 30E/360 (or Eurobond basis) method where the last day of February is always assumed to be the 30th, even if it is the last day of the maturity coupon period.
     * 
     */
    @XmlEnumValue("A013")
    A_013("A013"),

    /**
     * Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month. This means that the 31st is assumed to be the 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be equivalent to 30 Feb. However, if the last day of the maturity coupon period is the last day of February, it will not be assumed to be the 30th. It is a variation of the 30/360 (ICMA) method commonly used for eurobonds. The usage of this variation is only relevant when the coupon periods are scheduled to end on the last day of the month.
     * 
     */
    @XmlEnumValue("A007")
    A_007("A007"),

    /**
     * Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month. This means that the 31st is assumed to be the 30th and 28 Feb (or 29 Feb for a leap year) is assumed to be equivalent to 30 Feb. This method is a variation of the 30E360 method with the exception that if the coupon falls on the last day of the month, change it to 1 and increase the month by 1 (ie next month). Method equal to ThirtyEPlusThreeSixty in the FixML model.
     * 
     */
    @XmlEnumValue("A016")
    A_016("A016"),

    /**
     * Other method than A001-A020. See Narrative.
     * 
     */
    NARR("NARR"),

    /**
     * Also named 1/1. 
     * ELABORATION: If parties specify the Day Count Fraction to be 1/1 then in calculating the applicable amount, 1 is simply input into the calculation as the relevant Day Count Fraction. See also 2006 ISDA Definitions, Section 4.16. Day Count Fraction, paragraph (a).
     * 
     */
    @XmlEnumValue("A020")
    A_020("A020");
    private final String value;

    InterestComputationMethod4Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterestComputationMethod4Code fromValue(String v) {
        for (InterestComputationMethod4Code c: InterestComputationMethod4Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
