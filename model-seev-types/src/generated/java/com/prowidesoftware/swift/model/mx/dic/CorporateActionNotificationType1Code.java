
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionNotificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionNotificationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEWM"/&gt;
 *     &lt;enumeration value="REPL"/&gt;
 *     &lt;enumeration value="RMDR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionNotificationType1Code")
@XmlEnum
public enum CorporateActionNotificationType1Code {


    /**
     * New notification.
     * 
     */
    NEWM,

    /**
     * Notification replacing a previously sent notification.
     * 
     */
    REPL,

    /**
     * Notification sent as a reminder of an event taking place.
     * 
     */
    RMDR;

    public String value() {
        return name();
    }

    public static CorporateActionNotificationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
