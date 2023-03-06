
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxIncomeReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxIncomeReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DUPS"/&gt;
 *     &lt;enumeration value="INMN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxIncomeReason1Code")
@XmlEnum
public enum TaxIncomeReason1Code {


    /**
     * There are duplicate message numbers within the set.
     * 
     */
    DUPS,

    /**
     * Stated number of messages in the set is incorrect.
     * 
     * 
     * 
     */
    INMN;

    public String value() {
        return name();
    }

    public static TaxIncomeReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
