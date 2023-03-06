
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalmentPeriod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstalmentPeriod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="ANNU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstalmentPeriod1Code")
@XmlEnum
public enum InstalmentPeriod1Code {


    /**
     * Monthly instalment period.
     * 
     */
    MNTH,

    /**
     * Annual instalment period.
     * 
     */
    ANNU;

    public String value() {
        return name();
    }

    public static InstalmentPeriod1Code fromValue(String v) {
        return valueOf(v);
    }

}
