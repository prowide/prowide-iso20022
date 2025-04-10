
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingChargeMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BillingChargeMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UPRC"/>
 *     <enumeration value="STAM"/>
 *     <enumeration value="BCHG"/>
 *     <enumeration value="DPRC"/>
 *     <enumeration value="FCHG"/>
 *     <enumeration value="LPRC"/>
 *     <enumeration value="MCHG"/>
 *     <enumeration value="MXRD"/>
 *     <enumeration value="TIR1"/>
 *     <enumeration value="TIR2"/>
 *     <enumeration value="TIR3"/>
 *     <enumeration value="TIR4"/>
 *     <enumeration value="TIR5"/>
 *     <enumeration value="TIR6"/>
 *     <enumeration value="TIR7"/>
 *     <enumeration value="TIR8"/>
 *     <enumeration value="TIR9"/>
 *     <enumeration value="TPRC"/>
 *     <enumeration value="ZPRC"/>
 *     <enumeration value="BBSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BillingChargeMethod1Code")
@XmlEnum
public enum BillingChargeMethod1Code {


    /**
     * Charge is calculated as the product of volume times unit price. This is the default value.
     * 
     */
    UPRC("UPRC"),

    /**
     * Service is specifically identified as a stamp duty for accounting purposes. The charge is calculated as the product of volume times unit price.
     * 
     */
    STAM("STAM"),

    /**
     * Fee charged in addition to the volume times unit price when one or more units of the service are provided.
     * 
     */
    BCHG("BCHG"),

    /**
     * Charge is calculated using a price which is lower than the quoted bank price.
     * 
     */
    DPRC("DPRC"),

    /**
     * Fixed charge not tied to volume or unit price. Flat Charge fees do not require a volume or Unit Price.
     * 
     */
    FCHG("FCHG"),

    /**
     * A single service where the volume, original charge and balance required are the totals of two or more pricing tiers.
     * 
     */
    LPRC("LPRC"),

    /**
     * Lowest charge possible for the service.
     * 
     */
    MCHG("MCHG"),

    /**
     * Maximum charge possible for the service even though volume times unit price exceeds the maximum reduction value.
     * 
     */
    MXRD("MXRD"),

    /**
     * Line item represents a charge for tier 1 in a multi tier, volume discount charging structure. Designates the tier 1 used to charge out the volume that falls in that tier.
     * 
     */
    @XmlEnumValue("TIR1")
    TIR_1("TIR1"),

    /**
     * Line item represents a charge for tier 2 in a multi tier, volume discount charging structure. Designates the tier 2 used to charge out the volume that falls in that tier.
     * 
     */
    @XmlEnumValue("TIR2")
    TIR_2("TIR2"),

    /**
     * Line item represents a charge for tier 3 in a multi tier, volume discount charging structure. Designates the tier 3 used to charge out the volume that falls in that tier.
     * 
     */
    @XmlEnumValue("TIR3")
    TIR_3("TIR3"),

    /**
     * Line item represents a charge for tier 4 in a multi tier, volume discount charging structure. Designates the tier 4 used to charge out the volume that falls in that tier.
     * 
     */
    @XmlEnumValue("TIR4")
    TIR_4("TIR4"),

    /**
     * Line item represents a charge for tier 5 in a multi tier, volume discount charging structure. Designates the tier 5 used to charge out the volume that falls in that tier.
     * 
     */
    @XmlEnumValue("TIR5")
    TIR_5("TIR5"),

    /**
     * Line item represents a charge for tier 6 in a multi tier, volume discount charging structure. Designates the tier 6 used to charge out the volume that falls in that tier.
     * 
     */
    @XmlEnumValue("TIR6")
    TIR_6("TIR6"),

    /**
     * Line item represents a charge for tier 7 in a multi tier, volume discount charging structure. Designates the tier 7 used to charge out the volume that falls in that tier.
     * 
     */
    @XmlEnumValue("TIR7")
    TIR_7("TIR7"),

    /**
     * Line item represents a charge for tier 8 in a multi tier, volume discount charging structure. Designates the tier 8 used to charge out the volume that falls in that tier.
     * 
     */
    @XmlEnumValue("TIR8")
    TIR_8("TIR8"),

    /**
     * Line item represents a charge for tier 9 in a multi tier, volume discount charging structure. Designates the tier 9 used to charge out the volume that falls in that tier.
     * 
     */
    @XmlEnumValue("TIR9")
    TIR_9("TIR9"),

    /**
     * Unit price is determined by the total volume.
     * 
     */
    TPRC("TPRC"),

    /**
     * Indicates different prices for the same service. Typically used in a relationship summary statement where the same service has a different price for different accounts in the relationship.
     * 
     */
    ZPRC("ZPRC"),

    /**
     * Charge is calculated as a balance times a per-annum rate multiplied by a time factor.
     * 
     */
    BBSE("BBSE");
    private final String value;

    BillingChargeMethod1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingChargeMethod1Code fromValue(String v) {
        for (BillingChargeMethod1Code c: BillingChargeMethod1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
