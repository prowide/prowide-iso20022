
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reversible1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Reversible1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REVL"/&gt;
 *     &lt;enumeration value="FIXD"/&gt;
 *     &lt;enumeration value="CABK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
