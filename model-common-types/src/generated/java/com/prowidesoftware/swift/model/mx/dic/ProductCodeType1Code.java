
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCodeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductCodeType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EA13"/>
 *     <enumeration value="EAN8"/>
 *     <enumeration value="GTIN"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PLUP"/>
 *     <enumeration value="RS14"/>
 *     <enumeration value="UPCA"/>
 *     <enumeration value="UPCE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductCodeType1Code")
@XmlEnum
public enum ProductCodeType1Code {


    /**
     * European Article Number of type-13 also known as International Article Number
     * 
     */
    @XmlEnumValue("EA13")
    EA_13("EA13"),

    /**
     * European Article Number of type-8 also known as International Article Number
     * 
     */
    @XmlEnumValue("EAN8")
    EAN_8("EAN8"),

    /**
     * Global Trade Item Number (GTIN) is an identifier for trade items.
     * 
     */
    GTIN("GTIN"),

    /**
     * Other type of product code classification.
     * 
     */
    OTHR("OTHR"),

    /**
     * Price look-up codes, commonly called PLU codes, PLU numbers, PLUs, produce codes, or produce labels, are identification numbers affixed to produce in grocery stores and supermarkets
     * 
     */
    PLUP("PLUP"),

    /**
     * RSS 14 barcode (Reduce Space Symbology) encodes the full  EAN item identification in a symbol that can be omnidirectionally scanned by suitably configured point-of-sale laser scanners.
     * 
     */
    @XmlEnumValue("RS14")
    RS_14("RS14"),

    /**
     * Uniform Product Code - A-type
     * 
     */
    UPCA("UPCA"),

    /**
     * Uniform Product Code E-Type
     * 
     */
    UPCE("UPCE");
    private final String value;

    ProductCodeType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductCodeType1Code fromValue(String v) {
        for (ProductCodeType1Code c: ProductCodeType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
