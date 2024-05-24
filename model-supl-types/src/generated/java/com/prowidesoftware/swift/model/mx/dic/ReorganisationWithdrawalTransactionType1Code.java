
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReorganisationWithdrawalTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReorganisationWithdrawalTransactionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PROW"/>
 *     <enumeration value="VOIW"/>
 *     <enumeration value="PRPW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReorganisationWithdrawalTransactionType1Code")
@XmlEnum
public enum ReorganisationWithdrawalTransactionType1Code {


    /**
     * The reorganisation instruction cancellation is a protect withdrawal transaction.
     * 
     */
    PROW,

    /**
     * The reorganisation instruction cancellation is a voluntary offer instruction withdrawal transaction.
     * 
     */
    VOIW,

    /**
     * The reorganisation instruction cancellation is a withdrawal protect transaction on behalf of another participant.
     * 
     */
    PRPW;

    public String value() {
        return name();
    }

    public static ReorganisationWithdrawalTransactionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
