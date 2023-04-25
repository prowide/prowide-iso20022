
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllegementReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AllegementReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALG1"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
