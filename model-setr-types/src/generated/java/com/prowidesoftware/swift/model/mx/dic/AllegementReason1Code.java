
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllegementReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllegementReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALG1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AllegementReason1Code")
@XmlEnum
public enum AllegementReason1Code {


    /**
     * Allegement has been received and no match could be found.
     * 
     */
    @XmlEnumValue("ALG1")
    ALG_1("ALG1");
    private final String value;

    AllegementReason1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllegementReason1Code fromValue(String v) {
        for (AllegementReason1Code c: AllegementReason1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
