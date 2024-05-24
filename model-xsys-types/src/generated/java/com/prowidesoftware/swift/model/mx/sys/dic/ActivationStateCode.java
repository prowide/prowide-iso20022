
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivationStateCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActivationStateCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Activated"/>
 *     <enumeration value="ActivatedForInputOnly"/>
 *     <enumeration value="ActivatedForOutputOnly"/>
 *     <enumeration value="Disabled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActivationStateCode")
@XmlEnum
public enum ActivationStateCode {

    @XmlEnumValue("Activated")
    ACTIVATED("Activated"),
    @XmlEnumValue("ActivatedForInputOnly")
    ACTIVATED_FOR_INPUT_ONLY("ActivatedForInputOnly"),
    @XmlEnumValue("ActivatedForOutputOnly")
    ACTIVATED_FOR_OUTPUT_ONLY("ActivatedForOutputOnly"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    ActivationStateCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivationStateCode fromValue(String v) {
        for (ActivationStateCode c: ActivationStateCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
