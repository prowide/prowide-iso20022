
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyCalculationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PenaltyCalculationMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOTH"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="MIXE"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PenaltyCalculationMethod1Code")
@XmlEnum
public enum PenaltyCalculationMethod1Code {


    /**
     * Sum of the penalty based on the quantity of securities
     * failed to be delivered and penalty rate of the securities and the penalty based on the amount of cash failed to be delivered and the discount rate of the currency.
     * 
     */
    BOTH,

    /**
     * Penalty is based on the amount of cash failed to be delivered and the penalty rate is the discount rate of the relevant currency.
     * 
     */
    CASH,

    /**
     * Penalty is based on the quantity of securities failed to be delivered and penalty rate is the discount rate of the relevant currency.
     * 
     */
    MIXE,

    /**
     * Penalty is based on the quantity of securities failed to be delivered and penalty rate of the securities.
     * 
     */
    SECU;

    public String value() {
        return name();
    }

    public static PenaltyCalculationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
