
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RequestType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RT11"/>
 *     <enumeration value="RT12"/>
 *     <enumeration value="RT13"/>
 *     <enumeration value="RT14"/>
 *     <enumeration value="RT15"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RequestType2Code")
@XmlEnum
public enum RequestType2Code {


    /**
     * Type is an enquiry on the bank's position.
     * 
     */
    @XmlEnumValue("RT11")
    RT_11("RT11"),

    /**
     * Type is an enquiry on a specific transaction.
     * 
     */
    @XmlEnumValue("RT12")
    RT_12("RT12"),

    /**
     * Type is an enquiry on a queued transaction.
     * 
     */
    @XmlEnumValue("RT13")
    RT_13("RT13"),

    /**
     * Type is an enquiry on a suspicious transaction.
     * 
     */
    @XmlEnumValue("RT14")
    RT_14("RT14"),

    /**
     * Type is an enquiry on pending inward credits.
     * 
     */
    @XmlEnumValue("RT15")
    RT_15("RT15");
    private final String value;

    RequestType2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestType2Code fromValue(String v) {
        for (RequestType2Code c: RequestType2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
