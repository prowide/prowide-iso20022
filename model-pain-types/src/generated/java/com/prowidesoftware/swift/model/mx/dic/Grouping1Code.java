
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Grouping1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Grouping1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SNGL"/&gt;
 *     &lt;enumeration value="GRPD"/&gt;
 *     &lt;enumeration value="MIXD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Grouping1Code")
@XmlEnum
public enum Grouping1Code {


    /**
     * Indicates that for each occurrences of the payment information block, exactly one occurrence of the payment transaction block is present.
     * 
     */
    SNGL,

    /**
     * Indicates that there is only one occurrence of the payment information block and several occurrences of the payment transaction block.
     * 
     */
    GRPD,

    /**
     * Indicates that there are one or several occurrences of the payment information block where each of the occurrences might contain one or several occurrences of the payment transaction block.
     * 
     */
    MIXD;

    public String value() {
        return name();
    }

    public static Grouping1Code fromValue(String v) {
        return valueOf(v);
    }

}
