
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivationStateCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivationStateCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Activated"/&gt;
 *     &lt;enumeration value="ActivatedForInputOnly"/&gt;
 *     &lt;enumeration value="ActivatedForOutputOnly"/&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
