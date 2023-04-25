
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingObligationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ClearingObligationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FLSE"/>
 *     <enumeration value="UKWN"/>
 *     <enumeration value="TRUE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClearingObligationType1Code")
@XmlEnum
public enum ClearingObligationType1Code {


    /**
     * Reported contract does not belong to a class of OTC derivatives that has been declared subject to the clearing obligation.
     * 
     */
    FLSE,

    /**
     * Unknown whether reported contract belongs to a class of OTC derivatives that has been declared subject to the clearing obligation.
     * 
     */
    UKWN,

    /**
     * Reported contract belongs to a class of OTC derivatives that has been declared subject to the clearing obligation.
     * 
     */
    TRUE;

    public String value() {
        return name();
    }

    public static ClearingObligationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
