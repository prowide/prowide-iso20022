
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LockStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LockStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOCK"/&gt;
 *     &lt;enumeration value="ULCK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LockStatus1Code")
@XmlEnum
public enum LockStatus1Code {


    /**
     * Party has been locked for operations.
     * 
     */
    LOCK,

    /**
     * Party is ready for operations.
     * 
     */
    ULCK;

    public String value() {
        return name();
    }

    public static LockStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
