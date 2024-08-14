
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferredContactMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PreferredContactMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LETT"/>
 *     <enumeration value="MAIL"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="FAXX"/>
 *     <enumeration value="CELL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PreferredContactMethod1Code")
@XmlEnum
public enum PreferredContactMethod1Code {


    /**
     * Preferred method used to reach the contact is per letter.
     * 
     */
    LETT,

    /**
     * Preferred method used to reach the contact is per email.
     * 
     */
    MAIL,

    /**
     * Preferred method used to reach the contact is per phone.
     * 
     */
    PHON,

    /**
     * Preferred method used to reach the contact is per fax.
     * 
     */
    FAXX,

    /**
     * Preferred method used to reach the contact is per mobile or cell phone.
     * 
     */
    CELL;

    public String value() {
        return name();
    }

    public static PreferredContactMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
