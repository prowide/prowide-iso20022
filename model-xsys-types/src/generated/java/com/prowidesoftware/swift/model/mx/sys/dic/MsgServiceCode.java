
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgServiceCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MsgServiceCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="InterAct"/>
 *     <enumeration value="FileAct"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MsgServiceCode")
@XmlEnum
public enum MsgServiceCode {

    @XmlEnumValue("InterAct")
    INTER_ACT("InterAct"),
    @XmlEnumValue("FileAct")
    FILE_ACT("FileAct");
    private final String value;

    MsgServiceCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MsgServiceCode fromValue(String v) {
        for (MsgServiceCode c: MsgServiceCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
