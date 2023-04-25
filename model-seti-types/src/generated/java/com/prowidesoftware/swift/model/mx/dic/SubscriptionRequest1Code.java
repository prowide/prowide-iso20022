
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionRequest1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SubscriptionRequest1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SNAP"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="UNSU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
