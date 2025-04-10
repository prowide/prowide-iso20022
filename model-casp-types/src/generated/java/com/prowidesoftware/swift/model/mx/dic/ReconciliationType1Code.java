
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReconciliationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AREC"/>
 *     <enumeration value="ASYN"/>
 *     <enumeration value="PREC"/>
 *     <enumeration value="SREC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReconciliationType1Code")
@XmlEnum
public enum ReconciliationType1Code {


    /**
     * Reconciliation between the POI and one or several Acquirers only. There is no reconciliation between the Sale System and the POI System.
     * 
     */
    AREC,

    /**
     * Reconciliation and closure of the current period, with synchronisation of the reconciliation between the POI and Acquirers.
     * 
     */
    ASYN,

    /**
     * Request result of a previous reconciliation.
     * 
     */
    PREC,

    /**
     * Reconciliation with closure of the current period, without	any Acquirers synchronisation.
     * 
     */
    SREC;

    public String value() {
        return name();
    }

    public static ReconciliationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
