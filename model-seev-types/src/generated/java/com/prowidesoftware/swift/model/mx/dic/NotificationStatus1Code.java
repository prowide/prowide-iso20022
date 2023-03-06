
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="PREC"/&gt;
 *     &lt;enumeration value="PREU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationStatus1Code")
@XmlEnum
public enum NotificationStatus1Code {


    /**
     * The notification contains all the details.
     * 
     */
    COMP,

    /**
     * Notification may not contain complete details, however, the occurrence of the event has been confirmed by the issuer or other official source.
     * 
     */
    PREC,

    /**
     * Notification may not contain complete details as the occurrence of the event has not been confirmed by the issuer or other official source at the time the notification was sent.
     * 
     */
    PREU;

    public String value() {
        return name();
    }

    public static NotificationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
