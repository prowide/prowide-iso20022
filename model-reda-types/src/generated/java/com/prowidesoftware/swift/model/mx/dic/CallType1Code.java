
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOTT"/&gt;
 *     &lt;enumeration value="PRTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallType1Code")
@XmlEnum
public enum CallType1Code {


    /**
     * Type of execution of the call feature is a lottery.
     * 
     */
    LOTT,

    /**
     * Type of execution of the call feature is pro-rata.
     * 
     */
    PRTA;

    public String value() {
        return name();
    }

    public static CallType1Code fromValue(String v) {
        return valueOf(v);
    }

}
