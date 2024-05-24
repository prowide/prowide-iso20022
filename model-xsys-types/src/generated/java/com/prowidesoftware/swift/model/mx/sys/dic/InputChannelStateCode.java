
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputChannelStateCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InputChannelStateCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Open"/>
 *     <enumeration value="Closed"/>
 *     <enumeration value="Deleted"/>
 *     <enumeration value="Locked"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InputChannelStateCode")
@XmlEnum
public enum InputChannelStateCode {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Locked")
    LOCKED("Locked");
    private final String value;

    InputChannelStateCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InputChannelStateCode fromValue(String v) {
        for (InputChannelStateCode c: InputChannelStateCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
