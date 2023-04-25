
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionGroupStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionGroupStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PART"/>
 *     <enumeration value="RJCT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionGroupStatus2Code")
@XmlEnum
public enum TransactionGroupStatus2Code {


    /**
     * A number of transactions have been accepted, whereas another number of transactions have not yet achieved 'accepted' status.
     * 
     */
    PART,

    /**
     * Payment initiation or individual transaction included in the payment initiation has been rejected.
     * 
     */
    RJCT;

    public String value() {
        return name();
    }

    public static TransactionGroupStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
