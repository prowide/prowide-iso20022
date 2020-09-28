
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotAvailable1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotAvailable1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NTAV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotAvailable1Code")
@XmlEnum
public enum NotAvailable1Code {


    /**
     * Not available (N/A).
     * 
     */
    NTAV;

    public String value() {
        return name();
    }

    public static NotAvailable1Code fromValue(String v) {
        return valueOf(v);
    }

}
