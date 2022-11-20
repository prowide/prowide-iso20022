
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AMFDoctrine1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AMFDoctrine1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMF1"/&gt;
 *     &lt;enumeration value="AMF3"/&gt;
 *     &lt;enumeration value="AMF2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
