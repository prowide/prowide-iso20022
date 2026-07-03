
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnedStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnedStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NARR"/&gt;
 *     &lt;enumeration value="PROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReturnedStatus1Code")
@XmlEnum
public enum ReturnedStatus1Code {


    /**
     * See narrative field for reason.
     * 
     */
    NARR,

    /**
     * Shares returned due to prorated acceptance.
     * 
     */
    PROR;

    public String value() {
        return name();
    }

    public static ReturnedStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
