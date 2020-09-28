
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcessCashRejectionReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExcessCashRejectionReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SHRT"/&gt;
 *     &lt;enumeration value="LCKD"/&gt;
 *     &lt;enumeration value="NESI"/&gt;
 *     &lt;enumeration value="MAXE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExcessCashRejectionReason1Code")
@XmlEnum
public enum ExcessCashRejectionReason1Code {


    /**
     * Amount resulted in shortage.
     * 
     */
    SHRT,

    /**
     * Request received after settlement locked.
     * 
     */
    LCKD,

    /**
     * Attempted to remove a non-existent Excess Cash Standing Instruction.
     * 
     */
    NESI,

    /**
     * Maximum allowed excess cash exceeded.
     * 
     */
    MAXE;

    public String value() {
        return name();
    }

    public static ExcessCashRejectionReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
