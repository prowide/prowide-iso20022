
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCCPayoutType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCCPayoutType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DTCCPayoutType4Code")
@XmlEnum
public enum DTCCPayoutType4Code {


    /**
     * Payout consisting of securities.
     * 
     */
    SECU;

    public String value() {
        return name();
    }

    public static DTCCPayoutType4Code fromValue(String v) {
        return valueOf(v);
    }

}
