
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryPlace3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DeliveryPlace3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EMAL"/>
 *     <enumeration value="EMPL"/>
 *     <enumeration value="INDI"/>
 *     <enumeration value="ENTR"/>
 *     <enumeration value="OADR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
