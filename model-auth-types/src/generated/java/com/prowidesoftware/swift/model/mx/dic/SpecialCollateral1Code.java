
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialCollateral1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialCollateral1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GENE"/&gt;
 *     &lt;enumeration value="SPEC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialCollateral1Code")
@XmlEnum
public enum SpecialCollateral1Code {


    /**
     * Identifies that all repurchase agreements are conducted against general collateral.
     * 
     */
    GENE,

    /**
     * Identifies that all repurchase agreements are conducted against special collateral.
     * 
     */
    SPEC;

    public String value() {
        return name();
    }

    public static SpecialCollateral1Code fromValue(String v) {
        return valueOf(v);
    }

}
