
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AMFDoctrine1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AMFDoctrine1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMF1"/>
 *     <enumeration value="AMF3"/>
 *     <enumeration value="AMF2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AMFDoctrine1Code")
@XmlEnum
public enum AMFDoctrine1Code {


    /**
     * Approach based on a significantly engaging methodology.
     * 
     */
    @XmlEnumValue("AMF1")
    AMF_1("AMF1"),

    /**
     * Approach not meeting central communication standards or based on limited communication standards.
     * 
     */
    @XmlEnumValue("AMF3")
    AMF_3("AMF3"),

    /**
     * Approach based on a non-significantly engaging methodology.
     * 
     */
    @XmlEnumValue("AMF2")
    AMF_2("AMF2");
    private final String value;

    AMFDoctrine1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AMFDoctrine1Code fromValue(String v) {
        for (AMFDoctrine1Code c: AMFDoctrine1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
