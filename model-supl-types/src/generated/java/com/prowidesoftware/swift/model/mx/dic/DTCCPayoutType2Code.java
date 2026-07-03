
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCCPayoutType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCCPayoutType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DTCCPayoutType2Code")
@XmlEnum
public enum DTCCPayoutType2Code {


    /**
     * Payout consisting of securities.
     * 
     */
    SECU;

    public String value() {
        return name();
    }

    public static DTCCPayoutType2Code fromValue(String v) {
        return valueOf(v);
    }

}
