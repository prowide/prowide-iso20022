
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativeEventType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DerivativeEventType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALOC"/&gt;
 *     &lt;enumeration value="CLRG"/&gt;
 *     &lt;enumeration value="CLAL"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *     &lt;enumeration value="CREV"/&gt;
 *     &lt;enumeration value="ETRM"/&gt;
 *     &lt;enumeration value="EXER"/&gt;
 *     &lt;enumeration value="INCP"/&gt;
 *     &lt;enumeration value="NOVA"/&gt;
 *     &lt;enumeration value="PTNG"/&gt;
 *     &lt;enumeration value="TRAD"/&gt;
 *     &lt;enumeration value="UPDT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DerivativeEventType3Code")
@XmlEnum
public enum DerivativeEventType3Code {


    /**
     * Allocation event, where an existing derivative is allocated to different counterparties and reported as new derivatives.
     * 
     */
    ALOC,

    /**
     * Process in which a CCP interposes itself between the counterparties to the contract becoming the buyer to the counterparty that was a seller and the seller to the counterparty that was a buyer.
     * 
     */
    CLRG,

    /**
     * Simultaneous clearing and allocation event in a derivatives clearing organisation.
     * 
     */
    CLAL,

    /**
     * Compression or post-trade risk reduction exercise.
     * 
     */
    COMP,

    /**
     * Result of a corporate action.
     * 
     */
    CORP,

    /**
     * Applies only to credit derivatives. A credit event that results in a termination or modification of a derivative, at a trade or position level.
     * 
     */
    CREV,

    /**
     * Termination of an existing derivative transaction prior to scheduled termination or maturity date.
     * 
     */
    ETRM,

    /**
     * The exercise of an option or a swaption by one counterparty of the transaction, fully or partially. 
     * 
     */
    EXER,

    /**
     * Inclusion of an ETD or CFD into a position, where an existing derivative is terminated and either a new position is created or the notional of an existing position is modified.
     * 
     */
    INCP,

    /**
     * The replacement of a party to a derivative contract with another party giving rise to a new derivative contract.
     * 
     */
    NOVA,

    /**
     * The process by which a derivative transaction is transferred to another trade repository using the same UTI.
     * 
     */
    PTNG,

    /**
     * Conclusion of a derivative or renegotiation of its terms that does not result in change of a counterparty.
     * 
     */
    TRAD,

    /**
     * Outstanding derivative is updated to comply with the revised requirements on reporting.
     * 
     */
    UPDT;

    public String value() {
        return name();
    }

    public static DerivativeEventType3Code fromValue(String v) {
        return valueOf(v);
    }

}
