
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MailType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AIRM"/&gt;
 *     &lt;enumeration value="ORDM"/&gt;
 *     &lt;enumeration value="REGM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
