
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionRequest1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionRequest1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SNAP"/&gt;
 *     &lt;enumeration value="SUBS"/&gt;
 *     &lt;enumeration value="UNSU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionRequest1Code")
@XmlEnum
public enum SubscriptionRequest1Code {


    /**
     * Specifies that the request is to subscribe to snapshots.
     * 
     */
    SNAP,

    /**
     * Specifies that the request is to subscribe to snapshots and updates.
     * 
     */
    SUBS,

    /**
     * Specifies that the request is to disable the previous snapshot subscription and to update the request (unsubscribe).
     * 
     */
    UNSU;

    public String value() {
        return name();
    }

    public static SubscriptionRequest1Code fromValue(String v) {
        return valueOf(v);
    }

}
