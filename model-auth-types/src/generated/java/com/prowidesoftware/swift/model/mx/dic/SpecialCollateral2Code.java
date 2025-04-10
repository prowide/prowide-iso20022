
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialCollateral2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SpecialCollateral2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GENE"/>
 *     <enumeration value="SPEC"/>
 *     <enumeration value="MRRP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SpecialCollateral2Code")
@XmlEnum
public enum SpecialCollateral2Code {


    /**
     * Identifies that all repurchase agreements are conducted against general collateral.
     * 
     */
    GENE,

    /**
     * Identifies that all repurchase agreements are conducted against special collateral.
     * 
     */
    SPEC,

    /**
     * Identifies that this is a securities lending transaction, made of repurchase agreements and reverse repurchase agreements versus cash.
     * 
     */
    MRRP;

    public String value() {
        return name();
    }

    public static SpecialCollateral2Code fromValue(String v) {
        return valueOf(v);
    }

}
