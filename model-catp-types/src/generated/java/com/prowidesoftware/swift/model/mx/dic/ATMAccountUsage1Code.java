
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMAccountUsage1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMAccountUsage1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOTH"/&gt;
 *     &lt;enumeration value="DSTN"/&gt;
 *     &lt;enumeration value="SRCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMAccountUsage1Code")
@XmlEnum
public enum ATMAccountUsage1Code {


    /**
     * Can be both the source and the destination account.
     * 
     */
    BOTH,

    /**
     * Destination account.
     * 
     */
    DSTN,

    /**
     * Source account.
     * 
     */
    SRCE;

    public String value() {
        return name();
    }

    public static ATMAccountUsage1Code fromValue(String v) {
        return valueOf(v);
    }

}
