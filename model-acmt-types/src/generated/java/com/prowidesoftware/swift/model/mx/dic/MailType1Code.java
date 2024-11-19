
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MailType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AIRM"/>
 *     <enumeration value="ORDM"/>
 *     <enumeration value="REGM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MailType1Code")
@XmlEnum
public enum MailType1Code {


    /**
     * Air mail.
     * 
     */
    AIRM,

    /**
     * Ordinary mail.
     * 
     */
    ORDM,

    /**
     * Registered Mail.
     * 
     */
    REGM;

    public String value() {
        return name();
    }

    public static MailType1Code fromValue(String v) {
        return valueOf(v);
    }

}
