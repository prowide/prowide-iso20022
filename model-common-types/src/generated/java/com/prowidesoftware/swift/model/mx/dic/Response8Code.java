
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Response8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRCS"/>
 *     <enumeration value="UNPR"/>
 *     <enumeration value="UNRV"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="TECH"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Response8Code")
@XmlEnum
public enum Response8Code {


    /**
     * Advice message is processed.
     * 
     */
    PRCS,

    /**
     * Advice message could not be processed.
     * 
     */
    UNPR,

    /**
     * Service is under review.
     * 
     */
    UNRV,

    /**
     * Service was rejected.
     * 
     */
    REJT,

    /**
     * Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).
     * 
     */
    TECH,

    /**
     * Other type of processing result defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of processing result defined at private level.
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static Response8Code fromValue(String v) {
        return valueOf(v);
    }

}
