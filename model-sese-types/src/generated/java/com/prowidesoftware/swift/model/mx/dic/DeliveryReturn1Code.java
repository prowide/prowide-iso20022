
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryReturn1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryReturn1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNRE"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="DUEB"/&gt;
 *     &lt;enumeration value="PARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryReturn1Code")
@XmlEnum
public enum DeliveryReturn1Code {


    /**
     * Original delivery is not recognized.
     * 
     */
    UNRE,

    /**
     * Wrong quantity delivered in the original instruction.
     * 
     */
    DQUA,

    /**
     * Wrong settlement amount settled in the original delivery.
     * 
     */
    DMON,

    /**
     * Only a portion of the original transaction quantity was delivered by the Central Securities Depository (CSD).
     * 
     */
    PART,

    /**
     * Account information is missing in the original delivery.
     * 
     */
    SAFE,

    /**
     * Due bill information missing in the original delivery.
     * 
     */
    DUEB,

    /**
     * Portion of the original transaction quantity was returned by the receiver.
     * 
     */
    PARD;

    public String value() {
        return name();
    }

    public static DeliveryReturn1Code fromValue(String v) {
        return valueOf(v);
    }

}
