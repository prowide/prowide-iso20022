
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarcodeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BarcodeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COQR"/&gt;
 *     &lt;enumeration value="C128"/&gt;
 *     &lt;enumeration value="C025"/&gt;
 *     &lt;enumeration value="C039"/&gt;
 *     &lt;enumeration value="EA13"/&gt;
 *     &lt;enumeration value="EAN8"/&gt;
 *     &lt;enumeration value="P417"/&gt;
 *     &lt;enumeration value="UPCA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BarcodeType1Code")
@XmlEnum
public enum BarcodeType1Code {


    /**
     * Barcode encoded according to the 2Dimensions Quick Response Code Standard.
     * 
     */
    COQR("COQR"),

    /**
     * Barcode encoded according to the Code 128 standard.
     * 
     */
    @XmlEnumValue("C128")
    C_128("C128"),

    /**
     * Barcode encoded according to the Code 25 standard.
     * 
     */
    @XmlEnumValue("C025")
    C_025("C025"),

    /**
     * Barcode encoded according to the Code 39 standard.
     * 
     */
    @XmlEnumValue("C039")
    C_039("C039"),

    /**
     * Barcode encoded according to the EAN13 standard.
     * 
     */
    @XmlEnumValue("EA13")
    EA_13("EA13"),

    /**
     * Barcode encoded according to the EAN8 standard.
     * 
     */
    @XmlEnumValue("EAN8")
    EAN_8("EAN8"),

    /**
     * Barcode encoded according to the PDF417 standard.
     * 
     */
    @XmlEnumValue("P417")
    P_417("P417"),

    /**
     * Barcode encoded according to the UPCA standard.
     * 
     */
    UPCA("UPCA");
    private final String value;

    BarcodeType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BarcodeType1Code fromValue(String v) {
        for (BarcodeType1Code c: BarcodeType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
