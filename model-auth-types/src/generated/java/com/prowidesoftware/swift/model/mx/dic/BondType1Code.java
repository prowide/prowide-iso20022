
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BondType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BondType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EUSB"/>
 *     <enumeration value="OEPB"/>
 *     <enumeration value="CVTB"/>
 *     <enumeration value="CRPB"/>
 *     <enumeration value="CVDB"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BondType1Code")
@XmlEnum
public enum BondType1Code {


    /**
     * Bond of type sovereign bond.
     * 
     * 
     */
    EUSB,

    /**
     * Bond of type other public bond.
     * 
     */
    OEPB,

    /**
     * Bond of type convertible bond.
     * 
     */
    CVTB,

    /**
     * Bond of type corporate Bond.
     * 
     * 
     */
    CRPB,

    /**
     * Bond of type covered Bond.
     * 
     */
    CVDB,

    /**
     * Other bond type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static BondType1Code fromValue(String v) {
        return valueOf(v);
    }

}
