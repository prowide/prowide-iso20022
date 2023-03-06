
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryPlace3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryPlace3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="EMPL"/&gt;
 *     &lt;enumeration value="INDI"/&gt;
 *     &lt;enumeration value="ENTR"/&gt;
 *     &lt;enumeration value="OADR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryPlace3Code")
@XmlEnum
public enum DeliveryPlace3Code {


    /**
     * Card needs to be sent via e-mail.
     * 
     */
    EMAL,

    /**
     * Card needs to be mailed to employer's address.
     * 
     */
    EMPL,

    /**
     * Card needs to be mailed to the individual specified in PersonDetail.
     * 
     */
    INDI,

    /**
     * Card needs to be available at the entrance of the meeting.
     * 
     */
    ENTR,

    /**
     * Cards needs to be send to another specified address.
     * 
     */
    OADR;

    public String value() {
        return name();
    }

    public static DeliveryPlace3Code fromValue(String v) {
        return valueOf(v);
    }

}
