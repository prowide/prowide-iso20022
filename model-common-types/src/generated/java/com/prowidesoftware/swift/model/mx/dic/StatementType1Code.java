
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatementType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ST03"/&gt;
 *     &lt;enumeration value="ST02"/&gt;
 *     &lt;enumeration value="ST06"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatementType1Code")
@XmlEnum
public enum StatementType1Code {


    /**
     * Accounting Statement of Holdings (semt 003).
     * 
     */
    @XmlEnumValue("ST03")
    ST_03("ST03"),

    /**
     * Custody Statement of Holdings (semt 002).
     * 
     */
    @XmlEnumValue("ST02")
    ST_02("ST02"),

    /**
     * Statement of Investment Fund Transactions (semt 006).
     * 
     */
    @XmlEnumValue("ST06")
    ST_06("ST06");
    private final String value;

    StatementType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatementType1Code fromValue(String v) {
        for (StatementType1Code c: StatementType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
