
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionNotificationType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionNotificationType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WITH"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionNotificationType2Code")
@XmlEnum
public enum CorporateActionNotificationType2Code {


    /**
     * Notification sent to void a previously sent notification due to the withdrawal of the event by the issuer.
     * 
     */
    WITH,

    /**
     * Notification requesting the cancellation of a previously sent notification.
     * 
     */
    CANC;

    public String value() {
        return name();
    }

    public static CorporateActionNotificationType2Code fromValue(String v) {
        return valueOf(v);
    }

}
