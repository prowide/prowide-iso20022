
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RT11"/&gt;
 *     &lt;enumeration value="RT12"/&gt;
 *     &lt;enumeration value="RT13"/&gt;
 *     &lt;enumeration value="RT14"/&gt;
 *     &lt;enumeration value="RT15"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
