
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InRepairStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InRepairStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InRepairStatusReason1Code")
@XmlEnum
public enum InRepairStatusReason1Code {


    /**
     * Order has been accepted and centralised before the cut off, but with different sales agreement than the one provided in the order.
     * 
     */
    COMA;

    public String value() {
        return name();
    }

    public static InRepairStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
