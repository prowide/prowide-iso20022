
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferredContactMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PreferredContactMethod2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MAIL"/>
 *     <enumeration value="FAXX"/>
 *     <enumeration value="LETT"/>
 *     <enumeration value="CELL"/>
 *     <enumeration value="ONLI"/>
 *     <enumeration value="PHON"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PreferredContactMethod2Code")
@XmlEnum
public enum PreferredContactMethod2Code {


    /**
     * Preferred method used to reach the contact is per email.
     * 
     */
    MAIL,

    /**
     * Preferred method used to reach the contact is per fax.
     * 
     */
    FAXX,

    /**
     * Preferred method used to reach the contact is per letter.
     * 
     */
    LETT,

    /**
     * Preferred method used to reach the contact is per mobile or cell phone.
     * 
     */
    CELL,

    /**
     * Preferred method used to reach the contact is online.
     * 
     */
    ONLI,

    /**
     * Preferred method used to reach the contact is per phone.
     * 
     */
    PHON;

    public String value() {
        return name();
    }

    public static PreferredContactMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
