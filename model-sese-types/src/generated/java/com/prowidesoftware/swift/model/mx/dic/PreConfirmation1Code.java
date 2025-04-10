
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreConfirmation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PreConfirmation1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRCA"/>
 *     <enumeration value="PRSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PreConfirmation1Code")
@XmlEnum
public enum PreConfirmation1Code {


    /**
     * Pre-confirmation of the movement of the cash, pending the movement of securities.
     * 
     */
    PRCA,

    /**
     * Pre-confirmation of the movement of the securities, pending the movement of cash.
     * 
     */
    PRSE;

    public String value() {
        return name();
    }

    public static PreConfirmation1Code fromValue(String v) {
        return valueOf(v);
    }

}
