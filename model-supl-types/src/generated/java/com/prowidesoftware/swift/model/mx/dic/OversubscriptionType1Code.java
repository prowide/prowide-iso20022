
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OversubscriptionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OversubscriptionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNLD"/>
 *     <enumeration value="LTDB"/>
 *     <enumeration value="NONE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
     * The subscription is limited by quantity or percentage.
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
