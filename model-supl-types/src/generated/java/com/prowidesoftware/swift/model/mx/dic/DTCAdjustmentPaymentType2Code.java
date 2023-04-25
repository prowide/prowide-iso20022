
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCAdjustmentPaymentType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCAdjustmentPaymentType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RRRA"/>
 *     <enumeration value="RADC"/>
 *     <enumeration value="RADR"/>
 *     <enumeration value="RCIL"/>
 *     <enumeration value="RRCL"/>
 *     <enumeration value="RCDP"/>
 *     <enumeration value="RRCD"/>
 *     <enumeration value="RRDR"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="TJXF"/>
 *     <enumeration value="TJXV"/>
 *     <enumeration value="RRRL"/>
 *     <enumeration value="RRML"/>
 *     <enumeration value="RRLR"/>
 *     <enumeration value="RRMD"/>
 *     <enumeration value="TJXU"/>
 *     <enumeration value="MISC"/>
 *     <enumeration value="TJXO"/>
 *     <enumeration value="RRR3"/>
 *     <enumeration value="TJXL"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="TJXT"/>
 *     <enumeration value="TJXD"/>
 *     <enumeration value="RRD1"/>
 *     <enumeration value="RRD2"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="REVA"/>
 *     <enumeration value="TJXR"/>
 *     <enumeration value="RRRI"/>
 *     <enumeration value="RRRS"/>
 *     <enumeration value="RRRU"/>
 *     <enumeration value="RRRE"/>
 *     <enumeration value="STOK"/>
 *     <enumeration value="TJXI"/>
 *     <enumeration value="RRT2"/>
 *     <enumeration value="RRWT"/>
 *     <enumeration value="RRWC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCAdjustmentPaymentType2Code")
@XmlEnum
public enum DTCAdjustmentPaymentType2Code {


    /**
     * Adjusted for rights subscription related adjustment.
     * 
     */
    RRRA("RRRA"),

    /**
     * American Depository R issue fee charge adjustment.
     * 
     */
    RADC("RADC"),

    /**
     * ADR issue fee reversal adjustment.
     * 
     */
    RADR("RADR"),

    /**
     * Cash in lieu related adjustment.
     * 
     */
    RCIL("RCIL"),

    /**
     * Claim settlement related adjustment.
     * 
     */
    RRCL("RRCL"),

    /**
     * Dividend payment on a DTC custody held security related adjustment.
     * 
     */
    RCDP("RCDP"),

    /**
     * Custody reorganization deposit related adjustment.
     * 
     */
    RRCD("RRCD"),

    /**
     * Dynamic rate change related adjustment.
     * 
     */
    RRDR("RRDR"),

    /**
     * FAIL (undelivered securities) transaction.
     * 
     */
    FAIL("FAIL"),

    /**
     * Fail tracking tax withholding related adjustment.
     * 
     */
    TJXF("TJXF"),

    /**
     * Intra-day reversal of original tax withholding related adjustment.
     * 
     */
    TJXV("TJXV"),

    /**
     * Last day protect related adjustment.
     * 
     */
    RRRL("RRRL"),

    /**
     * Legal reorganization deposit related adjustment.
     * 
     */
    RRML("RRML"),

    /**
     * Mandatory legal reorganization deposit related adjustment.
     * 
     */
    RRLR("RRLR"),

    /**
     * Mandatory reorganization deposit related adjustment.
     * 
     */
    RRMD("RRMD"),

    /**
     * Manual user tax adjustment.
     * 
     */
    TJXU("TJXU"),

    /**
     * Miscellaneous (adjustment) transaction.
     * 
     */
    MISC("MISC"),

    /**
     * Original (initial) tax withholding related adjustment.
     * 
     */
    TJXO("TJXO"),

    /**
     * Mandatory over three year reorganization deposit related adjustment.
     * 
     */
    @XmlEnumValue("RRR3")
    RRR_3("RRR3"),

    /**
     * Original late tax withholding related adjustment.
     * 
     */
    TJXL("TJXL"),

    /**
     * Reserved for new user defined reason codes.
     * 
     */
    OTHR("OTHR"),

    /**
     * Rate change tax withholding related adjustment.
     * 
     */
    TJXT("TJXT"),

    /**
     * Reclassification tax withholding related adjustment.
     * 
     */
    TJXD("TJXD"),

    /**
     * Participant deposited a security within 10 days after a corporate action event has occurred.
     * 
     */
    @XmlEnumValue("RRD1")
    RRD_1("RRD1"),

    /**
     * Participant deposited a security 10 days after a corporate action event has occurred.
     * 
     */
    @XmlEnumValue("RRD2")
    RRD_2("RRD2"),

    /**
     * REPO (repurchase agreement) transaction.
     * 
     */
    REPO("REPO"),

    /**
     * Reversal related adjustment.
     * 
     */
    REVA("REVA"),

    /**
     * Reversal of tax withholding related adjustment.
     * 
     */
    TJXR("TJXR"),

    /**
     * Rights protect related adjustment.
     * 
     */
    RRRI("RRRI"),

    /**
     * Rights sales related adjustment.
     * 
     */
    RRRS("RRRS"),

    /**
     * Rights step up related adjustment.
     * 
     */
    RRRU("RRRU"),

    /**
     * Rights subscription related adjustment.
     * 
     */
    RRRE("RRRE"),

    /**
     * Stock loan transaction.
     * 
     */
    STOK("STOK"),

    /**
     * Tax instruction change related adjustment.
     * 
     */
    TJXI("TJXI"),

    /**
     * Tender offer fraction related adjustment.
     * 
     */
    @XmlEnumValue("RRT2")
    RRT_2("RRT2"),

    /**
     * Warrant Participant delete related adjustment.
     * 
     */
    RRWT("RRWT"),

    /**
     * Warrant rate change related adjustment.
     * 
     */
    RRWC("RRWC");
    private final String value;

    DTCAdjustmentPaymentType2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DTCAdjustmentPaymentType2Code fromValue(String v) {
        for (DTCAdjustmentPaymentType2Code c: DTCAdjustmentPaymentType2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
