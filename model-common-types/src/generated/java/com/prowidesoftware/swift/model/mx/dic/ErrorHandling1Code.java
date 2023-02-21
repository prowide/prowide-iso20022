
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorHandling1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorHandling1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="X020"/&gt;
 *     &lt;enumeration value="X030"/&gt;
 *     &lt;enumeration value="X050"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorHandling1Code")
@XmlEnum
public enum ErrorHandling1Code {


    /**
     * Specifies the error code when the data requested are not yet available.
     * 
     */
    @XmlEnumValue("X020")
    X_020("X020"),

    /**
     * Specifies the error code when the data requested generates a message size that exceed the processing capacity.
     * 
     */
    @XmlEnumValue("X030")
    X_030("X030"),

    /**
     * Specifies the error code when the data requested have not been found.
     * 
     */
    @XmlEnumValue("X050")
    X_050("X050");
    private final String value;

    ErrorHandling1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorHandling1Code fromValue(String v) {
        for (ErrorHandling1Code c: ErrorHandling1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
