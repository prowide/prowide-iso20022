
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResultCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Success"/>
 *     <enumeration value="Failure"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResultCode")
@XmlEnum
public enum ResultCode {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Failure")
    FAILURE("Failure");
    private final String value;

    ResultCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultCode fromValue(String v) {
        for (ResultCode c: ResultCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
