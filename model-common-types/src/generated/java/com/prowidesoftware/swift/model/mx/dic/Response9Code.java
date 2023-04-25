
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Response9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APPR"/>
 *     <enumeration value="DECL"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="SUSP"/>
 *     <enumeration value="TECH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Response9Code")
@XmlEnum
public enum Response9Code {


    /**
     * Service has been successfuly provided.
     * 
     */
    APPR,

    /**
     * Service is declined.
     * 
     */
    DECL,

    /**
     * Service has been partialy provided.
     * 
     */
    PART,

    /**
     * Transaction has been received but hasn't been processed.
     * 
     */
    SUSP,

    /**
     * Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).
     * 
     */
    TECH;

    public String value() {
        return name();
    }

    public static Response9Code fromValue(String v) {
        return valueOf(v);
    }

}
