
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyAmountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PenaltyAmountType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PenaltyAmountType1Code")
@XmlEnum
public enum PenaltyAmountType1Code {


    /**
     * Penalty is based on the amount of cash failed to be delivered and the penalty rate is the discount rate of the relevant currency.
     * 
     */
    CASH,

    /**
     * Penalty is based on the quantity of securities failed to be delivered and penalty rate of the securities.
     * 
     */
    SECU;

    public String value() {
        return name();
    }

    public static PenaltyAmountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
