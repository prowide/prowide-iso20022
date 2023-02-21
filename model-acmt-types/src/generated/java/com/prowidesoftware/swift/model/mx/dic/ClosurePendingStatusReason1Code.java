
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClosurePendingStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClosurePendingStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLOS"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClosurePendingStatusReason1Code")
@XmlEnum
public enum ClosurePendingStatusReason1Code {


    /**
     * Account closing is in process.
     * 
     */
    CLOS,

    /**
     * Account will be closed when conditions are met.
     * 
     */
    PEND;

    public String value() {
        return name();
    }

    public static ClosurePendingStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
