
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingContractForDifferenceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingContractForDifferenceType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOND"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="CURR"/&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="EQUI"/&gt;
 *     &lt;enumeration value="FTEQ"/&gt;
 *     &lt;enumeration value="OPEQ"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingContractForDifferenceType3Code")
@XmlEnum
public enum UnderlyingContractForDifferenceType3Code {


    /**
     * Underlying is a bond.
     * 
     */
    BOND,

    /**
     * Underlying is a commodity.
     * 
     */
    COMM,

    /**
     * Underlying is a currency.
     * 
     */
    CURR,

    /**
     * Underlying is an emission allowance.
     * 
     */
    EMAL,

    /**
     * Underlying is an equity.
     * 
     */
    EQUI,

    /**
     * Underlying is a future on equity.
     * 
     */
    FTEQ,

    /**
     * Underlying is an option on equity.
     * 
     */
    OPEQ,

    /**
     * Underlying is of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static UnderlyingContractForDifferenceType3Code fromValue(String v) {
        return valueOf(v);
    }

}
