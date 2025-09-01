
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferredContactMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreferredContactMethod2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAIL"/&gt;
 *     &lt;enumeration value="FAXX"/&gt;
 *     &lt;enumeration value="LETT"/&gt;
 *     &lt;enumeration value="CELL"/&gt;
 *     &lt;enumeration value="ONLI"/&gt;
 *     &lt;enumeration value="PHON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
