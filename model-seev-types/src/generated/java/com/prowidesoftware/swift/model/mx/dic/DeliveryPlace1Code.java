
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryPlace1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryPlace1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMPL"/&gt;
 *     &lt;enumeration value="INDI"/&gt;
 *     &lt;enumeration value="ENTR"/&gt;
 *     &lt;enumeration value="OADR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryPlace1Code")
@XmlEnum
public enum DeliveryPlace1Code {


    /**
     * Card needs to be mailed to employers address.
     * 
     */
    EMPL,

    /**
     * Card needs to be mailed to individual specified in PersonDetail
     * 
     */
    INDI,

    /**
     * Card needs to be available at the entrance of the meeting.
     * 
     */
    ENTR,

    /**
     * Cards needs to be send to other specified address.
     * 
     */
    OADR;

    public String value() {
        return name();
    }

    public static DeliveryPlace1Code fromValue(String v) {
        return valueOf(v);
    }

}
