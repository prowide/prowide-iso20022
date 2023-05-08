
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionIndividualStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionIndividualStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RJCT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionIndividualStatus2Code")
@XmlEnum
public enum TransactionIndividualStatus2Code {


    /**
     * Payment initiation or individual transaction included in the payment initiation has been rejected.
     * 
     */
    RJCT;

    public String value() {
        return name();
    }

    public static TransactionIndividualStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
