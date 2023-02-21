
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Response1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DECL"/&gt;
 *     &lt;enumeration value="APPR"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="TECH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Response1Code")
@XmlEnum
public enum Response1Code {


    /**
     * Service is declined.
     * 
     */
    DECL,

    /**
     * Service has been successfuly provided.
     * 
     */
    APPR,

    /**
     * Service has been partialy provided.
     * 
     */
    PART,

    /**
     * Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).
     * 
     */
    TECH;

    public String value() {
        return name();
    }

    public static Response1Code fromValue(String v) {
        return valueOf(v);
    }

}
