
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafekeepingAccountIdentification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SafekeepingAccountIdentification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GENR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SafekeepingAccountIdentification1Code")
@XmlEnum
public enum SafekeepingAccountIdentification1Code {


    /**
     * Announcement applies to all safekeeping accounts that own underlying financial instrument. (Used for general or preliminary announcements.).
     * 
     */
    GENR;

    public String value() {
        return name();
    }

    public static SafekeepingAccountIdentification1Code fromValue(String v) {
        return valueOf(v);
    }

}
