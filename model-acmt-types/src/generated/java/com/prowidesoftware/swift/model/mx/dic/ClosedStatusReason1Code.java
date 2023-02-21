
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClosedStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClosedStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASIN"/&gt;
 *     &lt;enumeration value="CLIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClosedStatusReason1Code")
@XmlEnum
public enum ClosedStatusReason1Code {


    /**
     * Account is closed, following an instruction from the account servicer to close the account.
     * 
     */
    ASIN,

    /**
     * Account is closed, following an instruction from the client, or an authorised party, to close the account.
     * 
     */
    CLIN;

    public String value() {
        return name();
    }

    public static ClosedStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
