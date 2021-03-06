
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionReversalReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionReversalReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AM05"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionReversalReason2Code")
@XmlEnum
public enum TransactionReversalReason2Code {


    /**
     * This message appears to have been duplicated.
     * 
     */
    @XmlEnumValue("AM05")
    AM_05("AM05");
    private final String value;

    TransactionReversalReason2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionReversalReason2Code fromValue(String v) {
        for (TransactionReversalReason2Code c: TransactionReversalReason2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
