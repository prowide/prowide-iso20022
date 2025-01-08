
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RequestType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RT01"/>
 *     <enumeration value="RT02"/>
 *     <enumeration value="RT03"/>
 *     <enumeration value="RT04"/>
 *     <enumeration value="RT05"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RequestType1Code")
@XmlEnum
public enum RequestType1Code {


    /**
     * Type is a request to release the pending transactions.
     * 
     */
    @XmlEnumValue("RT01")
    RT_01("RT01"),

    /**
     * Type is a request to hold normal transactions.
     * 
     */
    @XmlEnumValue("RT02")
    RT_02("RT02"),

    /**
     * Type is a request to cancellation a transaction.
     * 
     */
    @XmlEnumValue("RT03")
    RT_03("RT03"),

    /**
     * Type is a request to change the sequence of the transactions.
     * 
     */
    @XmlEnumValue("RT04")
    RT_04("RT04"),

    /**
     * Type is a request to release the suspicious transactions.
     * 
     */
    @XmlEnumValue("RT05")
    RT_05("RT05");
    private final String value;

    RequestType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestType1Code fromValue(String v) {
        for (RequestType1Code c: RequestType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
