
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCEntitlementCalculationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCEntitlementCalculationMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SR15"/>
 *     <enumeration value="CR17"/>
 *     <enumeration value="SR18"/>
 *     <enumeration value="SC19"/>
 *     <enumeration value="SB20"/>
 *     <enumeration value="SHST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCEntitlementCalculationMethod1Code")
@XmlEnum
public enum DTCEntitlementCalculationMethod1Code {


    /**
     * Per individual account X share holding per account X Cash Rate divided by the Stock Rate = Whole Shares + CIL of Fractions Example: 100 shares X.50 (Cash Rate) divided by $20.00 (Stock Rate)=2 whole shares and.500000 fractions Fractional Entitlement: If the price is $15.00 per share, you would calculate.500000 X $15.00 = $7.50 for CIL.
     * 
     */
    @XmlEnumValue("SR15")
    SR_15("SR15"),

    /**
     * Per individual account X share holding per account X Cash Rate = entitlement Example: 100 shares X.50 (Cash Rate) = $50.00 in cash.
     * 
     */
    @XmlEnumValue("CR17")
    CR_17("CR17"),

    /**
     * Per individual account X share holding per account X Stock Rate = whole shares + CIL of Fractions Example: 150 shares X 5% (Stock Rate) = 7 whole shares and.500000 fractions Fractional Entitlement: If the CIL price is $10.00 per share, you would calculate.500000 X $10.00 = $5.00 for CIL.
     * 
     */
    @XmlEnumValue("SR18")
    SR_18("SR18"),

    /**
     * Per individual account X share holding per account X Stock Rate = whole shares + Fractions Example: 150 shares X 5% (Stock Rate) = 7 whole shares and.500000 fractions. Cash Entitlement: If the CIL price is $10.00 per share, you would calculate 7.500000 shares X $10.00 = $75.00 in cash.
     * 
     */
    @XmlEnumValue("SC19")
    SC_19("SC19"),

    /**
     * A) Per individual account X share holding per account X Stock Rate = Whole shares + CIL of Fractions (Note 1)Note 1- Then option is to buy fraction so as to round up to one (1) whole share B) Per individual account X (1 whole share-fractional issuable) = fractions to be bought X CIL Fraction Price= Cash to be charged to each individual account (Note 1) + 1 whole share to be added to the individual account (Note 2)Note 1- Appropriate cash adjustment decreasing a participants cash position will be transacted Note 2- Appropriate share adjustment increasing a participants share position will be transacted Special Note: The following two formulas relate to those situations whereby the option allows you to buy an additional fraction so as to round up to one (1) whole share. F/C 20-can be used for most fractions buy round ups. F/C 21-was once a mandatory fraction buy round up formula used by a agent. (The end result is the same if you use either F/C).
     * 
     */
    @XmlEnumValue("SB20")
    SB_20("SB20"),

    /**
     * A) Per individual account X share holding per account X Stock Rate = Whole shares + Fractional Issuable Note: This is a Mandatory Agent calculation for fractional round-up B) Per individual account X (1 whole share X round out price (announce in Cash Rate)-(Fractional Issuable X Stock Rate) = Cash to be charged to each individual account + 1 whole share to be added to each individual account.
     * 
     */
    SHST("SHST");
    private final String value;

    DTCEntitlementCalculationMethod1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DTCEntitlementCalculationMethod1Code fromValue(String v) {
        for (DTCEntitlementCalculationMethod1Code c: DTCEntitlementCalculationMethod1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
