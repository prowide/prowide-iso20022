
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarcodeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BarcodeType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COQR"/>
 *     <enumeration value="C128"/>
 *     <enumeration value="C025"/>
 *     <enumeration value="C039"/>
 *     <enumeration value="EA13"/>
 *     <enumeration value="EAN8"/>
 *     <enumeration value="P417"/>
 *     <enumeration value="UPCA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
