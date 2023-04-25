
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReorganisationWithdrawalTransactionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReorganisationWithdrawalTransactionType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRPW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReorganisationWithdrawalTransactionType2Code")
@XmlEnum
public enum ReorganisationWithdrawalTransactionType2Code {


    /**
     * The reorganisation instruction cancellation is a withdrawal protect transaction on behalf of another participant.
     * 
     */
    PRPW;

    public String value() {
        return name();
    }

    public static ReorganisationWithdrawalTransactionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
