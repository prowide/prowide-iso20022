
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reversible1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Reversible1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REVL"/>
 *     <enumeration value="FIXD"/>
 *     <enumeration value="CABK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Reversible1Code")
@XmlEnum
public enum Reversible1Code {


    /**
     * Securities lending contract can be ended by the borrower before the expiration date.
     * 
     */
    REVL,

    /**
     * Securities lending contract can not be ended by the borrower before the expiration date.
     * 
     */
    FIXD,

    /**
     * Securities lending contract can be ended by the lender before the expiration date.
     * 
     */
    CABK;

    public String value() {
        return name();
    }

    public static Reversible1Code fromValue(String v) {
        return valueOf(v);
    }

}
