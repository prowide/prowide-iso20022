
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OversubscriptionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OversubscriptionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNLD"/&gt;
 *     &lt;enumeration value="LTDB"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OversubscriptionType1Code")
@XmlEnum
public enum OversubscriptionType1Code {


    /**
     * Unlimited oversubscription.
     * 
     */
    UNLD,

    /**
     * Limited subscription by quantity or percentage.
     * 
     */
    LTDB,

    /**
     * No oversubscription is allowed.
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static OversubscriptionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
