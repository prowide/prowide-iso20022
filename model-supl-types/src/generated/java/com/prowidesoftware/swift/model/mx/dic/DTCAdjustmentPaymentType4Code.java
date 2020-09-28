
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCAdjustmentPaymentType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCAdjustmentPaymentType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RRRA"/&gt;
 *     &lt;enumeration value="RADC"/&gt;
 *     &lt;enumeration value="RADR"/&gt;
 *     &lt;enumeration value="RCIL"/&gt;
 *     &lt;enumeration value="RRCL"/&gt;
 *     &lt;enumeration value="RCDP"/&gt;
 *     &lt;enumeration value="RRCD"/&gt;
 *     &lt;enumeration value="RRDR"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="TJXF"/&gt;
 *     &lt;enumeration value="RRRL"/&gt;
 *     &lt;enumeration value="RRLR"/&gt;
 *     &lt;enumeration value="RRR3"/&gt;
 *     &lt;enumeration value="TJXU"/&gt;
 *     &lt;enumeration value="MISC"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="TJXD"/&gt;
 *     &lt;enumeration value="RRD1"/&gt;
 *     &lt;enumeration value="RRD2"/&gt;
 *     &lt;enumeration value="REVA"/&gt;
 *     &lt;enumeration value="TJXR"/&gt;
 *     &lt;enumeration value="TJXV"/&gt;
 *     &lt;enumeration value="RRML"/&gt;
 *     &lt;enumeration value="RRMD"/&gt;
 *     &lt;enumeration value="TJXO"/&gt;
 *     &lt;enumeration value="TJXL"/&gt;
 *     &lt;enumeration value="TJXT"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="RRRI"/&gt;
 *     &lt;enumeration value="RRRS"/&gt;
 *     &lt;enumeration value="RRRU"/&gt;
 *     &lt;enumeration value="RRRE"/&gt;
 *     &lt;enumeration value="STOK"/&gt;
 *     &lt;enumeration value="TJXI"/&gt;
 *     &lt;enumeration value="RRT2"/&gt;
 *     &lt;enumeration value="RRWT"/&gt;
 *     &lt;enumeration value="RRWC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DTCAdjustmentPaymentType4Code")
@XmlEnum
public enum DTCAdjustmentPaymentType4Code {


    /**
     * Adjusted for rights subscription related adjustment.
     * 
     */
    RRRA("RRRA"),

    /**
     * American Depository Receipt issue fee charge adjustment.
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
     * Custody reorganisation deposit related adjustment.
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
     * Last day protect related adjustment.
     * 
     */
    RRRL("RRRL"),

    /**
     * Mandatory legal reorganisation deposit related adjustment.
     * 
     */
    RRLR("RRLR"),

    /**
     * Mandatory over three year reorganisation deposit related adjustment.
     * 
     */
    @XmlEnumValue("RRR3")
    RRR_3("RRR3"),

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
     * Reserved for new user defined reason codes.
     * 
     */
    OTHR("OTHR"),

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
     * Intra-day reversal of original tax withholding related adjustment.
     * 
     */
    TJXV("TJXV"),

    /**
     * Legal reorganisation deposit related adjustment.
     * 
     */
    RRML("RRML"),

    /**
     * Mandatory reorganisation deposit related adjustment.
     * 
     */
    RRMD("RRMD"),

    /**
     * Original (initial) tax withholding related adjustment.
     * 
     */
    TJXO("TJXO"),

    /**
     * Original late tax withholding related adjustment.
     * 
     */
    TJXL("TJXL"),

    /**
     * Rate change tax withholding related adjustment.
     * 
     */
    TJXT("TJXT"),

    /**
     * REPO (repurchase agreement) transaction.
     * 
     */
    REPO("REPO"),

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

    DTCAdjustmentPaymentType4Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DTCAdjustmentPaymentType4Code fromValue(String v) {
        for (DTCAdjustmentPaymentType4Code c: DTCAdjustmentPaymentType4Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
