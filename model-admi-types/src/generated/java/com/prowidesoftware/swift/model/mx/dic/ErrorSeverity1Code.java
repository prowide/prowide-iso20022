
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorSeverity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorSeverity1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FATL"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorSeverity1Code")
@XmlEnum
public enum ErrorSeverity1Code {


    /**
     * The error is considered fatal.
     * 
     */
    FATL,

    /**
     * The error is considered transient.
     * 
     */
    TRAN;

    public String value() {
        return name();
    }

    public static ErrorSeverity1Code fromValue(String v) {
        return valueOf(v);
    }

}
