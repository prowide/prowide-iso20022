
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMServiceType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASTS"/&gt;
 *     &lt;enumeration value="BLCQ"/&gt;
 *     &lt;enumeration value="DPST"/&gt;
 *     &lt;enumeration value="PINC"/&gt;
 *     &lt;enumeration value="STDR"/&gt;
 *     &lt;enumeration value="PRFL"/&gt;
 *     &lt;enumeration value="PATH"/&gt;
 *     &lt;enumeration value="CHSN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMServiceType4Code")
@XmlEnum
public enum ATMServiceType4Code {


    /**
     * Ask for account statement information to a related custumer account.
     * 
     */
    ASTS,

    /**
     * Balance inquiry.
     * 
     */
    BLCQ,

    /**
     * Deposit of items.
     * 
     */
    DPST,

    /**
     * Modification of the card PIN value.
     * 
     */
    PINC,

    /**
     * Standard withdrawal of items.
     * 
     */
    STDR,

    /**
     * Amount and notes Values are pre-defined by the customer profile.
     * 
     */
    PRFL,

    /**
     * Withdrawal transaction was pre-authorised by another channel, for instance a mobile. The amount could be absent from the withdrawal request message.
     * 
     */
    PATH,

    /**
     * Amount and notes values are chosen by the customer.
     * 
     */
    CHSN;

    public String value() {
        return name();
    }

    public static ATMServiceType4Code fromValue(String v) {
        return valueOf(v);
    }

}
