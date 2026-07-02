
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgServiceCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MsgServiceCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="InterAct"/&gt;
 *     &lt;enumeration value="FileAct"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
