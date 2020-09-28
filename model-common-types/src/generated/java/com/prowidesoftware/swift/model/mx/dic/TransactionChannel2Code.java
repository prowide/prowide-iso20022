
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionChannel2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionChannel2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIAD"/&gt;
 *     &lt;enumeration value="HOBA"/&gt;
 *     &lt;enumeration value="BRAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionChannel2Code")
@XmlEnum
public enum TransactionChannel2Code {


    /**
     * Financial advisor.
     * 
     */
    FIAD,

    /**
     * Home banking.
     * 
     */
    HOBA,

    /**
     * Office or branch.
     * 
     */
    BRAN;

    public String value() {
        return name();
    }

    public static TransactionChannel2Code fromValue(String v) {
        return valueOf(v);
    }

}
